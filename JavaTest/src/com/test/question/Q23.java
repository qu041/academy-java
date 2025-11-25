package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q23 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		 // 아빠 생일 입력
        System.out.print("아빠 생일(년): ");
        int dadYear = Integer.parseInt(reader.readLine());
        System.out.print("아빠 생일(월): ");
        int dadMonth = Integer.parseInt(reader.readLine());
        System.out.print("아빠 생일(일): ");
        int dadDay = Integer.parseInt(reader.readLine());
        
        // 딸 생일 입력
        System.out.print("딸 생일(년): ");
        int dYear = Integer.parseInt(reader.readLine());
        System.out.print("딸 생일(월): ");
        int dMonth = Integer.parseInt(reader.readLine());
        System.out.print("딸 생일(일): ");
        int dDay = Integer.parseInt(reader.readLine());
        
        Calendar today = Calendar.getInstance();
        
        Calendar dadBirth = Calendar.getInstance();
        dadBirth.set(dadYear, dadMonth - 1, dadDay);
        
        Calendar daughterBirth = Calendar.getInstance();
        daughterBirth.set(dYear, dMonth - 1, dDay);
        
        long fatherTick = dadBirth.getTimeInMillis();
        long daughterTick = daughterBirth.getTimeInMillis();

        System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n"
            , (daughterTick - fatherTick) / 1000 / 60 / 60 / 24 );
        
        
		
		
	}

}
