package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	/*
	 * 자바의 Collection Framework
	 * 다량의 데이터를 취급하는 용도로 사용되며 기본 배열의 여러가지 단점을 해결하려고 만들어진 클래스들의 모음
	 * List(ArrayList)
	 * 데이터 개수를 지정하지 않고 선언한다. 필요에 따라 개수 증감 가능
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums; // 제네릭<Integer> 사용. int[] nums;
		
		nums = new ArrayList<Integer>(); // nums = new int[0]과 같고 0은 필요에 따라 증감
		nums.add(100);
		nums.add(5);

	}

}
