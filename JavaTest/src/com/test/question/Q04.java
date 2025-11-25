package com.test.question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("섭씨(℃): ");
        double celsius = Double.parseDouble(reader.readLine());

        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("섭씨 %.1f\u00B0C는 화씨 %.1f\u00B0F입니다.\n", celsius, fahrenheit);
    }
}
