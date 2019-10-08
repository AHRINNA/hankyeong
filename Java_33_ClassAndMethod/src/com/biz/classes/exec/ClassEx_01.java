package com.biz.classes.exec;

public class ClassEx_01 {
	// main이 있는 클래스의 필드영역에 변수를 선언
	// static으로 설정된 메소드에서 필드변수에 접근하려면 필드변수도 static이어야 한다
	static String strName = "홍길동";
	
	// main은 static이며 프로젝트가 시작되면 JVM이 제일 먼저 찾아서 실행하는 메소드. 진입점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strName = "이몽룡";
		getName(strName);
		System.out.println(strName);
	}
	/*
	 * main에서 getName을 호출하면서 strName을 파라미터로 전달했다. 이 때 strName 변수 이름 등과는
	 * 아무런 상관없이 strName에 담긴 값만 전달된다
	 * 
	 * 전달된 파라미터는 getName의 매개변수에 담겨서 메소드 내부로 복사되어 전달된다
	 * getName 내부에서 strName을 변경해도 main에서 참조하는 strName의 주소값은 변하지 않는다
	 * 
	 * call by value
	 */
	public static void getName(String strName) {
		 strName = "성춘향";
	}
}