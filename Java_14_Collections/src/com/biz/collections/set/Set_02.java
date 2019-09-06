package com.biz.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("홍길동");
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장길산");
		strSet.add("임꺽정");
		strSet.add("장보고");
		
		System.out.println(strSet);
		
		strSet = new TreeSet<String>(); // 중복을 배제하여 가나다순 정렬
		strSet.add("홍길동");
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장길산");
		strSet.add("임꺽정");
		strSet.add("장보고");
		System.out.println(strSet);
	}

}
