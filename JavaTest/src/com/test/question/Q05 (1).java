package com.test.question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("사용자가 페달을 밟은 횟수: ");
        int count = Integer.parseInt(reader.readLine());

        double circumference = 26 * 3.14 * 0.0254; // cm
        double distance = circumference * count; // m
        	//파이 때문에 숫자 틀어짐...ㅠㅠ
        System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm을 달렸습니다.\n", count, distance);
    
    }
}