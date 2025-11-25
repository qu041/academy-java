package com.test.question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("한달 수입 금액(원): ");
        int income = Integer.parseInt(reader.readLine());

        double taxRate = 0.033;
        int tax = (int)(income * taxRate); // 소수점 버림
        int afterTax = income - tax;

        System.out.printf("세후 금액(원): %,d원\n", afterTax);
        System.out.printf("세금(원): %,d원\n", tax);
    }
}
