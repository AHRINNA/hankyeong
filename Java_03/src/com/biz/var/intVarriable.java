package com.biz.var;

public class intVarriable {
	public static void main(String[] args){

		// 정수형 변수. 범위를 넘어가면 오버플로우로 오류
		int intNum = 30; // 기본, 4byte
		long longNum = 30; // 확장, 8byte. 숫자가 크면 뒤에 L을 붙여야한다
	
		
		// 실수형 변수. 범위를 넘어가면 잘라버리고 표기. 부동소수점 사용
		float fNum = 30.0f; // 소수점 이하 6자리. 뒤에 f를 붙여야 함(syntax)
		double dNum = 30.0; // 소수점 이하 16자리
		
	}
}
