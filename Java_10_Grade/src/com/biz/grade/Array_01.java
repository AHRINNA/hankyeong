package com.biz.grade;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intNum = new int[50];
		Random rand = new Random();
		int sum = 0;
		float avg = 0;
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = rand.nextInt(100)+1;
			sum += intNum[i];
		}
		avg = Float.valueOf(sum) / intNum.length;
		System.out.printf("배열에 할당된 수들의 합계 : %d\n"
				+ "배열에 할당된 수들의 평균 : %.2f\n", sum, avg);
		

	}

}
