package com.biz.method.service;

import java.util.List;

public class ViewListService {
	public void setListAll() {
		System.out.println("나는 하는일이 하나도 없다");
	}
	
	
	/*
	 * 정수값이 몇개 들어있는 List를 매개변수(파라미터)로 전달받고 리스트를 콘솔에 보여주고
	 * 리스트에 포함된 정수 개수가 몇개인지를 return해준다 
	 */
	public int setListAllAndView(List<Integer> intList) {
		int nSize = intList.size();
		for(int i : intList)
			System.out.println(i);
		return nSize;
	}
}