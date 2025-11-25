package com.test.java.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.github.lalyos.jfiglet.FigletFont;

//import com.test.java.collection.Score;

//남은 컬렉션 - 람다 스트림  회원가입1 게시판2 등등 인당 2~3개 5명이 진행 협업보단 개인기량 기능 분리 확실히
//프로젝트 최우선 공부
//1.파일 입출력
//2. 컬렉션
//3. 더미데이터 + 테스트용 데이터 우선적으로 잘만들기(일정량정도 우선적으로라도)
//- Ex.학생관리시스템 
//- 학생등록 페이지
/*
 A>1.학생등록페이지
 B>2.학생목록페이지
 
 
 
 
 
 */

public class Ex59_File {
	
	public static void main(String[] args) {
		
		//Ex59_File.java
		/*
		 	1. 파일/디렉토리 조작
		 	
		 	
		 	2. 파일 입출력
		 		a. 텍스트 입출력
		 			-메모장
		 			-이클립스
		 		
		 		b. 이진 데이터(바이너리, 비텍스트) 입출력
		 			-이미지 생성
		 			-동영상
		 			-파일 등...
		 			
		 			
		 		파일 입출력
		 		- 자바 프로그램 > (데이터) > 보조 기억장치(HDD,SSD): 쓰기(저장)
		 		- 자바 프로그램 < (데이터) < 보조 기억장치(HDD,SSD): 읽기(열기)
		 		
		 		저장 장치
		 		-데이터 1,0으로 저장
		 		-데이터의 자료형 없음
		 		
		 		인코딩, Encoding
		 		- 문자 코드(응용 프로그램 데이터)를 부호화(0,1) 시키는 작업
		 		- 자바 프로그램("홍길동",String) > 텍스트 파일(1001000100101010101)
		 		
		 		디코딩, Decoding
		 		- 부호 데이터를 문자 코드로 변환하는 작업
		 		- 텍스트 파일(1001000100101010101) > 자바 프로그램("홍길동",String)
		 		
		 		인코딩/디코딩 규칙
		 		- 저장 장치 or 네트워크 상에서 데이터를 변환하는 규칙
		 		
		 		코드셋, 문자셋, 코드페이지, 인코딩(디코딩)
		 		1. ANSI
		 		2. UTF
		 			-UTF-8
		 			-UTF-16
		 		3. ISO-8859-1
		 		4. EUC-KR
		 		5. MS949(CP949)	
		 		
		 		
		 		ANSI(ISO-8859-1, EUC-KR, MS949)
		 		- 영어(숫자, 특수문자, 서유럽문자): 1byte
		 		- 한글(한자, 일본어 등): 2byte
		 		
		 		
		 		UTF-8 (대부분 이걸 씀) 국제표준에 가까울 정도
		 		- 영어(숫자, 특수문자, 서유럽문자): 1byte
		 		- 한글(한자, 일본어 등): 3byte
		 		
		 		UTF-16
		 		- 영어(숫자, 특수문자, 서유럽문자): 2byte
		 		- 한글(한자, 일본어 등): 2byte
		 		
		 		C:\\Code\\Java\\file
		 */
		
			//m1(); //파일쓰기 원초적인방법
			//m2(); //파일읽기
			//m3(); //현업용 쓰기
			//m4();
			//m5();
			//m6();
			//m7();
			//m8();
			m9(); //프로젝트에서 써먹으라고 알려준 내용
	}

	
	
	private static void m9() {
		
		//콘솔 그림 기리기
		//1. 아스키 아트
		//2. figlet
		
	try {
		String asciiArt1 = FigletFont.convertOneLine("hello");
	    System.out.println(asciiArt1);
	    String asciiArt2 = FigletFont.convertOneLine(new File("C:/code/java/JavaTest/flf/alligator.flf"), "hello");
	    System.out.println(asciiArt2);
	    
	} catch (Exception e) {
		System.out.println("Ex59_File.m9");
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	}
	
	
	
	



	private static void m8() {
		
		//성적표 출력
		//- 성적 > 파일(score.txt)
		//- 이름, 국어, 영어, 수학
		
		//데이터 구조 설계(scheme)
		//1. 어떤 데이터를 저장?
		//2. 어떤 구조로 저장?
		System.out.println("====================================================");
		
		System.out.println("                 성적표                         ");
		System.out.println();
		
		
		System.out.println("====================================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
//			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
		
		try {
			
			//파일 경로
			//1. 로컬 경로(절대)
			//- C:\aaa\bbb\ccc
			//2. 상대 경로
			//- .\aaa\bbb
			//. 위치 찾는법 //C:\code\java\JavaTest\.
//			File file = new File(".");
//			System.out.println(file.getAbsolutePath());
			
			
			BufferedReader reader = new BufferedReader(new FileReader(".\\dat\\score.txt"));
		
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				//홍길동,100,90,80 == 학생 1명
				//System.out.println(line);
				
				String[] temp = line.split(",");
				
				String name = temp[0];
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				int total = kor + eng + math;
				double avg = total / 3.0;
				
				System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n",name,kor,eng,math,total,avg);
				
				
			}
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m8");
			e.printStackTrace();
		}
	
	

		
	}



	private static void m7() {
		
		//메모장 읽기(자바 소스)
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("소스 파일명: "); // Ex01.java
			String filename = scan.nextLine();
			
			//C:\code\java\JavaTest\src\com\test\java
			String path = "C:\\code\\java\\JavaTest\\src\\com\\test\\java\\" + filename;
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int number = 1; //줄번호
			
			while ((line = reader.readLine()) != null) {
				System.out.printf("%3d: %s\n",number,line);
				number++;
			}
			
				reader.close();
		} catch (Exception e) {
			System.out.println("Ex59_File.m7");
			e.printStackTrace();
		}
		
		
	}



	private static void m6() {
		//FileInputStream  > FileReader > BufferedReader // 편함
				//FileOutputStream > FileWriter > BufferedWriter // 이건 파일라이터만 쓰면됨
				
				try {
					
//					BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\code\\java\\file\\test.txt"));
//					
//					writer.write("홍길동");
//					writer.write("\r\n");
//					writer.write("강아지");
//					writer.newLine();
//					writer.write("고양이");
//					
//					writer.close();
					
					BufferedReader reader = new BufferedReader(new FileReader("C:\\code\\java\\file\\abc.txt"));
					
					//reader.read()
//					String line = reader.readLine();
//					System.out.println(line);
//					
//					 line = reader.readLine();
//					System.out.println(line);
//					
//					 line = reader.readLine();
//					System.out.println(line);
//					
//					 line = reader.readLine();
//					System.out.println(line);
//					
//					 line = reader.readLine();
//					System.out.println(line);
					
					String line = null;
				
					while ((line = reader.readLine()) !=null) {
					System.out.println(line);
				}
					
					
				} catch (Exception e) {
					System.out.println("Ex59_File.m6");
					e.printStackTrace();
				}
				
			}




	private static void m5() {
		
try {
			
			//파일 읽기
			//FileInputStream > FileReader
			//1. 문자 단위 읽기(2byte) > 한글 가능
			//2. 문자열 읽기(X)
			
			FileReader reader = new FileReader("C:\\code\\java\\file\\할일.txt");
			
			int code = -1;

			//code = reader.read();
			//System.out.println((char)code);
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m5");
			e.printStackTrace();
		}
		
	}
	
 	private static void m4() {
		
		//메모장 > 쓰기
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("파일명: ");
			String fileName = scan.nextLine();
			
			FileWriter writer =  new FileWriter("C:\\code\\java\\file\\" + fileName);
			
			boolean loop = true;
			
			while (loop) {
				
				System.out.print("입력: ");
				String line = scan.nextLine();
				
				if (line.equals("wq")) { //write & qiut
					System.out.print("메모가 완료됐습니다.");
					break;
				}
				
				writer.write(line); //입력한 한줄 > 파일쓰기
				writer.write("\r\n");
			}
			
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m4");
			e.printStackTrace();
		}
		
	}



	private static void m3() {
		try {
			
			//파일 쓰기
			//FileOutputStream > FileWriter (현역)
			//1. 문자열 쓰기 지원
			//2. 문자 단위 쓰기 지원(2byte) > 한글가능
			
			FileWriter writer = new FileWriter("C:\\code\\java\\file\\member.txt");
			
			//writer.write(65);
			writer.write("홍길동");
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m3");
			e.printStackTrace();
		}
		
	}



	private static void m2() {
		
		//파일 읽기
		
		//읽기 스트림 객체
		
		System.out.println("업무");
		try {
			
			//FileOutputStream <> FileInputStream
			//읽기전용 빨대 꽂음
			FileInputStream stream
				= new FileInputStream("C:\\code\\java\\file\\number.txt");
			
			//System.in.read()
//			int code = stream.read();
//			System.out.print((char)code);
//			 code = stream.read();
//			System.out.print((char)code);
//			 code = stream.read();
//			System.out.print((char)code);
//			 code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
			
			//코드 패턴 기억!!!
			int code = -1;
			
			while((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m2");
			e.printStackTrace();
		}
		
	}



	private static void m1() {
		
		//파일 쓰기(저장, 출력)
		
		//쓰기 스트림(Stream) 객체
		//쓰기 모드
		//1. Create Mode > default
		// - 파일이 없으면 > 새로 생성
		// - 파일이 있으면 > 덮어쓰기
		//2. Append Mode
		// - 파일이 없으면 > 새로 생성
		// - 파일이 있으면 > 이어쓰기 > **
		
		try {
		
		File file = new File("C:\\code\\java\\file\\number.txt");
		
		//스트림생성(열기)
		//FileOutputStream
		//-바이트 단위 쓰기
		FileOutputStream stream = new FileOutputStream(file, true); //쓰기스트림객체를 생성했다 ,  스트림을 열었다.
			//자바 > 데이터 > 파일
//			stream.write(97); //문자 코드를 사용해서 파일에 저장;
//			stream.write(98); //문자 코드를 사용해서 파일에 저장;
//			stream.write(99); //문자 코드를 사용해서 파일에 저장;
		
			String txt = "\r\nJava Hello~ HONG~";
			for (int i=0; i<txt.length();i++) {
				char c= txt.charAt(i);
				stream.write(c);
			}
			
			//스트림 닫기
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
	
		
	}
	}
}