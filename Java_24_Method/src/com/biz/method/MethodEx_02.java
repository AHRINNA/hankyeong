package com.biz.method;

public class MethodEx_02 {
	// 1. 콘솔에 대한민국만세 문자열을 10번 출력
	
	// 가. 콘솔에 대한민국만세를 5번 출력하고
	// 나. 밑줄을 하나 표시하고
	// 다. 다시 콘솔에 대한민국만세를 3번 출력하라
	
	// 2. 마음이 바뀌어서 대한민국만세 문자열 대신 Republic of Korea를 같은 방법으로 콘솔에 출력
	// 또 바꿀 수 있어진다면 문자열을 하나 만들고 해당 문자열로 처리하는 것이 간단하다
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation = "Republic of Korea";
		
		// 1
		for(int i = 0; i < 10; i++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
		}
		
		// 가.
		for(int i = 0; i < 5; i++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
		}
		// 나.
		System.out.println("------------------");
		// 다.
		for(int i = 0; i < 3; i++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
		}
	}
}