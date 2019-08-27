package com.biz.string;

public class String_02 {
	public static void main(String[] args) {
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		//strNation 변수에 어떠한 문자열이 담기든 관계없이 코드의 변화없이 실행을 보장
		//i 값의 변화는 0~length-1까지, 실행회수는 length까지
		for(int i = 0; i < intLength; i++)
		{
			char cA = strNation.charAt(i);
			System.out.printf("%d번째 : %c\n", i, cA);
		}
		// charAt(int index)는 String 배열 0부터 문자열을 characer형에 지정한다
		// index = 위치. 7번째 index = 7번째 위치. index의 시작값은 0이다
		// 배열의 마지막 값은 size(length) -1
		System.out.println("===============");
		for(int i = 0; i < strNation.length(); i++)
		{
			char cA = strNation.charAt(i);
			System.out.printf("%c", cA);
		}
	}
}
