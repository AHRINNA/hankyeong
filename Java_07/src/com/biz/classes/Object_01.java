package com.biz.classes;

public class Object_01 {
	public static void main(String[] args) {
		
		// 클래스를 객체로 생성, 선언, 초기화
		// 객체의 이름은 보통 클래스의 이름 첫글자를 소문자로 하여 명명. 추가 객체는 뒤에 숫자나열
		Class_01 class_01 = new Class_01();
		Class_01 class_01_01 = new Class_01();
		Class_01 class_01_02 = new Class_01();
		Class_01 class_01_03 = new Class_01();
		
		// 객체끼리는 서로의 변수들에 관여하지 않는다
		
		class_01.method_01();
		
		class_01_01.strMember = "대한민국";
		class_01_01.method_01();
		
		class_01.method_01();
	}
}
