package com.biz.arryas;

import java.util.Random;

/*
 * 정수형 배열 100개 선언
 * 배열에 1~10 난수 삽입
 * 배열들에 짝수들의 값만 더해서 콘솔 표기
 */

public class Array_02 {
	public static void main(String[] args) {

		int[] iNum = new int[100];
		Random rand = new Random();
		int even = 0;
		int odd = 0;

		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = rand.nextInt(10) + 1;
			if (iNum[i] % 2 == 0) {
				even += iNum[i];
			}
			else {
				odd += iNum[i];
			}
		}
		System.out.printf("%d는 짝수들의 합\n%d는 홀수들의 합\n", even, odd);

	}
}

