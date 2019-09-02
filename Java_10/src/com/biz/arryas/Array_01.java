package com.biz.arryas;

import java.util.Random;

/*
 * 정수형 배열 100개 선언
 * 배열에 1~10 난수 삽입
 * 배열들에 짝수들의 값만 더해서 콘솔 표기
 */

public class Array_01 {
	public static void main(String[] args) {

		int[] iNum = new int[100];
		Random rand = new Random();
		int sum = 0;

		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = rand.nextInt(10) + 1;
			if (iNum[i] % 2 == 0) {
				sum += iNum[i];
			}
		}
		System.out.printf("%d는 짝수들의 합\n", sum);

	}
}