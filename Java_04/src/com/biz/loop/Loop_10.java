package com.biz.loop;

public class Loop_10 {
	public static void main(String[] args) {
		/*
		 * 2개의 변수를 선언하여 덧셈을 계산
		 */
		int num1 = 1, num2 = 100, sum = 0;
		
		for(int i = num1; i <= num2; i++)
		{
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 덧셈 : %d\n", num1, num2, sum);
	}
}
