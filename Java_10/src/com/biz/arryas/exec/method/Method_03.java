package com.biz.arryas.exec;

import com.biz.arryas.service.MethodPrototype;

public class Method_03 {
	public static void main(String[] args) {
		
		MethodPrototype mt = new MethodPrototype();
		
		/*
		 * mt 클래스에는 view(), mt.ret(), mret() 메소드가 있을 것이며 view는 return이 없으므로 void
		 * ret는 int형 변수에 들어가므로 int형이다
		 * 마찬가지로 mret은 매개변수 2개를 숫자형으로 넣으며 int형이다
		 * ret은 매개변수를 두개 가지는 void형일 것이다
		 */
		mt.view();
		int n = mt.ret();
		mt.mret(30, 40);
		int m = mt.mret(50, 30);
		
	}
}
