package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q43 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int computerNum = (int)(Math.random() * 10) + 1; // 1~10
        int userNum = 0;
        int i;

        System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");

        for (i = 1; i <= 10; i++) {
            System.out.print("숫자: ");
            userNum = Integer.parseInt(reader.readLine());

            if (computerNum == userNum) {
                System.out.println("맞았습니다.");
                break;
            } else {
                System.out.println("틀렸습니다.");
            }
            System.out.println();
        }

        System.out.println();
        System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", computerNum);

        if (computerNum == userNum) {
            System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", i);
        } else {
            System.out.println("모든 기회를 실패했습니다.");
        }

        System.out.println();
        System.out.println("프로그램을 종료합니다.");
    }
}
