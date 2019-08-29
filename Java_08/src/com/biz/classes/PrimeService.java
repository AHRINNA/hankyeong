package com.biz.classes;

import java.util.Scanner;
/* main method에서 PrimeService.checkPrime(숫자)형식으로 값을 보내면
 * n 변수에 그 값을 저장한다. n 변수에 있는 값이 prime인지 검사한다
 */
public class PrimeService {
	
	public void checkPrime(long n) {
		

		/* Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		String strNum = scanner.nextLine();
		n = Integer.valueOf(strNum);  */
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
		
	}
}
