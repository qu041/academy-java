package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 숫자: ");
        int n1 = Integer.parseInt(reader.readLine());

        System.out.print("두번째 숫자: ");
        int n2 = Integer.parseInt(reader.readLine());

        int max = 0;
        int min = 0;
        int gap = 0;

        if (n1 > n2) {
            max = n1;
            min = n2;
        } else {
            max = n2;
            min = n1;
        }

        gap = max - min;

        if (max != min) {
            System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다. 두 숫자는 %d(가) 차이납니다.\n", max, min, gap);
        } else {
            System.out.println("두 숫자는 동일합니다.");
        }
		
		
	}

}
