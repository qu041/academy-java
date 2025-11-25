package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q24 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("음식을 받기 원하는 시각");

        System.out.print("시: ");
        int hour = Integer.parseInt(reader.readLine());

        System.out.print("분: ");
        int minute = Integer.parseInt(reader.readLine());

        // 짜장면
        Calendar jjajang = Calendar.getInstance();
        jjajang.set(Calendar.HOUR_OF_DAY, hour);
        jjajang.set(Calendar.MINUTE, minute);
        jjajang.add(Calendar.MINUTE, -10);
        System.out.println();
        System.out.printf("짜장면: %d시 %02d분\n",
            jjajang.get(Calendar.HOUR_OF_DAY), jjajang.get(Calendar.MINUTE));

        // 치킨
        Calendar chicken = Calendar.getInstance();
        chicken.set(Calendar.HOUR_OF_DAY, hour);
        chicken.set(Calendar.MINUTE, minute);
        chicken.add(Calendar.MINUTE, -18);
        System.out.printf("치킨: %d시 %02d분\n",
            chicken.get(Calendar.HOUR_OF_DAY), chicken.get(Calendar.MINUTE));

        // 피자
        Calendar pizza = Calendar.getInstance();
        pizza.set(Calendar.HOUR_OF_DAY, hour);
        pizza.set(Calendar.MINUTE, minute);
        pizza.add(Calendar.MINUTE, -25);
        System.out.printf("피자: %d시 %02d분\n",
            pizza.get(Calendar.HOUR_OF_DAY), pizza.get(Calendar.MINUTE));
		
		
	}

}
