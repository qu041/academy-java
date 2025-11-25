package com.test.java.file;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex58_File {
	
	private static int count = 0;
	
	public static void main(String[] args) {
		//static 객체 못부름? static은 static만 부름. 확인하기
//		Ex58_File ex58 = new Ex58_File(); //오브젝트를 만들어야됨. 이것도 불편하니 멤버변수 만들때 static 붙이면 됨.(정적변수)
//		System.out.println(ex58.count);
		//System.out.println(this.count); //static 메서드 안에서 객체변수 못씀
		System.out.println(count);
		
		
			//Ex58_File.java
			/*
			 	1. 파일/디렉토리(폴더) 조작
			 		- 윈도우 탐색기로 하는 행동
			 		- 자바로 구현
			 		- 
			 		
			 	2. 파일 입/출력
			 		- 메모장으로 하는 행동
			 		- 파일 읽기/쓰기
			 		- 
			 	
			 
			 */
		
			//m1(); //파일정보읽기
			//m2();	//디렉토리 정보읽기
			//m3(); //생성
			//m4(); //이름수정하기
			//m5();	//파일이동하기
			//m6(); //파일 삭제하기
			//m7(); //폴더 조작
			//m8();
			//m9();
			//m10(); //폴더명 수정 or 폴더이동
			//m11(); //폴더 삭제 
			//여기까지 쉬움
			//m12(); //특정 폴더의 내용물 보기
			//m13(); // 재귀메서드 사용안하면 벌어지는 결과
			m14(); //재귀메서드 이용//파일세기 / 이해하고 넘어가야됨 //향상된 for문 !!
					//폴더지우기 등 응용 가능.
		
	}//main

	private static void m14() {
		
		String path = "C:\\dev\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			
			count(dir);
			
			System.out.printf("총 파일 개수 : %,d개\n",count);
			
			
			
			
		}
		
		
	}

	public static void count(File dir) {
		
		
		//1.목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일만 추려서 개수세기
		for (File file : list) {
			if (file.isFile()) {
				count++;
			}
		}
		
		//3. 자식 폴더 > 1번 + 2번 + 3번
		for (File subdir : list) {
			
			
			//subdir > 1번+2번+3번
			if (subdir.isDirectory()) {
				count(subdir);
			}
			
		}
	}

	private static void m13() {
		
		//폴더 정보?
		//- 1.15GB (1,236,250,259 바이트)
		//- 파일 18,888, 폴더 3,705 
		
		String path = "C:\\dev\\eclipse";
		File dir = new File(path);
		
		int count = 0; //누적변수
		
		if (dir.exists()) {
			File[] list =  dir.listFiles();
			
			for (File file : list) {
				if (file.isFile()) {
					count ++;
				}
			}
			
			for (File subdir : list) {
				if (subdir.isDirectory()) {
					
					File[] sublist = subdir.listFiles();
					
					for (File subfile : sublist) {
						if(subfile.isFile()) {
							count++;
						}
						
					}
					for (File subsubdir : sublist) {
						if (subsubdir.isDirectory()) {
							File[] subsublist = subsubdir.listFiles();
							for (File subsubfile : subsublist) {
								if(subsubfile.isFile()) {
									count++;
								}
							}
							
						}
					}
				}
			}
			
			System.out.printf("총 파일 개수 : %,d개\n",count);
		}
		
	}

	private static void m12() {
		
		//특정 폴더의 내용물 보기
		
		String path = "C:\\dev\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
			
			//해당 폴더의 내용물 //자식으 이름을 배열로 가져옴 
//			String[] list = dir.list();
//			
//			for (String item : list) {
//				//System.out.println(item);
//				String subpath = path + "\\" + item;
//				System.out.println(subpath);
//				
//				File file = new File(subpath); //조작하기 위해 파일객체로 변환
//				System.out.println(file.isFile());
			
			File[] list = dir.listFiles();
			
//			for (File file : list) {
//				System.out.println(file.getName());
//				System.out.println(file.isFile());
//			
//			}
			
			for (File item : list) {
				if (item.isDirectory()) {
					System.out.println("📁" + item.getName());
				}
			}
			
			for (File item : list) {
				if (item.isFile()) {
					System.out.println(item.getName());
				}
			}
			
		}
		
	}

	private static void m11() {
		
		//폴더 삭제
		File dir = new File("C:\\code\\java\\file\\user");
		
		//빈폴더만 지울 수 있음.
		System.out.println(dir.delete());
	}

	private static void m10() {
		
		// 폴더명 수정 or 폴더 이동
		File dir = new File("C:\\code\\java\\file\\schedule");
		File dir2 = new File("C:\\code\\java\\file2\\schedule");
		
		System.out.println(dir.renameTo(dir2));
		
	}

	private static void m9() {

		//요구사항] 일정 관리 > 날짜별 폴더 생성하기 > 1년 365일
		//[2025-01-01]
		//[2025-12-31]
		
		//왜? 월과 요일은 0부터 시작?? > 숫자가 아니다 > 배열의 방번호로 관리 > 요즘 언어들은 서수로 관리 1부터 시작
		Calendar c = Calendar.getInstance();
		c.set(2025, 0, 1);
		
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		for (int i=0; i<c.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			
			String path = String.format("C:\\code\\java\\file\\일정\\%tF", c);
			System.out.println(path);
			
			File dir = new File(path);
			dir.mkdir();
			
			c.add(Calendar.DATE, 1);
			
			
			
		}
		
	}

	private static void m8() {
	
		//요구사항] 회원명단 > 개인 폴더 생성하기
		String[] member = { "홍길동", "아무개", "강아지", "고양이", "거북이" };
		
		for (int i=0; i<member.length; i++) {
			
			String path = String.format("C:\\code\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			System.out.println(path);
			
			File dir = new File(path);
			dir.mkdir();
		}
		
		
		
	}

	private static void m7() {
		//폴더 생성하기aaa
//		String path = "C:\\code\\java\\file\\aaa";
//		File dir = new File(path);
//		
//		boolean result = dir.mkdir(); //make directory
//		System.out.println(result);
		
		//폴더 생성하기 bbb>ccc>ddd
		String path = "C:\\code\\java\\file\\bbb\\ccc\\ddd";
		File dir = new File(path);
		
		boolean result = dir.mkdirs(); //재귀메서드 s 붙이면 마지막 디렉토리까지 만들어줌.
		System.out.println(result);
		
	}

	private static void m6() {
		//원본
				String path = "C:\\code\\java\\file\\jumsu.txt";
				File file = new File(path);	
				
				//보통 삭제: 휴지통 폴더로 이동하기
				//진짜 삭제: 복구 불가능
				
				boolean result = file.delete();
				System.out.println(result);
	}

	private static void m5() {
			
		//파일 이동하기
		//원본
		String path = "C:\\code\\java\\file\\jumsu.txt";
		File file = new File(path);	
		
		//이동후 모습 참조객체
		String path2 = "C:\\code\\java\\file2\\score.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2); //전체 경로를 바꾸는 명령어
		System.out.println(result);
		
	}

	private static void m4() {
		
		//파일명 수정하기
		//- score.txt > jumsu.txt
		//원본
		String path = "C:\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		//수정후 객체
		String path2 = "C:\\code\\java\\file\\jumsu.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2); //전체 경로를 바꾸는 명령어
		System.out.println(result);
	}

	private static void m3() {
		
		//파일 조작 > 생성, 이동, 이름 수정, 복사(x),삭제
		
		//생성하기
		String path = "C:\\code\\java\\file\\score.txt";
		
		File file = new File(path);
		
		try {
			boolean result = file.createNewFile();
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void m2() {
			
		//디렉토리 정보 읽기
		String path = "C:\\code\\java\\file";
		
		//디렉토리 참조 객체 > java.io.File  클래스
		File dir = new File(path);
		
		//System.out.println(file.exists());
				//파일 유무 유효성 검사.
				if (dir.exists()) {
						
						//파일 정보 읽기
						System.out.println(dir.getName()); 
						System.out.println(dir.isFile()); 
						System.out.println(dir.isDirectory()); 
						System.out.println(dir.length()); //0
						System.out.println(dir.getAbsolutePath()); 
						System.out.println(dir.lastModified()); 
						System.out.println(dir.isHidden());
						System.out.println(dir.canRead());
						System.out.println(dir.canWrite());
						System.out.println(dir.getParent()); 
				} else {
					System.out.println("디렉토리가 없습니다.");
				}
		
		
		
	}

	private static void m1() {
			
		//C:\code\java\file\data.txt
		
		//파일의 정보 읽기 (java로 접근)
		
		//** 자바 응용 프로그램에서 외부의 자원(resource)을 접근
		//1. 외부 자원을 참조하는 객체를 하나 생성 > 중계인, 대리자
		//2. 참조 객체 조작 > 실제 파일에 적용
		
		//파일 경로
		String path = "C:\\code\\java\\file\\data.txt";
		
		//파일 참조 객체 > java.io.File 클래스
		File file = new File(path);
		
		//System.out.println(file.exists());
		//파일 유무 유효성 검사.
		if (file.exists()) {
				
				//파일 정보 읽기
				System.out.println(file.getName()); //data.txt
				System.out.println(file.isFile()); //true
				System.out.println(file.isDirectory()); //false
				System.out.println(file.length()); // 파일크기 > 16바이트
				System.out.println(file.getAbsolutePath()); //파일위치(c:\~)
				System.out.println(file.lastModified()); // 1750983044038
				
				//타임스탬프 > Calender
				Calendar c1 = Calendar.getInstance();
				System.out.println(c1.getTimeInMillis());
				c1.setTimeInMillis(file.lastModified());
				System.err.printf("%tF %tT\n", c1, c1); //2025-06-27 09:10:44
				
				System.out.println(file.isHidden());
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.getParent()); //부모 디렉토리 C:\code\java\file
			
		} else {
			System.out.println("파일이 없습니다.");
		}
		
	}
	

}
