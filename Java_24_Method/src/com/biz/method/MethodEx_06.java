package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;
import com.biz.method.service.ViewListService;

public class MethodEx_06 {

	/*
	 * MakeListService 클래스의 getListAll(25)를 호출하여 25개 정수값이 담긴 리스트를 생성
	 * ViewLisetService 클래스의 setListAllAndView(리스트)를 호출해서 리스트를 콘솔에 보여주고
	 * 리스트에 있는 정수의 개수 return을 aa에 받았다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeListService ms = new MakeListService();
		List<Integer> aList = ms.getListAll(25);
		
		// 생성된 aList를 viewListService 클래스에 있는 ~~view로 날리고 싶다
		ViewListService vs = new ViewListService();
		vs.setListAllAndView(aList);
		int aa = vs.setListAllAndView(aList);
		System.out.println("AA : " + aa);
	}
}