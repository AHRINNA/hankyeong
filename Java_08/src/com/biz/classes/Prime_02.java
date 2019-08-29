package com.biz.classes;

import java.util.Scanner;

public class Prime_02 {

	public static void main(String[] args) {

		PrimeService pService = new PrimeService();
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 키보드로 숫자 입력받아 숫자가 0보다 작으면 종료하고
		 * 그렇지 않으면 입력한 숫자로 checkPrime() 메소드로 보내서 소수인지 판별
		 */

		while (true) {
			System.out.print("숫자 입력(-1입력하면 종료) : ");
			
			// 입력한 문자열형 숫자를 변환. 0보다 작으면 반복문 종료, 크면 checkPrime() 메소드 실행
			String strNum = scanner.nextLine();
			long n = Long.valueOf(strNum);
			
			if(n < 0) break;
			pService.checkPrime(n); // 매개변수를 이용해 담겨있는 전달인자를 전달
			System.out.println("========================");
			
		}
		
		System.out.println("It's OVER");

	}

}
