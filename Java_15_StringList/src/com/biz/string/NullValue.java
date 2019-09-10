package com.biz.string;

import com.biz.string.domain.StudentVO;

public class NullValue {

	public static void main(String[] args) {
		// 변수 선언, 초기화
		int n = 0;
		float m = 0.0f;
		String s = "";
		
		StudentVO vo = null;
		String st = null;
		int n1 = 0; // 키워드 첫글자가 소문자로 선언되는 원시변수는 고유값으로 초기화. 배열로 선언하면 참조형으로 변경된다
		Integer n2 = null; // 아무런 값도 없는 것과 0값으로 초기화하는 것은 아주 큰 차이가 있다
		Float m1 = null; // 변수선언키워드 첫글자가 대문자로 선언되는 것은 type형 변수. null로 클리어 할 수 있다. 클리어하지 않고 선언만도 가능
		Double a1 = null;
		Boolean c1 = null;
		Character b1 = null;
	}

}
