package com.biz.classes.user;

public class User_03 {
	
	// class 변수 영역(Scope). class의 멤버변수 영역
	
	
	// public static int nCount = 0; // 전역변수
	
	public static void count() {
		int nCount = 0; // count method가 호출될 때마다 nCount가 새로 생성되어 초기화
		nCount++;
		System.out.println(nCount + "번째 호출");
	}
}
