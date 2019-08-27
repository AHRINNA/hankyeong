package com.biz.string;

public class String_01 {
	public static void main(String[] args) {
		
		// 문자열 변수 선언과 문자열 값 할당
		// 정확하게는 String 클래스 strNation 생성과 할당
		// strNation가 String 클래스의 일부 메소드를 상속받음
		// strNation. 형식으로 해당하는 메소드를 이용할 수 있다
		
		String strNation = "Republic of Korea";
		
		int intLength = strNation.length();
		
		System.out.println(intLength);

		// String.length() 문자열 내에 개수를 정수값으로 return. 공백 포함
		System.out.println(strNation.length());
		
		strNation = "대한민국";
		System.out.println(strNation.length());
		String s1 = "Korea", s2 = "대한민국";
		
		int sum = s1.length() + s2.length();
		System.out.println(sum);
	}
}
