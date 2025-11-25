import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class 대여제조기 {
    private static final String MEMBER_FILE = "회원관리.csv";
    private static final String BOOK_FILE = "도서데이터.csv";
    private static final String OUTPUT_FILE = "rentals.csv";
    private static final int RECORD_COUNT = 300;

    // 도서별 예약 달력
    private static final Map<String, List<DateRange>> bookReservations = new HashMap<>();

    public static void main(String[] args) {
        try {
            // 1️⃣ 회원번호 리스트
            List<String> memberIds = readColumn(MEMBER_FILE, 0);

            // 2️⃣ 도서번호 리스트 (숫자면 S포맷 붙여서)
            List<String> bookIds = readBookIds(BOOK_FILE);

            // 3️⃣ rentals.csv 생성
            try (BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(OUTPUT_FILE), StandardCharsets.UTF_8))) {

                // CSV 헤더
                writer.write("대여번호,회원번호,도서번호,대여일,반납기한,반납일,반납상태,연체일수,연장횟수,별점");
                writer.newLine();

                int attempts = 0;
                int generated = 0;

                LocalDate cutoffDate = LocalDate.of(2025, 7, 10);
                LocalDate today = LocalDate.now();

                while (generated < RECORD_COUNT && attempts < RECORD_COUNT * 20) {
                    attempts++;

                    String rentalNo = String.format("RENT%010d", generated + 1);
                    String memberId = pickRandom(memberIds);
                    String bookId = pickRandom(bookIds);
                    int extendCount = randBetween(0, 2);
                    int score = randBetween(1, 10);

                    // ✅ 대여일 생성: 2024-07-01 ~ 오늘까지 랜덤
                    LocalDate rentalDate = randomRentalDate();
                    LocalDate dueDate = rentalDate.plusDays(14 + (extendCount * 7));

                    // ✅ 상태/반납일/연체일수 결정
                    String status;
                    LocalDate returnDate = null;
                    String overdueDaysStr = "";

                    if (rentalDate.isAfter(cutoffDate)) {
                        // 7월 10일 이후 대여 → 무조건 미반납
                        status = "미반납";
                        returnDate = null;
                        overdueDaysStr = "";
                    } else {
                        // 정상/연체 분포
                        int randPercent = ThreadLocalRandom.current().nextInt(100);
                        if (randPercent < 80) {
                            // 정상
                            long daysBetween = dueDate.toEpochDay() - rentalDate.toEpochDay();
                            returnDate = rentalDate.plusDays(randBetween(0, (int) daysBetween));
                            status = "정상";
                            overdueDaysStr = "0";
                        } else {
                            // 연체
                            returnDate = dueDate.plusDays(randBetween(1, 10));
                            status = "연체";
                            overdueDaysStr = String.valueOf((int) (returnDate.toEpochDay() - dueDate.toEpochDay()));
                        }
                    }

                    // ✅ 예약 겹침 검사 (미반납은 예약 안 막음)
                    if (!status.equals("미반납")) {
                        DateRange newRange = new DateRange(rentalDate, returnDate);
                        if (!isAvailable(bookId, newRange)) {
                            continue; // 겹치면 재시도
                        }
                        bookReservations.computeIfAbsent(bookId, k -> new ArrayList<>()).add(newRange);
                    }

                    // ✅ CSV 출력
                    writer.write(String.join(",",
                            rentalNo,
                            memberId,
                            bookId.trim(),
                            rentalDate.toString(),
                            dueDate.toString(),
                            (returnDate != null ? returnDate.toString() : ""),
                            status,
                            overdueDaysStr,
                            String.valueOf(extendCount),
                            String.valueOf(score)
                    ));
                    writer.newLine();

                    generated++;
                }

                System.out.println("✅ rentals.csv 생성 완료! 총 생성 건수: " + generated);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ✅ 예약 가능한 최소 대여일
    private static LocalDate getNextAvailableDate(String bookId) {
        List<DateRange> reservations = bookReservations.getOrDefault(bookId, new ArrayList<>());
        if (reservations.isEmpty()) {
            return LocalDate.of(2024, 7, 1);
        }
        LocalDate maxEnd = reservations.stream()
                .map(r -> r.end)
                .max(LocalDate::compareTo)
                .orElse(LocalDate.of(2024, 7, 1));
        return maxEnd.plusDays(1);
    }

    // ✅ 랜덤 대여일 생성 (2024-07-01 ~ 오늘)
    private static LocalDate randomRentalDate() {
        LocalDate start = LocalDate.of(2024, 7, 1);
        LocalDate end = LocalDate.now();
        long daysBetween = end.toEpochDay() - start.toEpochDay();
        return start.plusDays(randBetween(0, (int) daysBetween));
    }

    // ✅ 예약 겹침 검사
    private static boolean isAvailable(String bookId, DateRange newRange) {
        List<DateRange> reservations = bookReservations.getOrDefault(bookId, Collections.emptyList());
        for (DateRange existing : reservations) {
            if (existing.overlaps(newRange)) {
                return false;
            }
        }
        return true;
    }

    // ✅ DateRange 클래스
    private static class DateRange {
        LocalDate start;
        LocalDate end;
        DateRange(LocalDate start, LocalDate end) {
            this.start = start;
            this.end = end;
        }
        boolean overlaps(DateRange other) {
            return !(this.end.isBefore(other.start) || this.start.isAfter(other.end));
        }
    }

    // ✅ CSV 읽기
    private static List<String> readColumn(String fileName, int columnIndex) throws IOException {
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            String line;
            boolean headerSkipped = false;
            while ((line = reader.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length > columnIndex) {
                    result.add(parts[columnIndex].trim().replaceAll("^\"|\"$", ""));
                }
            }
        }
        return result;
    }

    // ✅ 도서번호 읽기 (숫자면 S포맷 붙여서)
    private static List<String> readBookIds(String fileName) throws IOException {
        List<String> bookIds = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            String line;
            boolean headerSkipped = false;
            while ((line = reader.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length > 0) {
                    String rawId = parts[0].trim().replaceAll("^\"|\"$", "");
                    String bookId = rawId.matches("^S\\d+$") ? rawId
                            : String.format("S%06d", Integer.parseInt(rawId));
                    bookIds.add(bookId);
                }
            }
        }
        return bookIds;
    }

    private static String pickRandom(List<String> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }

    private static int randBetween(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
