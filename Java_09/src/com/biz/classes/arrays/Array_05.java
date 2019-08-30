package com.biz.classes.arrays;

import com.biz.classes.service.ArrayScanService;

public class Array_05 {

	public static void main(String[] args) {

		ArrayScanService aService = new ArrayScanService(10);
		/*
		 * 클래스를 선언할 때 생성자 메소드를 호출하면 클래스에 정의된 생성자 메소드가 호출된다
		 */
		
		aService.scanArray();
		
	}

}
