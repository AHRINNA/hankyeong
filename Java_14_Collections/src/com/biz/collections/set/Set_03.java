package com.biz.collections.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Set_03 {
	public static void main(String[] args) {
		Set<Integer> intSet = new TreeSet<Integer>();
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			intSet.add(rand.nextInt(5));
		}
		System.out.println(intSet);
		
		Set<String>strSet = new TreeSet<String>();
		
		for(int i = 0; i < 10; i++) {
			strSet.add(String.format("%02d", rand.nextInt(100))); // 자리수가 안맞으면 문자열은 정렬시 주의해야한다
		}
		System.out.println(strSet);
	}
}
