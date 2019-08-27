package com.biz.for_if;

public class Boolean_01 {
	public static void main(String[] args) {
		
		// JAVA에서 기본적으로 제공하는 변수 형. primitive
		// 변수형 ( type )
		int intNum = 0; // 4byte 크기의 값을 저장하는 정수형
		long longNum = 0L; // 8byte 크기의 값을 저장하는 정수형
		
		float floatNum = 0.0f; // 정밀도(소수점 6-7자리)가 일반형인 실수형
		double doubleNum = 0.0; // float의 2배 정밀도를 가진 실수형
		
		boolean Ye = true; // true, false의 값을 갖는 변수형
		Ye = 3 == 3; // 3은 3인가를 따져 return true
		Ye = 3 > 3; // 3 > 3이 참인가를 따져 return false
		Ye = 2 != 2; // 2가 2랑 다른값인가를 따져 return false
		// 논리회로에서의 ! NOT연산. || OR연산. && AND 연산
		
		char cA = 'A'; // 한개의 문자를 저장. 1byte 크기의 정수형 2byte(한글의 경우)
		
		String strName = "문자열"; // 문자열을 저장하는 클래스지만 변수처럼 간주되는 type
	}
}
