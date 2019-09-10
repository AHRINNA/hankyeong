package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;

public class StringServiceImpV1 implements StringService {
	List<String> strList;
	
	public StringServiceImpV1() { // 기본 생성자. 필드에 있는 객체들을 사용할 수 있게 초기화
		strList = new ArrayList<String>();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		String[] strStudent = new String[5];
		strStudent[0] = "길동:서울:010-341";
		strStudent[1] = "춘향:남원:010-222";
		for(int i = 0; i < strStudent.length; i++) {
			System.out.println(strStudent[i]);
		}
		
		String[] strNation = new String[] {"한국", "미국", "프랑스", "영국"};
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}
