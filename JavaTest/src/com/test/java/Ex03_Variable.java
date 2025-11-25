package com.test.java;

public class Ex03_Variable {

	public static void main(String[] args) {
		
		/*
		 * 자료형 + 변수
		 * 
		 * 변수, Variable
		 * -변하는 수(표면상의 정의)
		 * -개발자가 명렁어를 사용해서 메모리에 할당받은 공간
		 * 
		 * 1.변수생성하기
		 * -자료형 변수명;
		 * 
		 * 2.변수 초기화
		 * -변수명 = 값;
		 * = (-> 대입, 할당 연산자)
		 * 
		 * 3.변수 사용
		 * -출력, 연산, 조건. 기록. 전송 등..
		 * 
		 * 변수(Variable) vs 상수 (Constant)
		 * -표현이 동일 > 의미가 달라지는지?
		 * 
		 * 4.변수 치환
		 * -변수명 = 값;
		 */
			
		byte 국어 = 120, 영어 = 50, 수학 = 70; 		
		
		

		System.out.println("국어점수 = " + 국어);
		
		국어 = 97;
		
		System.out.println(국어);
		
		byte kor;
		kor = 90;
		
		System.out.println(kor);
		
		
		//변수명 만들 때 규칙(앞으로 무언가의 이름을 만들 때 규칙) ex)폴더명 파일명...
		//1. 영문자 + 숫자 + '_'(공백표시)를 사용한다. > 관습
		//2. 숫자로 시작 불가능 (_4eng로는 가능)
		//3. 예약어(키워드) 사용 불가능 ex> byte byte; (X)
		//4. 의미있게(*****) -  가독성
		
		//변수 선언하는 방식
		byte n1; //변수 선언
		n1 = 100; //변수 초기화
		
		byte n2 = 100; // 선언 + 초기화
		
		byte n3;
		byte n4;
		
		byte n5, n6; // 그룹 선언
		
		byte n7 = 10, n8 = 20, n9 =30 , n10 = 11;
		
		//지도 > 좌표 (x,y)
		double x1; // 우리집 x좌표
		double y1; // 우리집 y좌표

		double x2, y2; // 친구집 x좌표, 친구집 y좌표
		
		double x3, //마트 x좌표
			   y3; //마트 y좌표   -> 작업 및 주석 달기 수월함.
		
		byte m1 = 10; // 할당 받은 직후의 변수 상태 > 비었음(null) = 널상태
		
		System.out.println(m1); // 편집기 작업 중 빨간 밑줄이 나는 에러 > 컴파일 에러
								//*The local variable m1 may not have been initialized
		
		//식별자(변수이외의 요소까지) 명명법(패턴)
		/* 1.헝가리언 표기법
		   2.파스칼 표기법
		   3.캐멀 표기법
		   4.스네이크 표기법
		   5.케밥 표기법 */
		   
		   //1.헝가리언 표기법
		   //-식별자를 만들 때 식별자의 접두어로 자료형을 표시하는 방법
		   //-사용) 인터페이스명
		   byte age;
		   byte byteAge;
		   byte bAGe;
		   byte byte_age;
		   byte b_age;
		   
		   //2.파스칼 표기법*
		   //-식별자의 첫 문자를 대문자 표기 + 나머지 문자는 소문자 표기
		   //-합성어 > 각 단어의 첫문자를 대문자로 표기
		   //-사용) 클래스명**
		   byte Weight;
		   
		   //3.캐멀 표기법*
		   //-식별자의 첫 문자를 소문자 표기 + 나머지 문자는 소문자 표기
		   //-합성어 > 각 단어의 첫문자를 대문자로 표기//
		   //-)사용) 메서드명, 변수명**
		   byte height;
		   byte myHeight;
		   
		   //4.스네이크 표기법
		   //-전부 소문자로 표기
		   //-합성어 > 각단어를 '_'로 연결
		   //-)사용) 개발자 마음대로~
		   byte english_score;
		   
		   //5.케밥 표기법
		   //-전부 소문자 표기
		   //-합성어 > 각 단어를 '-'로 연결 >자바에서는 못씀(빼기 기호로 인식)
		   //-사용)HTML, CSS
		   // byte english-score;
		
		   /*
		     | 기호      | 이름 (영문 표현)                    | 설명                  |     |
| ------- | ----------------------------- | ------------------- | --- |
| `!`     | exclamation mark              | 느낌표                 |     |
| `@`     | at (sign)                     | 골뱅이 / 이메일에서 사용      |     |
| `#`     | hash / number sign / pound    | 해시 / 번호 / SNS에서 태그  |     |
| `$`     | dollar sign                   | 달러 기호               |     |
| `%`     | percent sign                  | 퍼센트                 |     |
| `^`     | caret                         | 캐럿 / 수학에선 거듭제곱      |     |
| `&`     | ampersand                     | 앰퍼샌드 / 그리고(and)     |     |
| `*`     | asterisk                      | 별표 / 곱하기            |     |
| `(` `)` | parentheses                   | 괄호 / 소괄호            |     |
| `-`     | hyphen / dash                 | 하이픈 / 대시            |     |
| `_`     | underscore                    | 밑줄                  |     |
| `=`     | equal sign                    | 등호                  |     |
| `+`     | plus sign                     | 플러스                 |     |
| `{` `}` | curly braces / curly brackets | 중괄호                 |     |
| `[` `]` | square brackets               | 대괄호                 |     |
| `:`     | colon                         | 콜론 / 쌍점             |     |
| `;`     | semicolon                     | 세미콜론                |     |
| `'`     | apostrophe / single quote     | 작은 따옴표              |     |
| `"`     | quotation mark / double quote | 큰 따옴표               |     |
| `\`     | backslash                     | 역슬래시                |     |
| `/`     | slash / forward slash         | 슬래시                 |     |
| \`      | \`                            | vertical bar / pipe | 파이프 OR 오어 |
| `<` `>` | angle brackets                | 꺾쇠 괄호 / 부등호         |     |
| `~`     | tilde                         | 물결표                 |     |
| `.`     | period / dot                  | 마침표 / 점             |     |
| `,`     | comma                         | 쉼표                  |     |
| `?`     | question mark                 | 물음표                 |     |

		     
		  */

		   
		   //데이터를 변수에 저장 > 사용중.. 가끔 수정하면 안되는 값이 있다. -> final
		   //원의 둘레를 구하시오. >원주율(파이)
		   //final 변수 = 상수 -> 모두 대문자로 표기
		   final double PI = 3.14; //3.14(리터럴,Literal, 데이터 상수)
		   
		   //pi = 6.55; 
		   //The final local variable pi cannot be assigned. It must be blank and not using a compound assignment
		   
		   //pi = 3.33;
		   
	}
	
}
