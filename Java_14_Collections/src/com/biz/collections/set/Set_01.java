package com.biz.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		Set<String> strSet = new HashSet<String>();

		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		strList.add("임꺽정");
		strList.add("장길산");
		strList.add("임꺽정");
		strList.add("장보고");

		strSet.add("홍길동");
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장길산");
		strSet.add("임꺽정");
		strSet.add("장보고");

		System.out.println(strList.toString()); // List는 추가한 순서대로 저장, 추가한대로 저장
		System.out.println(strSet.toString()); // Set은 순서가 해시 코드에 따라 삽입, 중복된 데이터를 제외하고 저장

		// List 데이터를 Set으로 변환. List에 담긴 중복값을 제거하고 리스트로 변환할 수 있다
		Set<String> strSet1 = new HashSet<String>(strList);
		System.out.println(strSet1.toString());
		
		strList = new ArrayList<String>(strSet1);
		System.out.println(strList);
	}

}
