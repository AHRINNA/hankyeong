package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

public class ListMakeServiceV1 {
	private List<String> strList;

	public ListMakeServiceV1() {
		// TODO Auto-generated constructor stub
		strList = new ArrayList<String>();
	}
	/*
	 * 외부에서 strList를 가져가게 만드는 메소드
	 */
	public List<String> getStrList(){
		return strList;
	}
	
	public void makeStrList() {
		for(int i = 0; i < 20; i++) {
			String str = String.format("A-%03d", i+1);
			strList.add(str);
		}
	}
}
