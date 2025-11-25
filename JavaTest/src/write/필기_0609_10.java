package 필기;

public class 필기_0609_10 {
    0609 첫날
	자바, Java 
	-개발 환경 > JDK
	-실행 환경 > JRE ->최근 JDK에 포함되어 있음
	-코드 편집기, 개발 툴 > Eclipse(무료/교육시 사용), 인텔리제이(유료) (프로그램) 

	JDK 다운로드
	-종류가 많다. 내부 기능은 다 같음, 포장이 다름
	1.ORacle JDK(***) (오라클:회사이름) -> 유료 라이센스 -> 자바 개발중 as 및 전문가 도움
	2.Open JDK (무료) - 배포판 여러개(현업 7~8개), 코레토, 테무린(요즘사용/교육시 사용)
		-Temurin JDK

	JDK, Java Developement Kit - 공구상자
	-Oracle JDK 8, 11, 17(***), 21 (현업기준 4개) / 							https://www.oracle.com/kr/java/technologies/downloads/
		-LTS 버전, Long Term Support (8, 11, 17, 21) - as기간이 긴버젼을 사용해야 안정적, 2~4년에 한번 출시 / http://taewan.kim/post/openjdk/
		-그냥 버전
	//Java SE Development Kit 17.0.12(***) > C:\Program Files\Java\jdk-17\bin > binary(실행파일=프로그램)
	주로 쓰는 3가지 콘솔 프로그램 / 나머진 모름
	-java.exe
	-javac.exe
	-javadoc.exe
	 https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

	Windows x64 Installer로 설치 / 컴프레스드 아카이브(압축해서 다운)

	17.0.x.x -> xx는 별 영향 없음
	17.0.12
	17 - major version
	 0 - minor version
	12- patch version

	Window 클릭 > 터미널, 명령 프롬프트 실행, 콘솔(텍스트로만 구성된 프로그램 실행환경)

	마소 스토어에서 다운로드
	터미널(Windows PowerShell)
	반디집 / 개발자 공부시 라이센스에 대해서 잘 생각해야 됨 ex)알집 라이센스->유료 / 이미지, 폰트

	C:\Program Files\Java\jdk-17\bin > 마우스 우클릭 > 터미널 열기 ->삭제
	-java.exe
	//

	Temurin JDK 17 LTS 다운로드 / https://adoptium.net/temurin/releases/?os=any&arch=any&package=jdk&version=17
	window 버젼
	C:\Program Files\Eclipse Adoptium\jdk-17.0.15.6-hotspot

	환경변수 path 테무린 삭제

	윈도우(gui환경)
	-트리뷰-리스트뷰순으로 파일 찾음(화면)

	터미널(win키 + R->Cmd/notepad/mspaint/calc/explorer/chrome/msedge.exe) / 개발자들은 마우스보단 키보드 단축키로 사용 ->효율성 차이
	-프롬프트(텍스트)

	콘솔 명령어
	1.cd(change directory)
		-폴더간 이동하는 명령어
		-부모폴더: cd ..(띄어쓰기 o)
		-자식폴더: cd 자식폴더명( 일부 작성 tab 사용)

	2.dir(디렉토리)
		-폴더내 파일 내용 확인

	파일 시스템 구조(하드디스크)
	트리-루트노드-노드-리프노드

	환경 변수 등록(필수x,관행o)
	1. JAVA_HOME 등록
		-이클립스에 JDK가 있어야만 구동 - 이클립스에서 java 위치 스캔하기 위해 등록

	2. Path 등록 (CMD 어느 곳에서든 현재폴더에 있는 것 처럼 즐겨찾기) -> 자주쓰는 명령어 등록해두면 좋음
		-기존 Path 변수 > 더블클릭
		-%JAVA_HOME%\bin (\-폴더나누는 구분기호) = C:\Program Files\Eclipse Adoptium\jdk-17.0.15.6-hotspot\bin

	이클립스 다운로드
	-https://www.eclipse.org/downloads/packages/
	-Eclipse IDE for Enterprise Java and Web Developers 로 다운로드 / 웹개발 병행가능

	http;//paper.pe.kr -> 공유도메인

	Hello world
		- 실행 창에 "Hello world" 출력

	폰트 가독성 - jetbrains mono d2coding -> JetBrainsMonoHangul NL (인텔리전스 폰트)

	Java project -> package(폴더/필수/사용목적에 맞게) -> class
		-package write 최소 3개 (협업시 파일 겹칠 확률 줄임/권고사항)

	이클립스 단축키
	ctrl + F11 -> 실행
	ctrl + / 	   -> 단일 라인 주석 / 취소
	ctrl + shift + / -> 다중 라인 주석
	ctrl + shift + \ -> 다중 라인 주석 취소
	이클립스 설정 초기화 -> 워크스페이스(java폴더) 삭제 후 재실행 -> 프로젝트 날라감 -> import projects ->existing ~ 클릭

	영문자 + 숫자 + _ 만 허용됨
	1.폴더명
	2.파일명
	3.유저명
	4.컴퓨명

	올맨/knr 스타일 "{" 위치스타일 프로젝트 팀원과 맞추기 -> 자바는 올맨 스타일 줄 줄이기

	운영체제별로 프로그램을 만들기에는 시간 낭비가 됨 -> 해결하기 위해 나온 언어 Java (표준화 된 통일 된 환경 제공) : 운영체제별로 상이한게 많아 결국엔 실패

	Hello World
	Write once, run anywhere (Java)

	1."Hello.java" 파일 생성 > 코드 작성
		-소스 (파일)
		-이 파일은 그냥 텍스트 파일이다.(프로그램이 아니다.)

	2. $ javac.exe hello.java
		-컴파일(Compile) 작업 (cpu가 처리 할 수 있게 변환) > 컴파일러(Compiler) > javac.exe
		-사람이 사용하는 명령어(표현) >변환> 기계가 사용하는 명령어(표현)
		-산출물 > "Hello.class"(번역본) -> 중간어, 바이트코드
		-다른 언어의 산출물 > 기계어(이진법)으로 작성되어 있다.
		-자바의 산출물 > 기계어 (x), 중간 언어(IL)로 작성되어 이다.
		-두 번 변환 됨.(중간언어(전달용),최종 기계어(운영체제 언어)) / 느리고 비용이 많이 들었으나 기술이 좋아져서 빨라짐.

	3. $ java.exe hello
		- 인터프리터
		- 산출물이 없다.
		- 중간 언어 파일을 최종 기계어로 번역한다.
		- Hello.class(클래스 파일, 바이트 코드, 실행 파일 등)
		- java.exe Hello(.class)
		- java.exe "클래스명"(***)

		=================================================================================================================

	0610

	중간어 -> 소스 - 역컴파일, 디컴파일 시 완벽히 소스 복원 안 됨.

	1.JDK 설치
		-Java Development Tool Kit
		-컴파일 등 도구들을 제공
		-개발자가 사용

	2.JRE 설치
		-JAVA Runtime Environment
		-자바 실행 환경
		-실행(런)

	2.1 JVM, Java virtual Machine
		-Java Interpreter -> 한줄씩 읽어서 바로 실행 , 초기비용이 쌈
		-JIT, Just in Time(지트,지트 컴파일러) -> 반복적인 소비에 강함, 자주 반복되는 코드를 일부를 컴파일 > 메모리에 잠시 저장 + 사용,영구저장x
	2.2 클래스 라이브러리
	2.3 기타 등등

	//main > CTRL + space + enter
		//-Code Assist
		//-Intellisense
		//-코드자동완성
		//-코드 조각(snippets)

	/*
			 * 단축키
			 * home - 문장의 처음으로 이동
			 * end - 문장의 마지막으로 이동
			 * Ctrl + Alt + 방향키 : 복사 붙여넣기
			 * Ctrl + d : 문장 삭제
			 */
			
			// sysout > ctrl + space

	새로운 언어 > 자료형

	자바의 자료형, Data Type
		데이터(자료)의 형태
		데이터의 길이(범위)와 생김새(형태)를 미리 정의하고, 그 정의에 따라 분류해놓은 규칙
		

	자바 자료형의 기준
		1.형태
		2.길이

		자료형
		1. 기본형 >  원시형(primitive Type), 값형(Value Type)
			a.숫자형
			  1. 정수형
				a.byte 
				 -1byte(=8bit)
				 --128~127 > 자바의 byte형
				 - 맨 앞자리 부호 한자리 차지

				b.short
				 -2byte(=16bit)
				 --32,768~32,767
				 

				c.int
				 -4byte(=32bit)
				 --2,147,483,648~2,147,483,647 21억
			
				d.long
				 -8byte(=64bit)
				 --9,223,372,036,854,775,808~9,223,372,036,854,775,807 922경
			
			  2. 실수형
				a.float
				-부동소수점 표기 사용(손실분 생기는 체계)
				-4byte / 소수이하 7자리
				-단정도형
				-부호 1 + 지수 8 + 가수 23


				b.double
				-8byte / 소수이하 15자리
				-복정도형
				-부호 1 + 지수 11 + 가수 52


			b.문자형
				a.char
				-문자를 저장하는 자료형
				-한글, 영어, 숫자, 특수문자 등
				-2byte
				-0 ~ 65525 (부호 비트 없음)
				- ASCII(7bit) > Unicode(16bit)

			c.논리형	
				boolean
				-명제(참,거짓)
				-1byte

		2. 참조형(Reference Type)
			-클래스(class)
			-배열(Array)
			-열거형(enum)
			-인터페이스(Interface)
			-...

	byte(1) > short(2) > int(4) > long(8)

	컴퓨터 저장 공간 용량
	-1B(바이트)
	-1000B = 1KB (현실)
	-1024B = 1KB 
	-1024KB = 1GB
	-1024GB = 1TB
	-16GB = 16,777,216B

}
