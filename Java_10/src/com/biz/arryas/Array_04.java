package com.biz.arryas;

import java.util.Random;

// 배열 요소의 정렬

public class Array_03 {
	public static void main(String[] args) {

		int[] nums = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
		// 정렬을 위해서 배열의 개수만큼 반복문을 시작
		for(int i = 0; i < nums.length; i++) {
			// 배열의 요소 i번째와 i+1번째부터 length -1까지 비교를 해서 큰값을 오른쪽에 저장
			for(int j = i + 1; j < nums.length;j++) {
				if(nums[j] < nums[i]) {
					int temp;
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		for(int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}
}
