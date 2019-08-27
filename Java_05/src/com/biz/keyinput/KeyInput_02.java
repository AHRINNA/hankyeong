package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/* System.in
		 * 키보드와 JVM 사이의 전기신로를 2진수 정보로 변환시키는 역할을 하는 클래스
		 * 
		 * new Scanner() 생성자 메소드. new 키워드에 Scanner라는 클래스. 하나로 묶어 생각
		 * scanner 객체를 사용할 수 있도록 생성/초기화를 한다
		 */
		
		// String 클래스의 원래 생성규칙. 생성자를 넣어 초기화한다
		// String strNation = new String("대한민국");
		
		String strKeyIn = new String();
		strKeyIn = scanner.nextLine(); // 모든 프로젝트 진행을 멈추고 키보드 입력-엔터를 기다림
		System.out.printf("키보드에서 입력한 문자열 : %s\n", strKeyIn);
		
	}
}
