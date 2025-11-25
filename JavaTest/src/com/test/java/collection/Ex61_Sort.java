package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.smartcardio.CommandAPDU;

public class Ex61_Sort {

	public static void main(String[] args) {
		
		//Ex61_Sort.java
		
		//정렬, Sort
		//- 순서가 있는 데이터 집합에 한해서..
		//- 배열, List (Set, Map XX)
		
		//정렬
		//- 오름차순, 내림차순
		//1. 직접 구현 > 알고리즘
		//2. JDK 제공 기능 > Arrays.sort()
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		
	}

	private static void m6() {
		
		Calendar c = Calendar.getInstance();
		c.set(2025, 2, 15);
		User u1 = new User("홍길동", 1, c, "서울");
		
		User u2 = new User("홍길동", 1, 2025, 5, 30, "서울");
		
		ArrayList<User> list = new ArrayList<User>();
		
		list.add(new User("홍길동", 1, 2020, 7, 1, "서울"));
		list.add(new User("아무개", 3, 2023, 4, 1, "부산"));
		list.add(new User("강아지", 4, 2024, 4, 21, "인천"));
		list.add(new User("고양이", 5, 2021, 2, 18, "광주"));
		list.add(new User("돼지"  , 1, 2022, 7, 6, "제주"));
		list.add(new User("거북이", 2, 2023, 2, 25, "서울"));
		list.add(new User("햄스터", 3, 2023, 8, 15, "부산"));
		list.add(new User("여우"  , 4, 2022, 6, 25, "인천"));
		list.add(new User("이구아나", 2, 2025, 11, 15, "광주"));
		list.add(new User("늑대", 3, 2024, 12, 25, "제주"));
		
		//Arrays.sort()
		//Collections.sort()
		//객체.sort
		
		//Collections.sort(list);
		
		//Comparator 사용 목적
		//1. 단순 자료형(숫자, 문자, 날짜) > 내림차순
		//2. 복합 자료형(객체) > 오름차순, 내림차순
		//3. 복합 자료형(객체) > 다차 정렬 구현
		list.sort(new Comparator<User>() {
			
			@Override
			public int compare(User o1, User o2) {
				
				//return o1.getName().compareTo(o2.getName());
				//return o2.getLevel() - o1.getLevel();
				//return o2.getRegdate().compareTo(o1.getRegdate());
				//return o1.getCity().compareTo(o2.getCity());
				
				//return o2.getLevel() - o1.getLevel();
//				if (o2.getLevel() > o1.getLevel()) {
//					return 1;
//				} else if (o1.getLevel() > o2.getLevel()) {
//					return -1;
//				} else {
//					return o1.getRegdate().compareTo(o2.getRegdate()); // 같을때 다른조건으로 한번더 정렬 가능
//				}
				
				//city(String)
				//서울(1) , 인천(2), 광주(3), 부산(4) ,제주(5) 순으로 정렬하고 싶을때.
				//return o1.getCity().compareTo(o2.getCity());

				//부장4 과장3 대리2 사원1 로 정렬 가능.	
				
					int city1 = -1;
					int city2 = -1;
					
					city1 = getCityNumber(o1.getCity());
					city2 = getCityNumber(o2.getCity());
					
					return city1 - city2;
				
				
				
			}

			private int getCityNumber(String city) {
				//서울(1) , 인천(2), 광주(3), 부산(4) ,제주(5)
				if (city.equals("서울")) return 1;
				else if (city.equals("인천")) return 2;
				else if (city.equals("광주")) return 3;
				else if (city.equals("부산")) return 4;
				else if (city.equals("제주")) return 5;
				
				return -1;
			}
		});
		System.out.println(list);
		
	}

	private static void m5() {
		
		//컬렉션 + 사용자 정의 정렬
		
ArrayList<Integer> nums2 = new ArrayList<>();
		
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(4);
		nums2.add(2);
		
		System.out.println(nums2);
		
//		Collections.sort(nums2, new Comaparator<Integer>() {
//			
//		});
		
		nums2.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2 - o1;
			}
		});
		System.out.println(nums2);
		
ArrayList<String> names2 = new ArrayList<String>();
		
		names2.add("사자");
		names2.add("호랑이");
		names2.add("코끼리");
		names2.add("하이에나");
		names2.add("치타");
		
		
		System.out.println(names2);
		System.out.println();
		
		names2.sort(new Comparator<String>() {

			
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
		
		System.out.println(names2);
		
Calendar[] clist = new Calendar[5];
		
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -5);
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 2);
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -3);
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 4);
		
		clist[4] = Calendar.getInstance();
		
		for (Calendar c : clist) {
			System.out.printf("%tF\n",c);
		}
			System.out.println();
			
			Arrays.sort(clist, new Comparator<Calendar>() {
			    @Override
			    public int compare(Calendar o1, Calendar o2) {
			        return o2.compareTo(o1); // 내림차순
			    }
			});
		
		
	}

	private static void m4() {
		Integer[] nums1 = { 1, 5, 3, 4, 2 };
		
		//내림차순
		//Arrays.sort(nums1, 익명객체);
		Arrays.sort(nums1, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				
				return o2 - o1;
			}
		});
		
		System.out.println(Arrays.toString(nums1));
		
		Calendar[] clist = new Calendar[5];
		
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -5);
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 2);
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -3);
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 4);
		
		clist[4] = Calendar.getInstance();
		
		for (Calendar c : clist) {
			System.out.printf("%tF\n",c);
		}
			System.out.println();
			
			//내림차순 정렬
			Arrays.sort(clist, new Comparator<Calendar>() {

				public int compare(Calendar o1, Calendar o2) {
					
					return o2.compareTo(o1); //내림차순
				}
			});
			for (Calendar c : clist) {
				System.out.printf("%tF\n",c);
			}
				System.out.println();
		
	}

	private static void m3() {
		
		String[] names = { "강아지", "고양이", "병아리", "거북이", "타조", "꿩", "하이에나", "알바트로스", "티라노사우로스" };
			
//		//내림차순
//		Comparator<String> comparator = new Comparator<String>() {
//			
//			@Override
//			public int compare(String o1, String o2) {
//		
//				return o2.compareTo(o1); // 내림차순 익명클래스로 편하게 가능
//			}
//		};
//		Arrays.sort(names, comparator);
		
		//내림차순
				Arrays.sort(names, new Comparator<String>() { // 바로 넣는거 헷갈림...???? 다시 보기
					@Override
					public int compare(String o1, String o2) {
						return o2.compareTo(o1); // 
					}
				});
		System.out.println(Arrays.toString(names));
		
	}

	private static void m2() {
		
		String[] names = { "강아지", "고양이", "병아리", "거북이", "타조" };
		
		//내림차순 정렬
		//- Arrays..?
		//- Collections.sort() > reverse()
		
//		List<String> list = Arrays.asList(names);
//		
//		Collections.sort(list);
//		Collections.reverse(list);
//		
//		System.out.println(list);
		
		//내림차순?
		//void sort(Object[] a, Comparator<Object> c)
	
		
		//Comparator
		//- 인터페이스
		
		MyComaparator my = new MyComaparator();

		Arrays.sort(names, my);
		
		System.out.println(Arrays.toString(names));
	}

	private static void m1() {

		//정렬 대상 > 우위 비교가 가능한 대상
		//1. 숫자
		//2. 문자(열) > 문자코드 > 숫자
		//3. 날짜시간 > 타임스탬프 > 1970년1월1일부터 수치의 양으로 비교
		
		// 숫자, 문자(열), 날짜시간 + 배열, 컬렉션
		//- Array.sort() 
		//- Collections.sort()
		//- Collections.reverse()
		
		//1.a 숫자 + 배열
		int[] nums1 = { 1, 5, 3, 4, 2 };
		System.out.println(Arrays.toString(nums1));
		
		//오름차순 정렬
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
		
		//내림차순 정렬???
		//잠시뒤 ㅋ
		
		//1.b 숫자 + 컬렉션(list)
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(4);
		nums2.add(2);
		
		System.out.println(nums2);
		
		//오름차순
		Collections.sort(nums2); //Collections -> 클래스 , Collection -> 인터페이스
		System.out.println(nums2);
		
		Collections.reverse(nums2);
		System.out.println(nums2);
		
		
		//2.a 문자열 + 배열
		String s1 ="Java";
		String s2 ="java";
		
		System.out.println(s1.compareTo(s2)); //음수시 뒤에가 큰 거
		System.err.println(s1.compareToIgnoreCase(s2)); //대소문자 무시 비교
		System.out.println();
		
		String[] names = { "강아지", "고양이", "병아리", "거북이", "타조" };
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		System.out.println();
		
		//2.b 문자열 + 컬렉션
		ArrayList<String> names2 = new ArrayList<String>();
		
		names2.add("사자");
		names2.add("호랑이");
		names2.add("코끼리");
		names2.add("하이에나");
		names2.add("치타");
		
		Collections.sort(names2);
		System.out.println(names2);
		Collections.reverse(names2);
		System.out.println(names2);
		System.out.println();
		
		//3.a 날짜시간 + 배열
		Calendar[] clist = new Calendar[5];
		
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -5);
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 2);
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -3);
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 4);
		
		clist[4] = Calendar.getInstance();
		
		for (Calendar c : clist) {
			System.out.printf("%tF\n",c);
		}
			System.out.println();
		
		Arrays.sort(clist);
		for (Calendar c : clist) {
			System.out.printf("%tF\n",c);
		}
		System.out.println();
		
		//3.b 날짜시간 + 컬렉션
		ArrayList<Calendar> clist2 = new ArrayList<Calendar>();
		
		clist2.add(Calendar.getInstance());
		clist2.get(0).add(Calendar.DATE, -5);
		
		clist2.add(Calendar.getInstance());
		clist2.get(1).add(Calendar.DATE, 3);
		
		clist2.add(Calendar.getInstance());
		clist2.get(2).add(Calendar.DATE, -4);
		
		clist2.add(Calendar.getInstance());
		clist2.get(3).add(Calendar.DATE, 10);
		
		clist2.add(Calendar.getInstance());
		
		for (Calendar c : clist2) {
			System.out.printf("%tF\n", c);
		}
		
		System.out.println();
		Collections.sort(clist2);
		
		for (Calendar c : clist2) {
			System.out.printf("%tF\n", c);
		}
		System.out.println();
		
		Collections.reverse(clist2);
		for (Calendar c : clist2) {
			System.out.printf("%tF\n", c);
		}
		
		
		
	}
}

//<T> 정렬하려는 집합의 요소 타입 넣기
class MyComaparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		//오름 차순
		//o1 크면 > 양수
		//o2 크면 > 음수
		//내림차순
		//o1 크면 > 음수
		//o2 크면 > 양수
		//return o1.compareTo(o2); //o1 -o2 오름차순
		//return o2.compareTo(o1); //o2 -o1 내림차순
		//return o1.length() - o2.length();
		return o2.length() - o1.length();
		
	}
	
}
