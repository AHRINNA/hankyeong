package com.biz.classes.user;

public class Exec_New_01 {
	public static void main(String[] args)
	{
		User_01.add(); // static method
		
		User_New_01 u = new User_New_01();
		// 클래스를 객체로 선언, 생성자 선언, 객체를 사용하도록 초기화
		u.add();
	}
	/*
	 * 어떤 클래스 static method는 Class.method로 사용가능
	 * static이 아닌 method는 객체를 생성하여 객체.method로 사용
	 * 이 때 객체는 클래스의 대리자 역할
	 * 
	 * 메소드에 static을 붙이면 클래스가 static해진다
	 * static은 프로젝트 실행시 선언되어 프로젝트 종료시까지 유지된다
	 * 프로젝트에 하나만 필요한 것은 static으로 선언해서 사용
	 */
}
