package com.biz.classes.user;

public class User_033 {
	
	// class 변수 영역(Scope). class의 멤버변수 영역
	// 이 영역의 변수는 최초에 프로젝트가 시작될 때
	// 선언, 생성, 초기화 된 후 더 이상 실행되지 않는다 
	
	
	public static int nCount = 0; // 전역변수
	
	public static void count() {
		//int nCount = 0; // count method가 호출될 때마다 nCount가 새로 생성되어 초기화
		nCount++;
		System.out.println(nCount + "번째 호출");
	}
}
