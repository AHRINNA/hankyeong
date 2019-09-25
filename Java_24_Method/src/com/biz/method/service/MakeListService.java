package com.biz.method.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeListService {
	Random rnd = new Random();
	List<Integer> intList;

	public List<Integer> getListAll() {
		int num1 = rnd.nextInt();
		int num2 = rnd.nextInt();
		int num3 = rnd.nextInt();

		intList = new ArrayList<Integer>();
		intList.add(num1);
		intList.add(num2);
		intList.add(num3);

		return intList;
	}
	
	/*
	 * 호출하는 곳에서 정수값을 파라미터로 보내주면 length 매개변수에 정수값을 받고
	 * 정수개수만큼 intList를 생성하여 return 해주는 메소드
	 */
	
	public List<Integer> getListAll(int length) {
		intList = new ArrayList<Integer>();
		for(int i = 0; i < length; i++) {
			int num = rnd.nextInt();
			intList.add(num);
		}
		return intList;
	}
}