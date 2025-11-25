package com.test.question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q45 {
		
			//문자열 함수 아직 안배워서 쓰지말기
			//산술연산
			// 213 / 100 = 2  // 백자리수 뽑기
			// 213 % 100 = 13 //
			//13 / 10 = 1	  // 십자리수 뽑기
			//13 % 10 = 3	  // 일의자리수 뽑기
	
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("최대 숫자: ");
        int max = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= max; i++) {
            int cnt = 0;

            // 각 자리별로 3, 6, 9 검사 (최대 3자리까지)
            int ones = i % 10;
            int tens = (i / 10) % 10;
            int hundreds = (i / 100) % 10;

            if (ones == 3 || ones == 6 || ones == 9) cnt++;
            if (tens == 3 || tens == 6 || tens == 9) cnt++;
            if (hundreds == 3 || hundreds == 6 || hundreds == 9) cnt++;

            if (cnt == 0) {
                System.out.print(i + " ");
            } else {
                for (int j = 0; j < cnt; j++) {
                    System.out.print("짝");
                }
                System.out.print(" ");
            }
        }
    }
}
		
	
	

