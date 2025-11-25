

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class 챌린지제조기 {
    private static final String MEMBER_FILE = "회원관리.csv";
    private static final String RENTALS_FILE = "rentals.csv";
    private static final String OUTPUT_FILE = "challenges.csv";
    private static final int RECORD_COUNT = 50;
    private static final String[] TYPES = {"월간", "연간"};

    public static void main(String[] args) {
        try {
            // 1️⃣ 회원목록 읽기
            List<String> memberIds = readColumn(MEMBER_FILE, 0);

            // 2️⃣ rentals.csv → 회원별 대여일 Map
            Map<String, List<LocalDate>> memberRentalDates = loadMemberRentalDates(RENTALS_FILE);

            // 3️⃣ 챌린지 CSV 생성
            try (BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(OUTPUT_FILE), StandardCharsets.UTF_8))) {

                writer.write("챌린지번호,회원번호,종류,목표권수,시작일,종료일,실제읽은권수");
                writer.newLine();

                for (int i = 1; i <= RECORD_COUNT; i++) {
                    String challengeNo = String.format("CHAL%010d", i);
                    String memberId = pickRandom(memberIds);
                    String type = pickRandom(Arrays.asList(TYPES));
                    int targetCount = randBetween(1, 20);
                    LocalDate startDate = randomPastDate();

                    // 종료일 계산
                    LocalDate endDate = type.equals("월간")
                            ? startDate.plusDays(30)
                            : startDate.plusDays(365);

                    // 해당 회원의 대여일 리스트 가져오기
                    List<LocalDate> rentalDates = memberRentalDates.getOrDefault(memberId, new ArrayList<>());

                    // 시작일 ~ 종료일 범위 내 count
                    int countInRange = 0;
                    for (LocalDate rentalDate : rentalDates) {
                        if ((rentalDate.isEqual(startDate) || rentalDate.isAfter(startDate))
                                && (rentalDate.isEqual(endDate) || rentalDate.isBefore(endDate))) {
                            countInRange++;
                        }
                    }

                    // 실제읽은권수는 목표권수 이내
                    int actualReadCount = Math.min(countInRange, targetCount);

                    writer.write(String.join(",",
                            challengeNo,
                            memberId,
                            type,
                            String.valueOf(targetCount),
                            startDate.toString(),
                            endDate.toString(),
                            String.valueOf(actualReadCount)
                    ));
                    writer.newLine();
                }
            }

            System.out.println("✅ challenges.csv 생성 완료!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 1️⃣ 회원관리.csv 읽기
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
                    result.add(parts[columnIndex].trim());
                }
            }
        }
        return result;
    }

    // 2️⃣ rentals.csv → 회원별 대여일 리스트 Map
    private static Map<String, List<LocalDate>> loadMemberRentalDates(String fileName) throws IOException {
        Map<String, List<LocalDate>> dateMap = new HashMap<>();
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
                if (parts.length > 3) {
                    String memberId = parts[1].trim();
                    String dateStr = parts[3].trim();
                    LocalDate rentalDate = LocalDate.parse(dateStr);

                    dateMap.computeIfAbsent(memberId, k -> new ArrayList<>()).add(rentalDate);
                }
            }
        }
        return dateMap;
    }

    // 랜덤 pick
    private static String pickRandom(List<String> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }

    // 랜덤 날짜
    private static LocalDate randomPastDate() {
        LocalDate today = LocalDate.now();
        long daysBack = randBetween(0, 365);
        return today.minusDays(daysBack);
    }

    // 랜덤 범위
    private static int randBetween(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
