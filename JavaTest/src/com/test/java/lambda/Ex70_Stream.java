package com.test.java.lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;

public class Ex70_Stream {
	
	public static void main(String[] args) {
		
		//Ex70_Stream.java
		/*
			//파이프 조합을 잘 해야됨.
			
			자바 스트림
			1. 입출력
				- 파일 입출력, 콘솔 입출력, 네트워크 입출력 등..
			
			2. 스트림
				- Java 8(1.8) + 람다식과 같이 출시
				- 배열(컬렉션)의 탐색(조작) 기능
				- 다양한 소스에서 사용 가능(파일 입출력, 디렉토리 탐색 등)
			
				
			표준 API 함수형 인터페이스
			
			1. Consumer
				- (매개변수) -> {}
				
			2. Supplier
				- () -> { return 값; }
				
			3. Function
				- (매개변수) -> { return 값; }
			
			4. Operator
				- (매개변수) -> { return 값; }
				- 매개변수와 반환값이 동일한 자료형
				
			5. Predicate
				- (매개변수) -> { return 값; }
				- 반환값이 Boolean
			
			
			스트림, Stream
			- 특정 데이터 소스로부터 생성
			
			파이프, Pipe
			- 중간 파이프
			- 최종 파이프
			
			최종 처리
			- forEach(Consumer)
			- 최종 파이프
			- 앞의 스트림로부터 요소를 받아 최종 처리하는 메서드
			
			필터링
			- filter(Predicate)
			- 중간 파이프
			- 앞의 스트림으로부터 요소를 받아 조건에 맞는 요소만 남기고 맞지 않는 요소는 버린다.
			
			중복 제거
			- distinct()
			- 중간 파이프
			- 앞의 스트림으로부터 요소를 받아 중복 제거를 한다.
			- Set 유사
			
			변환(*******)
			- map(Function), mapXXX(Function)
			- 중간 파이프
			- 앞의 스트림의 요소를 다른 형태로 변환 후 새로운 스트림을 반환
			
			정렬
//			- Sorted(Comparator)
//			- 중간 파이프
///			- 사용법이 기존의 Sort()와 동일.
			
			매칭
			- allMatch(), anyMatch(), noneMatch()
			- 최종 파이프
			- boolean allMatch(predicate) : and // 모든 요소가 조건을 만족하는지?
			- boolean anyMatch(predicate) : or // 일부 요소가 조건을 만족하는지?
			- boolean noneMatch(predicate) : 모든 요소가 조건을 불만족하는지?
			
			집계/통계, Reduce
			- 최종 파이프
			- count()
			- max()
			- min()
			- sum()
			- avg()
			
			
			
		*/		
		
		//m1();
		//m2();
		//m3();
		
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		m9();
		
	}//main;

	private static void m9() {
		
		System.out.println(Data.getIntList().stream().count());
		
		System.out.println(Data.getUserList().stream().filter(user -> user.getGender() ==1).count());
		System.out.println(Data.getUserList().stream().filter(user -> user.getGender() ==2).count());
		System.out.println();
		
		//max(), min()
		List<Integer> nums = Data.getIntList(10);
		int max = 0; //nums안의 모든 숫자 중 가장 큰 숫자를 담을 변수
		int min = 87; // 초기화시 주의해야됨. 가지고 있는 수 중에 제일  큰수로
		for (int n : nums) {
			if(n > max) {
				max = n;
			}
		}
		
		for (int n : nums) {
			if(n < min) {
				min = n;
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(nums.stream().max((a,b) -> a - b));
		System.out.println(nums.stream().min((a,b) -> a - b));
		
		//Optional<Integer>
		// - 값형 자료형들이 null을 반환할때 프로그램이 에러가 안나기 위한 자료형// Optional empty로 반환
		// int n = getNum(nums); //7의 배수 중 가장 큰 숫자를 돌려주는 메서드로 가정
		
		Optional<Integer> result =  nums.stream().max((a,b) -> a - b);
		
		if (result.isPresent()) { // if( result != null)
		System.out.println(result.get());
	}
		if (result.isEmpty()) { // if (result == null)
			System.out.println("최대값 없음");
		}
		
		//키가 가장 큰 사람의 정보
		Optional<User> user =  Data.getUserList().stream()
						  .max((u1,u2) -> u1.getHeight() - u2.getHeight());
		if (user.isPresent()) {
			System.out.println(user.get());
		}
		
		//스트림의 요소 타입: 숫자0 ,숫자X 둘다 됨
		//- count(), max() , min()
		//스트림의 요소 타입: 숫자만 됨. > 범용타입으로 . 찍으면 안나옴 MaptoInt로 변환
		//- sum(), avg()
//		nums.stream().count()
//		nums.stream().max(null)
//		nums.stream().min(null)
		
		System.out.println(nums.stream().mapToInt(n -> n).sum());
		if (user.isPresent()) {
		System.out.println(nums.stream().mapToInt(n -> n).average().getAsDouble());
		}
		
		//user > 남자의 평균키?
		double height = Data.getUserList().stream()
						  .filter(u -> u.getGender() == 1)
						  .mapToInt(u -> u.getHeight())
						  .average()
						  .getAsDouble();
		
		System.out.println(height);
		
		
		
		
	}
	private static void m8() {
		List<Integer> nums = Arrays.asList(2, 4, 6, 8, 10);
			
		//요구사항] 집합에 짝수만 있는지?
		boolean result = false;
		
		for (int n : nums) {
			if ( n % 2 ==1) {
				result = true;
				break;
			}
		}
		System.out.println(result);
		
		result = nums.stream().allMatch(num -> num % 2 ==0);
		System.out.println(result);
		
		result = Data.getUserList().stream()
									.filter(user -> user.getHeight() < 175)
									.allMatch(user -> user.getGender() == 1);
		System.out.println(result);
		
		nums = Arrays.asList(2, 4, 5, 8, 10);
		
		//nums 안에 홀수가 존재하냐?
		result = nums.stream().anyMatch(n -> n % 2==1);
		System.out.println(result);
		
		nums = Arrays.asList(2, 4, 6, 8, 10);
		//전원이 짝수니?
		result = nums.stream().noneMatch(n -> n % 2 == 1);
		System.out.println(result);
		
	}

	private static void m7() {
		
		Data.getIntList(10).stream()
							.sorted((a,b) -> b - a) //아무것도 안넣으면 오름차순임
							.forEach(n -> System.out.println(n));
		
		
//		Data.getIntList(10).stream()
//		.sorted((a,b) -> Comparator.naturalOrder()) //아무것도 안넣으면 오름차순임
//		.sorted((a,b) -> Comparator.reverseOrder()) //내림차순
//		.forEach(n -> System.out.println(n));
//		
	}

	private static void m6() {
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		//list안의 단어들의 글자수?
		list.stream().forEach(word -> System.out.println(word.length()));
		System.out.println();
		
		list.stream()
				.map(word -> word.length())
				.forEach(length -> System.out.println(length));
		System.out.println();
		
		list.stream()
				.map(word -> word.length() >= 5 ? "긴단어" : "짧은단어")
				.forEach(result -> System.out.println(result));
		System.out.println();
		
		
		Data.getUserList().stream()
						//.map(user -> user.getName())
						//.map(user -> user.getAge())
						.map(user -> user.getGender() == 1 ? "남자" : "여자")
						.forEach(name -> System.out.println(name));
		System.out.println();
		
		//names > Member 객체 생성 + 20세
		String[] names = { "홍길동", "아무개", "강아지", "고양이", "병아리" };
		//new Member(names[i], 20)
		
		Arrays.stream(names)
				.map(name -> new Member(name, 20))
				.forEach(m -> System.out.println(m));
		System.out.println();
		
		//User 객체 > Member 객체
		Data.getUserList().stream()
					.map(user -> new Member(user.getName(), user.getAge()))
					.forEach(m -> System.out.println(m));
		System.out.println();
		
	}

	private static void m5() {
		
		List<Integer> nums = Data.getIntList();
		System.out.println(nums.size());
		
		Set<Integer> set = new HashSet<Integer>(nums);
		System.out.println(set.size());
		
//		nums.stream().distinct()
//					.forEach(n -> System.out.println(n));
		
		System.out.println(nums.stream().count());
		System.out.println(nums.stream().distinct().count());
		System.out.println();
		
		Data.getStringList().stream()
					.filter(word -> word.length() >= 5)
					.distinct()
					.forEach(word -> System.out.println(word));
		System.out.println();
		
		
		
		ArrayList<Member> mlist = new ArrayList<Member>();
		
		mlist.add(new Member("홍길동", 20)); 
		mlist.add(new Member("아무개", 22)); 
		mlist.add(new Member("강아지", 3)); 
		mlist.add(new Member("고양이", 2)); 
		mlist.add(new Member("홍길동", 20)); //동명이인? 동일인?
		
		System.out.println(mlist.size());
		
		mlist.stream()
				.distinct()
				.forEach(m -> System.out.println(m + ":" + m.hashCode()));
		
	}

	private static void m4() {
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//짝수만 출력
		//1. for
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.printf("%-4d", list.get(i));
			}
		}
		System.out.println();
		
		//2. for
		for (int n : list) {
			if (n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		}
		System.out.println();
		
		//3. stream
		list.stream().forEach(n -> {
			if (n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		});
		System.out.println();
		
		list.stream().filter(n -> {
			if (n % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(n -> System.out.printf("%-4d", n));
		System.out.println();
		
		list.stream()
				.filter(n -> n % 2 == 0)
				.forEach(n -> System.out.printf("%-4d", n));
		System.out.println();
		
		list.stream()
				.filter(n -> n % 2 == 0 && n >= 50)
				.forEach(n -> System.out.printf("%-4d", n));
		System.out.println();
		
		list.stream()
				.filter(n -> n % 2 == 0)
				.filter(n -> n >= 50)
				.forEach(n -> System.out.printf("%-4d", n));
		System.out.println();
		
		
		Data.getStringList().stream()
							.filter(word -> word.length() >= 5)
							.filter(word -> word.startsWith("애"))
							.forEach(word -> System.out.println(word));
		System.out.println();
		
		Data.getUserList().stream()
						  .filter(user -> user.getGender() == 1)
						  .filter(user -> user.getHeight() >= 180)
						  .filter(user -> user.getWeight() >= 80)
						  .forEach(user -> System.out.println(user));
		System.out.println();
		
	}

	private static void m3() {
		
		//스트림을 얻어오는 방법
		//- stream() 메서드를 호출해서..
		//1. 배열로부터
		//2. 컬렉션로부터
		//3. 숫자 범위
		//4. 파일로부터
		//5. 디렉토리부터
		//6. 기타 등등..
		
		//1.
		int[] nums1 = { 10, 20, 30 };
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		//2.
		List<Integer> nums2 = Arrays.asList(10, 20, 30);
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		LinkedList<Integer> nums3 = new LinkedList<Integer>();
		nums3.add(10); nums3.add(20); nums3.add(30);
		nums3.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		HashSet<Integer> nums4 = new HashSet<Integer>();
		nums4.add(100); nums4.add(200); nums4.add(300);
		nums4.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		HashMap<String,Integer> map;
		//map.str
		//map.keySet().stream().forEach(null);
		
		
		//3. 숫자 범위
		//- Stream<T>
		//- IntStream
		IntStream.range(1, 10).forEach(num -> System.out.println(num));
		System.out.println();
		
		//4. 파일 읽기
		//4.1 FileReader
		//4.2 Stream
		//4.3 Scanner
		Path path = Paths.get("dat\\score.txt"); //File 객체 비슷한 역할
		try {
			Files.lines(path).forEach(line -> System.out.println(line));
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader reader2 = new BufferedReader(new FileReader(""));
		
		try {
			
			Scanner scan = new Scanner(new File("dat\\score.txt"));
			//System.out.println(scan.nextLine());
			//System.out.println(scan.nextLine());
			//System.out.println(scan.nextLine());
			//System.out.println(scan.nextLine());
			//System.out.println(scan.nextLine());
			
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			System.out.println();
			
			//5. 디렉토리로부터(dir.listFiles())
			Path dir = Paths.get("C:\\dev\\eclipse");
			Files.list(dir).forEach(p -> {
				//System.out.println(p.getFileName());
				File f = p.toFile();// Path > 변환 > File
				System.out.println(f.getName());				
			});
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void m2() {
		
		//배열(컬렉션) 탐색
		int[] nums1 = Data.getIntArray(10);
		List<String> txt1 = Data.getStringList(10);
		
		//1. for문(while문)
		for (int i=0; i<nums1.length; i++) {
			System.out.printf("%4d", nums1[i]);
		}
		System.out.println();
		
		//2. 향상된 for문 == forEach
		for (String s : txt1) {
			System.out.printf(" %s ", s);
		}
		System.out.println();
		
		//3. iterator
		Iterator<String> iter = txt1.iterator();
		while (iter.hasNext()) {
			System.out.printf(" %s ", iter.next());
		}
		System.out.println();
		
		//4. stream
		//4.1 데이터 소스로부트 스트림을 얻기
		IntStream stream1 = Arrays.stream(nums1);
		Stream<String> stream2 = txt1.stream();
		
		//4.2 스트림을 통해서 요소 접근 + 여러가지 조작
		
		IntConsumer ic = n -> {
			System.out.println("추상 메서드 호출");
			System.out.println(n);
		};
		//ic.accept(10);
		stream1.forEach(ic);
		
		stream2.forEach(str -> System.out.println(str));
		System.out.println();
		
		//숫자 10개 > 출력
		Data.getIntList(10).stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println();
		});
		
	}

	private static void m1() {
		
		int[] nums1 = Data.getIntArray();
		//System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = Data.getIntArray(10);
		//System.out.println(Arrays.toString(nums2));
		
		List<Integer> nums3 = Data.getIntList();
		//System.out.println(nums3);
		
		List<Integer> nums4 = Data.getIntList(5);
		System.out.println(nums4);
		
		String[] txt1 = Data.getStringArray(5);
		System.out.println(Arrays.toString(txt1));
		
		User[] ulist = Data.getUserArray();
		//System.out.println(Arrays.toString(ulist));
		
		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));
		
		//숫자, 문자열, User, Item
		
		
	}
	
}

class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
	
		return String.format("%s(%d)", this.name, this.age);
	}
	
	@Override
	public int hashCode() {
		//객체의 상태값 비교
		return (this.name + this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == obj.hashCode();
	}
	
}






















