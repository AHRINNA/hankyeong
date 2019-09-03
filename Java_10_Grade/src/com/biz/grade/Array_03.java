package com.biz.grade;

import java.util.Random;

public class Array_03 {
	public static void main(String[] args) {
		
		int[] intNum = new int[50];
		Random rand = new Random();
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = rand.nextInt(100) + 1;
			if(intNum[i] % 2 == 0)
			{
				System.out.printf("%d번째 %d는 짝수\n", i+1, intNum[i]);
			}
		}
	}
}
