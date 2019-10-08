package com.biz.classes.exec;

public class ClassEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 30;
		int num2 = 40;

		// 서로 저장된 값을 바꾸고 싶다
		swap(num1, num2);

		int nums[] = new int[2];
		nums[0] = 130;
		nums[1] = 80;
		swap(nums);
		for(int n : nums)
			System.out.println(n);
	}

	public static void swap(int num1, int num2) {
		int t = num1;
		num1 = num2;
		num2 = t;
	}

	public static void swap(int[] nums) {
		int t = nums[0];
		nums[0] = nums[1];
		nums[1] = t;
	}

}
