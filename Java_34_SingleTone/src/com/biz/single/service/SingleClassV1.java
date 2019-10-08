package com.biz.single.service;

public class SingleClassV1 {
	/*
	 * thread 환경에서 매우 불안정한 상태로 존재하는 싱글클래스
	 * 이 상태로 사용하게 되면 프로젝트 전반에 많은 문제들을 일으킬 수 있다
	 */
	private static SingleClassV1 myObject = new SingleClassV1();
	// 프로젝트가 시작될 때 myObject란 인스턴스로 생성, 초기화
	
	
	private SingleClassV1() {
		// 생성자를 private하여 new SingleClassV1 생성자를 사용할 수 없도록
		// TODO Auto-generated constructor stub
	}
	
	public static SingleClassV1 getInstance() {
		return myObject;
	}
}
