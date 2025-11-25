package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex54_ArrayList {
	
	public static void main(String[] args) {
		
		//Ex54_ArrayList.java
		/*
		 	
		 	컬렉션 (=배열의 업그레이드 버전) > 데이터 집합
		 	
		 	컬렉션, Collection
		 	- JCF, Java Collection Framework
		 	- 업그레이드?
		 	 	1. 성능 (상황에 따라) 향상
		 		2. 사용법 향상(***)
		 		3. 길이 가변(***) > 배열의 길이가 늘었다 즐었다.
		 		
		 	컬렉션 종류
		 	1. List 계열
		 		-ArrayList (*****)
		 		-LinkedList
		 		-Queue
		 		-Stack
		 		-Vector (-) //레거시함, 이제 거의 안씀
		 		
		 	2. Set 계열
		 		- HashSet (***)
		 		- TreeSet
		 	
		 	3. Map 계열
		 		- HashMap (***)
		 		- TreeMap
		 		- Properties (△) //애매
		 		- HashTable (-) //레거시함, 이제 거의 안씀
		 	
		 
		 	ArrayList 클래스
		 	- Iterable<E>, Collection<E>, List<E>
		 	- Resizable-array implementation of the List interface. //
		 	
		 */
			
			//m1();
			//m2();
			//m3();
			//m4();
			//m5();
			m6();
	}

	private static void m6() {
		
		//컬렉션의 구조
		//- 컬렉션은 가변이다.(제네릭?)
		//- 왜 길이가 늘었다 줄었다 하는지?
		//- 늘리는법: 자동으로 늘어남 1.5배
		//- 줄이는법: .trimToSize();
		
		ArrayList<Integer> list =  new ArrayList<Integer>(100000);
		
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		
//		list.add(50);
//		list.add(60);
//		list.add(70);
//		list.add(80);
//
//		list.add(90);
//		System.out.println(list);
		
		for (int i=0; i<100000; i++) {
			list.add(i);
		}
		
		System.out.println(list.size());
		
		//list.trimToSize(); //방 줄이기
		
		
		
	}

	private static void m5() {
		
		//학생 3명의 국영수 점수
		//1. 배열 > 길이 고정 > 학생수 정확
		//2. ArrayList > 길이 가변 > 학생수 불명확
		
		//학생 성적 명단
		ArrayList<Score> list = new ArrayList<Score>();
		
		Random rnd = new Random();
		String[] names = { "홍길동", "아무개", "테스트", "강아지", "고양이" };
		
		for (int i=0; i<5; i++) {
			
			Score s = new Score(); //학생 1명
			
			s.setNo(i + 1);
			s.setName(names[i]);
			
			// 0~100 : 101
			// 60~100 : 0 ~ 40 : 41 [+60]
			s.setKor(rnd.nextInt(41) + 60);
			s.setEng(rnd.nextInt(41) + 60);
			s.setMath(rnd.nextInt(41) + 60);
			
			list.add(s);
			
			
		}
		
		//출력
		System.out.println("====================================================");
	
		System.out.println("                 성적표                         ");
		System.out.println();
		
		
		System.out.println("====================================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		
			for (Score s: list) {
				System.out.printf("%5d\t%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
						, s.getNo()
						, s.getName()
						, s.getKor()
						, s.getEng()
						, s.getMath()
						, s.getTotal()
						, s.getAverage());
			
			}
		
		
	}

	private static void m4() {
		
		//값 배열
		//객체 배열
		
		//new Cup();
		//순수배열
		Cup[] list1 = new Cup[3];
		list1[0] = new Cup("white", 5000);
		list1[1] = new Cup("yellow", 7000);
		list1[2] = new Cup("pink", 6000);
		
		//컬렉션
		ArrayList<Cup> list2 = new ArrayList<Cup>();
		list2.add(new Cup("white", 5000));
		list2.add(new Cup("yellow", 7000));
		list2.add(new Cup("pink", 6000));
		
		System.out.println(Arrays.toString(list1));
		System.out.println(list2);
		
		
		
	}

	private static void m3() {
		
		int[] ns1 =  new int[3];
		int[][] ns2 = new int[2][3];
		int[][][] ns3 = new int[2][3][4];
		
		//int[] ns1 = new int[3];
		//int ns4[] = new int[3]; //c언어에서 이렇게 썼음 / 예전에씀 .. 써도 되긴 함.
		
		//int[] ns1
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		ms1.add(100);
		
		//int[][] ns2
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		
		//ns2[0][0] = 10;
		ms2.add(new ArrayList<Integer>());
		ms2.get(0).add(10);
		
		//int[][][] ns3
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
		
		
		
	}

	private static void m2() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//1. 요소 추가하기
		//- boolean add(T value)
		//- 배열의 마지막에 추가 > Append Mode
		
		list.add("바나나");
		list.add("딸기");
		list.add("귤");
		list.add("포도");
		list.add("파인애플");
		
		//2. 요소의 갯수
		//- 배열에 넣은 요소의 총 갯수 == 배열의 길이
		//- int size()
		System.out.println(list.size());
		
		//3. 요소 읽기
		//- T get(int index)
		System.out.println(list.get(2));
		//System.out.println(list.get(5));
		
		System.out.println(list);
		//4. 요소 수정
		//- T set(int index, T newValue)
		//- list[2] = "망고";
		//list.set(2, "망고");
		String temp = list.set(2, "망고");
		System.out.println(temp);
		
		
		//5. 요소 삭제
		//- 방 없애기 > 길이가 줄어든다.
		//- T remove(index index) : 방번호로 삭제
		//- boolean remove(Object o): 값으로 삭제
		//- ***** 시프트 발생
		
		//list.add("망고");
		System.out.println(list.get(3));
		list.remove(2);
		//list.remove("망고");
		System.out.println(list.get(3));
		
		//6. 요소 추가
		//-Insert Mode
		//- 원하는 위치에 요소를 추가
		//- void add(int index, T Value)
		//- *** 샤프트 발생 >  삽입 된 방 이후의 모든 요소는 방번호 + 1
		
		System.out.println(list);
		list.add(2,"망고");
		System.out.println(list);
		
		//7. 요소 검색
		//- int indexOf(T value)
		//- int lastindexOf(T value)
		//- boolean contains(T value)
		System.out.println(list.indexOf("딸기"));
		System.out.println(list.lastIndexOf("딸기"));
		System.out.println(list.contains("딸기"));
		System.out.println(list.contains("복숭아"));
		
		//8. 탐색
		for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//향상된 for문 -> 온리 처음부터 마지막까지 밖에 접근 못함, 근데 단순해서 많이씀
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		//9. 초기화
		//- 모든 요소 삭제 > 모든 방.remove()
		//- void clear();
		//list = new ArrayList<String>[0];
		list.clear();
		
		
		System.out.println(list.size());
		System.out.println(list);
		
		//10. 빈배열 확인
		//- boolean isEmpty()
		System.out.println(list.isEmpty());
		System.out.println(list.size() == 0);
		
		
		list.add("체리");
		
		System.out.println(list.isEmpty());
		System.out.println(list.size() == 0);
	}

	private static void m1() {
		
		//순수 배열
		// -타입 명시(int)
		// -길이 명시(3)
		int[] nums1 = new int[3];
		
		//요소 접근 > 첨자(index) 사용
		nums1[0] = 10;	//쓰기
		nums1[1] = 20;	
		nums1[2] = 30;	
		
		System.out.println(nums1[0]); //읽기
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		
		System.out.println(nums1.length);
		System.out.println();
		
		//컬렉션(ArrayList)
		//- 타입 명시(0) > 제네릭
		//- 길이 명시(X) > 가변
		//ArrayList nums2 = new ArrayList();
		ArrayList<Integer> nums2 = new ArrayList<Integer>(); //배열을 감싼 랩퍼 클래스
		
		//요소 접근
		//- boolean add(T value)
		//-  Append(차례대로 추가)
		nums2.add(100); //nums2[0] = 100
		nums2.add(200); //nums2[1] = 200
		nums2.add(300); //nums2[2] = 300
		
		//- T get(int index)
		System.out.println(nums2.get(0)); //nums2[0]
		System.out.println(nums2.get(1)); //nums2[1]
		System.out.println(nums2.get(2)); //nums2[2]
		
		System.out.println(nums2.size()); //길이
		
		nums2.add(400);
		nums2.add(500);
		
		System.out.println(nums2.size()); //길이 5
		
		for (int i=0; i<nums2.size(); i++) {
			System.out.println(nums2.get(i));
		}
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums2.toString());
		System.out.println(nums2); //toString이 포함되어 있음.
		
		//ArrayList == 순수배열
	}

}

class Cup {
	
	private String color;
	private int price;
	public Cup(String color, int price) {
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cup [color=" + color + ", price=" + price + "]";
	}
}

class Score {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	public double getAverage() {
		return this.getTotal() / 3.0;
	}
}