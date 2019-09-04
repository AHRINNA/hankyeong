package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> nums = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i =0; i < 55; i++) {
			int rNum = rand.nextInt();
			nums.add(rNum);
			
		}
		int num = nums.get(30);
		System.out.println(num);
		
		for(int i = 0; i < 55; i++) {
			System.out.println(nums.get(i));
		}
	}

}
