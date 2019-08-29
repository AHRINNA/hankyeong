package com.biz.classes.grade;
/*
 * class를 만들고 멤버 변수, 메소드에 한개라도 static을 붙이면
 * 클래스가 static class가 된다
 * 
 * 프로젝트를 실행하면 JVM이 자동으로 클래스를 생성, 초기화하여 사용할 수 있도록
 * 미리 준비시킨다
 */
public class StaticGrade {

	// 멤버변수
	
	public static String strNum, strName;
	public static int intKor, intEng, intMath;
	
	public static void sum() {
		// staticGrade 클래스의 sum() method의 몸체부분
		int sum = intKor + intEng + intMath;
		System.out.println("총점 : " + sum);
	}
	
}
