package com.test.question;

import java.util.Scanner;

public class Q83 {
	
	public static void main(String[] args) {
		
		
		
		m1();
		
		
	}

	public static void m1() {
		
		String fName = "";
        int index = -1;

        int sumMp3 = 0;
        int sumJpg = 0;
        int sumJava = 0;
        int sumHwp = 0;
        int sumDoc = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("파일명: ");
            fName = scan.nextLine();

            index = fName.lastIndexOf(".");
            
            if (index > -1 && index < fName.length() - 1) {
                String ext = fName.substring(index + 1).toLowerCase(); // 확장자 소문자로 통일

                switch (ext) {
                    case "mp3": sumMp3++; break;
                    case "jpg": sumJpg++; break;
                    case "java": sumJava++; break;
                    case "hwp": sumHwp++; break;
                    case "doc": sumDoc++; break;
                }
            }
        }

        // 출력
        System.out.printf("mp3 : %d개\n", sumMp3);
        System.out.printf("jpg : %d개\n", sumJpg);
        System.out.printf("java : %d개\n", sumJava);
        System.out.printf("hwp : %d개\n", sumHwp);
        System.out.printf("doc : %d개\n", sumDoc);

        scan.close();
    }
}