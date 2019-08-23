package com.biz.var;

public class Char_String_02 {
	public static void main(String[] args) {
		
		char cA = 'A';
		System.out.println(cA);
		
		String sA = "A";
		System.out.println(sA);
		
		System.out.println(cA+0);//캐릭터형 cA가 ASCII로 변환되어 출력
		System.out.println(cA+4);//캐릭터형 cA가 ASCII로 변환되어 출력
		System.out.println('a'+0);//캐릭터형 a가 ASCII로 변환되어 출력
		System.out.println(sA+0);//문자열 A와 숫자 0이 문자열로 되어 붙여 출력됨
	}
}
