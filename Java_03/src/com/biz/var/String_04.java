package com.biz.var;

public class String_04 {
	public static void main(String[] args) {
		String num=0+"";
		
		/* 숫자를 문자열 변수에 저장하려면 변환시켜야한다.
		 * 숫자문자열 뒤에 +""
		 * 문자열은 할당된 변수에 포인터를 저장시키고
		 * 해당 포인터부터 순서대로 문자열이 입력된다
		 * 문자열의 마지막 포인터에는 ""가 있다
		 *  
		 */
		
		
		int intNum1=30;
		num=intNum1+"";
		System.out.println(num);
	}
}
