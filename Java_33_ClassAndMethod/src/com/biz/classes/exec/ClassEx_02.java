package com.biz.classes.exec;

import com.biz.classes.service.ClassServiceV1;

public class ClassEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ClassEx_02가 아닌 클래스(ClassServiceV1)에 있는 메소드를 호출
		 */
		ClassServiceV1 c; // 객체 선언
		c = new ClassServiceV1(); // 초기화(인스턴스화)
		// 선언만 하면 객체는 쓸 수 없는 상태. 초기화하여 객체를 인스턴스로 만들어야 사용가능
		String strName = "홍길동";
		c.getName(strName);
		System.out.println(strName);

		String[] strNames = new String[2];
		strNames[0] = "이몽룡";
		strNames[1] = "성춘향";
		for(String s : strNames)
			System.out.println(s);

		c.getName(strNames);
		for (String s : strNames) {
			System.out.println(s);
		}
	}

}
