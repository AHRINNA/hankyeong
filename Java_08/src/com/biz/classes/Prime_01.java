package com.biz.classes;

import java.util.Scanner;

public class Prime_01 {
	public static void main(String[] args) {
		
		// 입력을 받은 숫자가 소수인지 확인해주는 프로그램
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		String strNum = scanner.nextLine();
		int n = Integer.valueOf(strNum); 
		int index;
		for(index = 2; index < n; index++)
		{
			if(n % index == 0) break;
			
		}
		if(index >= n) {
			System.out.println(n + "는 소수(Prime)");
		}
		else {
			System.out.println(n + "는 소수가 아니다");
		}
		
		
		// 2부터 n까지 숫자 중 소수만 표기
		/*
		 * 
		 */
		
	}
}
