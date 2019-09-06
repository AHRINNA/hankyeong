package com.biz.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("임꺽정");
		strList.add("장길산");
		strList.add("장보고");

		System.out.println(strList);
		Collections.sort(strList); // strList를 정렬해서 strList에 다시 할당. List 인터페이스로 선언해야 오류x
		System.out.println(strList);
		
		Collections.shuffle(strList); // 매번 List 값의 위치를 섞어버린다
		System.out.println(strList);
	}

}
