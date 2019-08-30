package com.biz.classes.arrays;

import java.util.Random;

public class Array_02 {
	/*
	 * 10개의 정수형 배열을 만들고 1~10까지 임의의 숫자를 저장한 후 임의의 숫자 1개를 지정하여 배열 몇번째에 있는지 찾기
	 */

	public static void main(String[] args) {

		int[] nums = new int[10];
		Random rand = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(10) + 1;
		}

		int sNum = 3;
		int index;
		for (index = 0; index < nums.length; index++) {
			if (nums[index] == sNum)
				break;
		}
		if (index >= nums.length)
			System.out.printf("NO\n배열에 찾는 값 %d 없음\n", sNum);
		else
			System.out.printf("배열의 %d번째에 찾는 값이 있음\n", index + 1);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
	}
}
