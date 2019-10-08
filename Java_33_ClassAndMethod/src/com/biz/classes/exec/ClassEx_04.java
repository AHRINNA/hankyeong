package com.biz.classes.exec;

public class ClassEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[2];
		nums[0] = 130;
		nums[1] = 80;
		swap(nums);
		for(int n : nums)
			System.out.println(n);
	}
	
	/*
	 * 메소드에서 매개변수로 배열, 객체(String, integer 등 제외), 리스트를 받고
	 * 각 요소들의 값을 변경하면 전달원본데이터의 값도 변경된다
	 * 단, 메소드에서 new로 재생성하면 원본과 다른 변수가 되어 값을 변경해도 영향을 미치지 않는다
	 * 
	 * Call by Reference
	 */
	public static void swap(int[] nums) {
		nums = new int[2];
		nums[1] = 100;
		nums[0] = 200;
	}

}
