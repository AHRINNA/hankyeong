package com.biz.method;

import com.biz.method.service.CalcService;

public class MethodEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// main에서 할 일을 calcservice를 이용해서 대신 처리하고자 하는 것
		CalcService cs = new CalcService();
		for(int i = 0; i < 10; i++)
		{
			cs.addNum();
			// calcservice클래스에 정의된 addNum이 뭘하는진 몰라도 아무튼 10번 하셈
		}
		
		for(int i = 0; i < 5; i++) {
			cs.addNum(23);
			// addNum(정수)가 무슨 일을 하는진 몰라도 23을 넣어주고 아무튼 5번 실행
		}
		cs.addNum(32, 55);
		// addNum(정수, 정수)가 무슨 일을 하는진 몰라도 32랑 55를 넣고 아무튼 실행
		int result = cs.addNum(32,  55);
		// 뭐하는진 몰라도 아무튼 실행하고 result에 삽입
		
		System.out.println(result);
	}

}
