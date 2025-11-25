
import com.opencsv.CSVWriter;
import org.w3c.dom.*;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.*;
import java.util.*;

public class Main {
    private static final String API_KEY = "005412a4989a6056596f31b09543068bcfd9e3554278d8bc38debd63db33c0ee";
    private static final String SEARCH_KEYWORD = "의";  // ✅ 많이 걸리는 안전 키워드
    private static final int PAGE_SIZE = 100;

    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();
        Set<String> isbnSet = new HashSet<>();

        try {
            System.out.println("📌 [START] 국립중앙도서관 데이터 수집");
            System.out.println("📌 검색어: '" + SEARCH_KEYWORD + "' | 페이지당: " + PAGE_SIZE + "권");

            // ✅ 첫 페이지 → 총 건수 파악
            String firstXml = fetchXml(makeApiUrl(1), 1);
            int total = parseTotalCount(firstXml);
            int totalPage = (total + PAGE_SIZE - 1) / PAGE_SIZE;

            System.out.println("✅ 총 건수: " + total);
            System.out.println("✅ 예상 페이지 수: " + totalPage);

            if (totalPage > 100) {
                totalPage = 100;
                System.out.println("⚠️ 너무 많아서 100페이지까지만 수집!");
            }

            // ✅ 첫 페이지 파싱
            addUniqueBooks(allBooks, isbnSet, parseBooks(firstXml));
            System.out.printf("✅ 페이지 %d / %d 완료 (누적 %d권)%n", 1, totalPage, allBooks.size());

            // ✅ 나머지 페이지
            for (int pageNum = 2; pageNum <= totalPage; pageNum++) {
                Thread.sleep(300);
                String xml = fetchXml(makeApiUrl(pageNum), pageNum);
                addUniqueBooks(allBooks, isbnSet, parseBooks(xml));
                System.out.printf("✅ 페이지 %d / %d 완료 (누적 %d권)%n", pageNum, totalPage, allBooks.size());
            }

            // ✅ CSV 출력
            writeCsv(allBooks, "books.csv");
            System.out.println("🎯 [SUCCESS] CSV 생성 완료! (총 " + allBooks.size() + "권)");

        } catch (Exception e) {
            System.out.println("❌ 오류 발생!");
            e.printStackTrace();
        }
    }

    private static String makeApiUrl(int pageNum) throws Exception {
        String encodedKeyword = URLEncoder.encode(SEARCH_KEYWORD, "UTF-8");
        return String.format(
            "https://www.nl.go.kr/NL/search/openApi/searchKolisNet.do?key=%s&kwd=%s&pageNum=%d&pageSize=%d&apiType=xml",
            API_KEY, encodedKeyword, pageNum, PAGE_SIZE
        );
    }

    private static String fetchXml(String urlStr, int pageNum) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        reader.close();
        conn.disconnect();

        String rawXml = sb.toString();

        // ✅ 1️⃣ 로그 저장
        saveRawXml(rawXml, "page_" + pageNum + ".xml");

        // ✅ 2️⃣ & 기호 엔티티 깨짐 방어
        rawXml = rawXml.replaceAll("&(?![a-zA-Z]{2,6};|#\\d{2,5};)", "&amp;");

        // ✅ 3️⃣ 제어문자 제거
        rawXml = rawXml.replaceAll("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F]", "");

        // ✅ 4️⃣ 이상한 태그 이름, 특수문자 태그 제거 (선택)
        rawXml = rawXml.replaceAll("<[^<>]*[^a-zA-Z0-9가-힣<>/ ]+[^<>]*>", "");

        return rawXml;
    }

    private static void saveRawXml(String content, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), "UTF-8"))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("❌ 원본 XML 저장 실패: " + e.getMessage());
        }
    }

    private static int parseTotalCount(String xml) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));
        Document doc = builder.parse(is);
        String totalStr = doc.getElementsByTagName("total").item(0).getTextContent();
        return Integer.parseInt(totalStr);
    }

    private static List<Book> parseBooks(String xml) throws Exception {
        List<Book> books = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));
        Document doc = builder.parse(is);

        NodeList docNodes = doc.getElementsByTagName("item");
        for (int i = 0; i < docNodes.getLength(); i++) {
            Element el = (Element) docNodes.item(i);

            String title = getText(el, "title_info");
            String author = getText(el, "author_info");
            String isbn = getText(el, "isbn");
            String publisher = getText(el, "pub_info");
            String pubYear = getText(el, "pub_year_info");
            String category = getText(el, "type_name");
            String kdcName = getText(el, "kdc_name_1s");

            books.add(new Book(title, author, isbn, publisher, pubYear, category, kdcName));
        }

        return books;
    }

    private static String getText(Element parent, String tag) {
        NodeList nl = parent.getElementsByTagName(tag);
        if (nl.getLength() > 0 && nl.item(0).getTextContent() != null) {
            return nl.item(0).getTextContent().trim();
        }
        return "";
    }

    private static void addUniqueBooks(List<Book> allBooks, Set<String> isbnSet, List<Book> newBooks) {
        for (Book book : newBooks) {
            String isbn = book.getIsbn();
            if (!isbn.isEmpty() && isbnSet.contains(isbn)) {
                continue;  // 중복 제거
            }
            isbnSet.add(isbn);
            allBooks.add(book);
        }
    }

    private static void writeCsv(List<Book> books, String filename) throws Exception {
        try (CSVWriter writer = new CSVWriter(new OutputStreamWriter(new FileOutputStream(filename), "UTF-8"))) {
            writer.writeNext(new String[]{
                "제목", "저자", "ISBN", "발행자", "발행년도", "자료유형", "KDC 대분류 명칭"
            });
            for (Book book : books) {
                writer.writeNext(book.toArray());
            }
        }
    }
}