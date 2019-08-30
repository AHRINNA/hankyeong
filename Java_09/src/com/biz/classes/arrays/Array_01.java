package com.biz.classes.arrays;

public class Array_01 {
	public static void main(String[] args) {

		String[] str = new String[10]; // 문자열 10개를 저장할 배열을 생성
		int[] iNum = new int[10]; // 정수값 10개를 저장할 배열 생성
		float[] fNum = new float[10]; // 실수값 10개를 저장할 배열 생성
		
		// 배열에 접근하여 값을 할당. 배열[배열첨자] 형식으로 지정
		str[0] = "대한민국";
		str[1] = "우리나라";
		str[2] = "Republic of Korea";
		
		System.out.println(str[1]);
		// System.out.println(str[10]); 첨자는 0부터 시작이다

		// 배열
		iNum[0] = 10;
		iNum[1] = 30;
		iNum[3] = 40;
		iNum[9] = 100;
		

	}
}
