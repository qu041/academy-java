package com.test.question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 사용자 입력
        System.out.print("첫번째 숫자: ");
        int n1 = Integer.parseInt(reader.readLine());

        System.out.print("두번째 숫자: ");
        int n2 = Integer.parseInt(reader.readLine());

        String result;

        result = add(n1, n2);
        System.out.println(result);

        result = subtract(n1, n2);
        System.out.println(result);

        result = multiply(n1, n2);
        System.out.println(result);

        result = divide(n1, n2);
        System.out.println(result);

        result = mod(n1, n2);
        System.out.println(result);
    }

    public static String add(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    public static String subtract(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    public static String multiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    public static String divide(int a, int b) {
        double result = (double)a / b;
        return String.format("%d / %d = %.1f", a, b, result);
    }

    public static String mod(int a, int b) {
        return a + " %% " + b + " = " + (a % b); // %% → % 출력용
    }
}
