package com.biz.for_if;

public class If_05 {
	public static void main(String[] args) {
		
		int num = 32;
		
		// num 변수에 담긴 값이 3의 배수인가
		if(num % 3 == 0) {
			System.out.println(num + "는 3의 배수");			
		}
		// if는 많은 조건 중 하나의 true를 넣고 else는 false가 아니라 true가 아닌 것이다
		else // if의 조건문 boolean return값이 true가 아니라면 이 명령문을 실행
		{
			System.out.println(num +"는 3의 배수가 아니다");
		}
		
	}
}
