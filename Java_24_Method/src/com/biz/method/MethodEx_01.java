package com.biz.method;

public class MethodEx_01 {

	public static void main(String[] args) {
		// 두 수의 덧셈을 수행하는 코드를 작성했다. 필요에 따라 두 수의 4칙연산을 수행하는 코드로
		// 업그레이드가 하고 싶다
		
		// ====1번코드. 영원히 30과 40만을 가지고 셈을 한다면 1번이 낫지만
		int sum1 = 30 + 40;
		int minus1 = 30 - 40;
		int times = 30 * 40;
		int dev1 = 30 / 40;
		
		int num1;
		int num2;
		
		num1 = 30;
		num2 = 40;
		
		// ====2번코드. 30과 40을 변경하는 코드를 가지면 2번이 낫다
		int sum2 = num1 + num2;
		int minus2 = num1 - num2;
		int times2 = num1 * num2;
		int dev2 = num1 / num2;
	}

}
