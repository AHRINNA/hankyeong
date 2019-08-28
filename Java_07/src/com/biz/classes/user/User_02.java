package com.biz.classes.user;

public class User_02 {
	public static void add() {
		
		int num1 = 30, num2 = 40, num3 = 100;
		int sum = num1 + num2 + num3;
		int avg = sum / 3;
		System.out.printf("%d + %d + %d = %d\n"
				+ "평균 : %d\n", num1, num2, num3, sum, avg);
		
	}
}
