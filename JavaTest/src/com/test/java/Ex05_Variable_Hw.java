package com.test.java;

public class Ex05_Variable_Hw {
	
	public static void main(String[] args) {
		
		        /* 각 자료형(9가지) * 10번씩
					1. 변수 생성
					2. 값 대입
					3. 출력
				
					1.데이터 선정
					-제 몸무게
				
					2. 1의 데이터를 저장할 자료형 선택
					-형태: 정수
					-길이: 1kg ~ 120kg
				
					3. 변수 생성(의미있는 변수명) + 값 대입(리터럴 고민) + 출력 */
		
		//정수형
		//byte 10개
		 // byte 최솟값, 최댓값 출력 (참고용)
        
		
		        // 자료형: byte
		        System.out.println("byte");
		        System.out.println("최솟값: " + Byte.MIN_VALUE);
		        System.out.println("최대값: " + Byte.MAX_VALUE);

		        // 1. 나이
		        // 형태: 정수 / 길이: 0 ~ 127
		        byte age = 34;
		        System.out.println("1.나이: " + age + "살");

		        // 2. 반 번호
		        // 형태: 정수 / 길이: 1 ~ 9
		        byte classNumber = 3;
		        System.out.println("2.반 번호: " + classNumber + "반");

		        // 3. 국어 점수
		        // 형태: 정수 / 길이: 0 ~ 100
		        byte koreanScore = 92;
		        System.out.println("3.국어 점수: " + koreanScore + "점");

		        // 4. 수학 점수
		        // 형태: 정수 / 길이: 0 ~ 100
		        byte mathScore = 100;
		        System.out.println("4.수학 점수: " + mathScore + "점");

		        // 5. 생일 월
		        // 형태: 정수 / 길이: 1 ~ 12
		        byte birthMonth = 4;
		        System.out.println("5.생일 월: " + birthMonth + "월");

		        // 6. 층수
		        // 형태: 정수 / 길이: 1 ~ 63
		        byte floor = 8;
		        System.out.println("6.층수: " + floor + "층");

		        // 7. 교시
		        // 형태: 정수 / 길이: 1 ~ 7
		        byte period = 4;
		        System.out.println("7.교시: " + period + "교시");

		        // 8. 등급
		        // 형태: 정수 / 길이: 1 ~ 9
		        byte grade = 2;
		        System.out.println("8.등급: " + grade + "등급");

		        // 9. 친구 수
		        // 형태: 정수 / 길이: 0 ~ 10
		        byte friendCount = 2;
		        System.out.println("9.친구 수: " + friendCount + "명");

		        // 10. 영화별점
		        // 형태: 정수 / 길이: 0 ~ 5
		        byte movieStar = 5;
		        System.out.println("10.별점: " + movieStar + "점");
		    
		        // 자료형: short
		        System.out.println("\nshort");
		        System.out.println("최솟값: " + Short.MIN_VALUE);
		        System.out.println("최대값: " + Short.MAX_VALUE);

		        // 1. 학교 전체 학생 수
		        // 형태: 정수 / 길이: 0 ~ 2000
		        short totalStudents = 1563;
		        System.out.println("1.학교 전체 학생 수: " + totalStudents + "명");

		        // 2. 하루 방문자 수
		        // 형태: 정수 / 길이: 0 ~ 30000
		        short dailyVisitors = 18250;
		        System.out.println("2.하루 방문자 수: " + dailyVisitors + "명");

		        // 3. 한 달 전기 사용량
		        // 형태: 정수 / 길이: 0 ~ 10000
		        short electricityUsage = 7412;
		        System.out.println("3.전기 사용량: " + electricityUsage + "kWh");

		        // 4. 하프 마라톤 거리 (미터)
		        // 형태: 정수 / 길이: 0 ~ 32767
		        short halfMarathonDistance = 21097;
		        System.out.println("4.하프 마라톤 거리: " + halfMarathonDistance + "m");

		        // 5. 책 페이지 수
		        // 형태: 정수 / 길이: 0 ~ 2000
		        short pageCount = 389;
		        System.out.println("5.책 페이지 수: " + pageCount + "쪽");

		        // 6. 엘리베이터 최대 하중
		        // 형태: 정수 / 길이: 0 ~ 5000
		        short elevatorMaxWeight = 1000;
		        System.out.println("6.엘리베이터 최대 하중: " + elevatorMaxWeight + "kg");

		        // 7. 창고 재고 수량
		        // 형태: 정수 / 길이: 0 ~ 30000
		        short inventoryCount = 28700;
		        System.out.println("7.창고 재고 수량: " + inventoryCount + "개");

		        // 8. 자동차 주행거리
		        // 형태: 정수 / 길이: 0 ~ 30000
		        short carMileage = 16432;
		        System.out.println("8.자동차 주행거리: " + carMileage + "km");

		        // 9. 도서관 책 수
		        // 형태: 정수 / 길이: 0 ~ 30000
		        short libraryBooks = 12654;
		        System.out.println("9.도서관 책 수: " + libraryBooks + "권");

		        // 10. 게임 경험치
		        // 형태: 정수 / 길이: 0 ~ 32000
		        short exp = 31900;
		        System.out.println("10.게임 경험치: " + exp + "EXP");
		        
		     // 자료형: int
		        System.out.println("\nint");
		        System.out.println("최솟값: " + Integer.MIN_VALUE);
		        System.out.println("최대값: " + Integer.MAX_VALUE);

		        // 1. 서울시 인구 수
		        // 형태: 정수 / 길이: 0 ~ 10000000
		        int seoulPopulation = 9500000;
		        System.out.println("1.서울시 인구 수: " + seoulPopulation + "명");

		        // 2. 전국 고등학생 수
		        // 형태: 정수 / 길이: 0 ~ 2000000
		        int highSchoolStudents = 1300000;
		        System.out.println("2.전국 고등학생 수: " + highSchoolStudents + "명");

		        // 3. 대학 수학능력시험 응시자 수
		        // 형태: 정수 / 길이: 0 ~ 700000
		        int csatApplicants = 505000;
		        System.out.println("3.수능 응시자 수: " + csatApplicants + "명");

		        // 4. 서울 지하철 하루 이용객 수
		        // 형태: 정수 / 길이: 0 ~ 10000000
		        int subwayUsers = 7400000;
		        System.out.println("4.서울 지하철 하루 이용객 수: " + subwayUsers + "명");

		        // 5. 카페 프랜차이즈 매장 수
		        // 형태: 정수 / 길이: 0 ~ 150000
		        int cafeStores = 91000;
		        System.out.println("5.프랜차이즈 카페 수: " + cafeStores + "개");

		        // 6. 경찰 연간 112 신고 접수 건수
		        // 형태: 정수 / 길이: 0 ~ 30000000
		        int emergencyCalls = 21100000;
		        System.out.println("6.연간 112 신고 건수: " + emergencyCalls + "건");

		        // 7. 연간 출생아 수
		        // 형태: 정수 / 길이: 0 ~ 500000
		        int annualBirths = 230000;
		        System.out.println("7.연간 출생아 수: " + annualBirths + "명");

		        // 8. 국내 인터넷 쇼핑 거래 건수
		        // 형태: 정수 / 길이: 0 ~ 2000000000
		        int onlineOrders = 1720000000;
		        System.out.println("8.인터넷 쇼핑 거래 수: " + onlineOrders + "건");

		        // 9. 아파트 평균 분양가 (원)
		        // 형태: 정수 / 길이: 0 ~ 2000000000
		        int apartmentPrice = 457000000;
		        System.out.println("9.아파트 평균 분양가: " + apartmentPrice + "원");

		        // 10. 고등학교 교사 수
		        // 형태: 정수 / 길이: 0 ~ 100000
		        int highSchoolTeachers = 95000;
		        System.out.println("10.고등학교 교사 수: " + highSchoolTeachers + "명");
		
		     // 자료형: char
		        System.out.println("\nchar");
		        System.out.println("최솟값: " + (int) Character.MIN_VALUE);
		        System.out.println("최대값: " + (int) Character.MAX_VALUE);

		        // 1. 성별
		        // 형태: 문자 / 값: M(남자), F(여자)
		        char gender = 'M';
		        System.out.println("1.성별: " + gender);

		        // 2. 혈액형
		        // 형태: 문자 / 값: A, B, O, AB 중 하나
		        char bloodType = 'O';
		        System.out.println("2.혈액형: " + bloodType);

		        // 3. 학점
		        // 형태: 문자 / 값: A ~ F
		        char finalGrade = 'B';
		        System.out.println("3.학점: " + finalGrade);

		        // 4. 출석 상태
		        // 형태: 문자 / 값: P(출석), A(결석)
		        char attendance = 'P';
		        System.out.println("4.출석 상태: " + attendance);

		        // 5. 운전면허 등급
		        // 형태: 문자 / 값: 1(1종), 2(2종)
		        char licenseType = '2';
		        System.out.println("5.운전면허 등급: " + licenseType + "종");

		        // 6. 회원 등급
		        // 형태: 문자 / 값: V(일반), G(골드), P(플래티넘)
		        char membershipLevel = 'G';
		        System.out.println("6.회원 등급: " + membershipLevel);

		        // 7. 음식 평가
		        // 형태: 문자 / 값: S(최고), A(좋음), B(보통), C(별로)
		        char foodRating = 'S';
		        System.out.println("7.음식 평가: " + foodRating);

		        // 8. 전자제품 에너지 등급
		        // 형태: 문자 / 값: A ~ D
		        char energyGrade = 'A';
		        System.out.println("8.에너지 등급: " + energyGrade);

		        // 9. 한국어 초성
		        // 형태: 문자 / 값: ㄱ ~ ㅎ 중 하나
		        char koreanInitial = 'ㅅ';
		        System.out.println("9.이름 초성: " + koreanInitial);

		        // 10. 메뉴 선택 코드
		        // 형태: 문자 / 값: A(조회), B(수정), C(삭제), D(추가)
		        char menuCode = 'C';
		        System.out.println("10.선택한 메뉴 코드: " + menuCode);
		        
		  
		        // 자료형: long
		        System.out.println("\nlong");
		        System.out.println("최솟값: " + Long.MIN_VALUE);
		        System.out.println("최대값: " + Long.MAX_VALUE);

		        // 1. 대한민국 연간 예산
		        // 형태: 정수 / 길이: 0 ~ 700조
		        long nationalBudget = 670000000000000L;
		        System.out.println("1.연간 국가 예산: " + nationalBudget + "원");

		        // 2. 국민연금 적립금
		        // 형태: 정수 / 길이: 0 ~ 1000조
		        long pensionFund = 1000000000000000L;
		        System.out.println("2.국민연금 적립금: " + pensionFund + "원");

		        // 3. 국내 부동산 총액
		        // 형태: 정수 / 길이: 0 ~ 6000조
		        long totalRealEstateValue = 5000000000000000L;
		        System.out.println("3.국내 부동산 총액: " + totalRealEstateValue + "원");

		        // 4. 한국 GDP (국내총생산)
		        // 형태: 정수 / 길이: 0 ~ 2500조
		        long gdp = 2200000000000000L;
		        System.out.println("4.국내총생산(GDP): " + gdp + "원");

		        // 5. 카카오톡 누적 메시지 수
		        // 형태: 정수 / 길이: 0 ~ 1000억 이상
		        long kakaoMessages = 185000000000L;
		        System.out.println("5.카카오톡 누적 메시지 수: " + kakaoMessages + "건");

		        // 6. 네이버 누적 검색 수
		        // 형태: 정수 / 길이: 0 ~ 5000억 이상
		        long naverSearches = 390000000000L;
		        System.out.println("6.네이버 누적 검색 수: " + naverSearches + "건");

		        // 7. 연간 카드 결제 총액
		        // 형태: 정수 / 길이: 0 ~ 1200조
		        long cardSpending = 1100000000000000L;
		        System.out.println("7.연간 카드 결제액: " + cardSpending + "원");

		        // 8. 한국 전체 기업 누적 자산
		        // 형태: 정수 / 길이: 0 ~ 3000조
		        long totalCorporateAssets = 2800000000000000L;
		        System.out.println("8.전체 기업 자산: " + totalCorporateAssets + "원");

		        // 9. 연간 전력 사용량 (kWh)
		        // 형태: 정수 / 길이: 0 ~ 6000억
		        long electricityUsage1 = 540000000000L;
		        System.out.println("9.전력 사용량: " + electricityUsage1 + "kWh");

		        // 10. 누적 인터넷 데이터 전송량 (GB)
		        // 형태: 정수 / 길이: 0 ~ 10000억
		        long internetData = 720000000000L;
		        System.out.println("10.누적 인터넷 데이터 사용량: " + internetData + "GB");
		
		     // 자료형: float
		        System.out.println("\nfloat");
		        System.out.println("최솟값: " + Float.MIN_VALUE);
		        System.out.println("최댓값: " + Float.MAX_VALUE);

		        // 1. 키 (cm)
		        // 형태: 실수 / 길이: 0.0 ~ 250.0
		        float height = 164.3f;
		        System.out.println("1.키: " + height + "cm");

		        // 2. 몸무게 (kg)
		        // 형태: 실수 / 길이: 0.0 ~ 150.0
		        float weight = 57.8f;
		        System.out.println("2.몸무게: " + weight + "kg");

		        // 3. 평균 기온
		        // 형태: 실수 / 길이: -30.0 ~ 45.0
		        float avgTemperature = 23.4f;
		        System.out.println("3.평균 기온: " + avgTemperature + "℃");

		        // 4. 주유 단가 (L당 가격)
		        // 형태: 실수 / 길이: 0.0 ~ 3000.0
		        float fuelPrice = 1793.5f;
		        System.out.println("4.주유 단가: " + fuelPrice + "원");

		        // 5. 평균 시속
		        // 형태: 실수 / 길이: 0.0 ~ 200.0
		        float averageSpeed = 62.7f;
		        System.out.println("5.평균 시속: " + averageSpeed + "km/h");

		        // 6. 기름 사용량 (L)
		        // 형태: 실수 / 길이: 0.0 ~ 100.0
		        float fuelUsed = 34.8f;
		        System.out.println("6.주행 시 사용 연료량: " + fuelUsed + "L");

		        // 7. 하루 물 섭취량 (L)
		        // 형태: 실수 / 길이: 0.0 ~ 5.0
		        float waterIntake = 2.3f;
		        System.out.println("7.하루 물 섭취량: " + waterIntake + "L");

		        // 8. 체지방률 (%)
		        // 형태: 실수 / 길이: 0.0 ~ 100.0
		        float bodyFat = 18.6f;
		        System.out.println("8.체지방률: " + bodyFat + "%");

		        // 9. 평균 수면 시간 (시간)
		        // 형태: 실수 / 길이: 0.0 ~ 24.0
		        float sleepTime = 7.5f;
		        System.out.println("9.평균 수면 시간: " + sleepTime + "시간");

		        // 10. 하루 걸음 수(km 기준)
		        // 형태: 실수 / 길이: 0.0 ~ 20.0
		        float walkDistance = 4.8f;
		        System.out.println("10.하루 걷기 거리: " + walkDistance + "km");
		
		     // 자료형: double
		        System.out.println("\ndouble");
		        System.out.println("최솟값: " + Double.MIN_VALUE);
		        System.out.println("최댓값: " + Double.MAX_VALUE);

		        // 1. 이자율 (금리)
		        // 형태: 실수 / 길이: 0.00 ~ 20.00
		        double interestRate = 3.75;
		        System.out.println("1.이자율: " + interestRate + "%");

		        // 2. 서울 면적 (제곱킬로미터)
		        // 형태: 실수 / 길이: 0.0 ~ 10000.0
		        double seoulArea = 605.21;
		        System.out.println("2.서울 면적: " + seoulArea + "㎢");

		        // 3. 환율 (원/달러)
		        // 형태: 실수 / 길이: 0.0 ~ 2000.0
		        double exchangeRate = 1372.35;
		        System.out.println("3.환율: " + exchangeRate + "원");

		        // 4. 카페인 함량 (mg)
		        // 형태: 실수 / 길이: 0.0 ~ 500.0
		        double caffeineContent = 92.8;
		        System.out.println("4.카페인 함량: " + caffeineContent + "mg");

		        // 5. 평균 학점 (GPA)
		        // 형태: 실수 / 길이: 0.0 ~ 4.5
		        double gpa = 3.89;
		        System.out.println("5.평균 학점: " + gpa);

		        // 6. 학급 평균 점수
		        // 형태: 실수 / 길이: 0.0 ~ 100.0
		        double avgScore = 84.26;
		        System.out.println("6.학급 평균 점수: " + avgScore + "점");

		        // 7. 대기 중 이산화탄소 농도 (ppm)
		        // 형태: 실수 / 길이: 300.0 ~ 500.0
		        double co2Level = 417.55;
		        System.out.println("7.CO₂ 농도: " + co2Level + "ppm");

		        // 8. 국내 GDP 성장률
		        // 형태: 실수 / 길이: -10.0 ~ 10.0
		        double gdpGrowth = 2.56;
		        System.out.println("8.GDP 성장률: " + gdpGrowth + "%");

		        // 9. 인터넷 평균 다운로드 속도 (Mbps)
		        // 형태: 실수 / 길이: 0.0 ~ 2000.0
		        double internetSpeed = 956.74;
		        System.out.println("9.인터넷 속도: " + internetSpeed + "Mbps");

		        // 10. 고도 (산 높이, m)
		        // 형태: 실수 / 길이: 0.0 ~ 4000.0
		        double mountainHeight = 1915.1;
		        System.out.println("10.산의 고도: " + mountainHeight + "m");	
		    
		        
		        // 자료형: boolean
		        System.out.println("\nboolean");
		        System.out.println("값 종류: true / false");

		        // 1. 성인 여부
		        // 형태: 논리 / 값: true(성인), false(미성년자)
		        boolean adult = true;
		        System.out.println("1.성인 여부: " + adult);

		        // 2. 로그인 상태
		        // 형태: 논리 / 값: true(로그인됨), false(로그아웃)
		        boolean login = false;
		        System.out.println("2.로그인 상태: " + login);

		        // 3. 재학 중 여부
		        // 형태: 논리 / 값: true(재학), false(휴학/졸업)
		        boolean enrollment = true;
		        System.out.println("3.재학 중 여부: " + enrollment);

		        // 4. 이메일 인증 완료 여부
		        // 형태: 논리 / 값: true(완료), false(미완료)
		        boolean emailVerification = true;
		        System.out.println("4.이메일 인증 완료: " + emailVerification);

		        // 5. 배송 완료 여부
		        // 형태: 논리 / 값: true(배송됨), false(배송중)
		        boolean delivery = false;
		        System.out.println("5.배송 완료 여부: " + delivery);

		        // 6. 마스크 착용 여부
		        // 형태: 논리 / 값: true(착용), false(미착용)
		        boolean mask = true;
		        System.out.println("6.마스크 착용 여부: " + mask);

		        // 7. 알림 설정 여부
		        // 형태: 논리 / 값: true(ON), false(OFF)
		        boolean notification = true;
		        System.out.println("7.알림 설정: " + notification);

		        // 8. 비밀번호 일치 여부
		        // 형태: 논리 / 값: true(일치), false(불일치)
		        boolean passwordMatch = false;
		        System.out.println("8.비밀번호 일치: " + passwordMatch);

		        // 9. 장바구니 상품 존재
		        // 형태: 논리 / 값: true(있음), false(없음)
		        boolean cartItem = true;
		        System.out.println("9.장바구니 상품 존재: " + cartItem);

		        // 10. 접속 상태
		        // 형태: 논리 / 값: true(접속), false(오프라인)
		        boolean connection = false;
		        System.out.println("10.접속 상태: " + connection);
		
		     // 자료형: String
		        System.out.println("\nString");
		        System.out.println("값 예시: \"문자열\"");

		        // 1. 이름
		        // 형태: 문자열 / 예시: 홍길동
		        String name = "김다은";
		        System.out.println("1.이름: " + name);

		        // 2. 주소
		        // 형태: 문자열 / 예시: 서울특별시 강남구
		        String address = "서울특별시 마포구";
		        System.out.println("2.주소: " + address);

		        // 3. 전화번호
		        // 형태: 문자열 / 예시: 010-1234-5678
		        String phone = "010-9876-1234";
		        System.out.println("3.전화번호: " + phone);

		        // 4. 이메일
		        // 형태: 문자열 / 예시: example@email.com
		        String email = "daeun.kim@example.com";
		        System.out.println("4.이메일: " + email);

		        // 5. 생일
		        // 형태: 문자열 / 예시: 2007-08-25
		        String birthDate = "2007-08-25";
		        System.out.println("5.생일: " + birthDate);

		        // 6. 학교 이름
		        // 형태: 문자열 / 예시: 푸른고등학교
		        String schoolName = "서울고등학교";
		        System.out.println("6.학교 이름: " + schoolName);

		        // 7. 학과명
		        // 형태: 문자열 / 예시: 컴퓨터공학과
		        String department = "미디어콘텐츠과";
		        System.out.println("7.학과명: " + department);

		        // 8. 자기소개
		        // 형태: 문자열 / 예시: 간단한 문장
		        String introduction = "안녕하세요, 개발자를 꿈꾸는 고등학생입니다.";
		        System.out.println("8.자기소개: " + introduction);

		        // 9. 최근 본 영화
		        // 형태: 문자열 / 예시: 영화 제목
		        String recentMovie = "범죄도시4";
		        System.out.println("9.최근 본 영화: " + recentMovie);

		        // 10. 좋아하는 음식
		        // 형태: 문자열 / 예시: 떡볶이
		        String favoriteFood = "마라탕";
		        System.out.println("10.좋아하는 음식: " + favoriteFood);
		
		
	}


}
