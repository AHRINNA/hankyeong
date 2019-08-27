package com.biz.for_if;

public class If_07 {
	public static void main(String[] args) {
		
		int num = 56;
		if(num % 3 == 0 && num % 6 ==0) {
			System.out.printf("%d는 3의 배수이며 6의 배수이다\n", num);
		}
		if(num % 3 == 0 || num % 6 ==0) {
			System.out.printf("%d는 3의 배수거나 6의 배수이다\n", num);
		}
	}
}
