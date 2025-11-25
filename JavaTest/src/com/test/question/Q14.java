package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("역의 개수: ");
		int station = Integer.parseInt(reader.readLine());
		
		System.out.print("환승역의 횟수: ");
		int change = Integer.parseInt(reader.readLine());
		
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		int time = Integer.parseInt(reader.readLine());
		
		
		int result = getTime(station, change, time);
		System.out.printf("총 소요 시간은 %d분입니다.\n", result);
		
		
		
	}

	private static int getTime(int station, int change, int time) {
		int transferTime = (time == 1) ? 3 : (time == 2) ? 4 : 5;
		int total = (station - 1) * 2 + change * transferTime;
		
		return total;
		
		
	}

}
