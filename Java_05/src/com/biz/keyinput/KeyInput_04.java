package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원가입");
		System.out.println("====================");
		System.out.print("이름을 입력하세요 : ");
		String strName = scanner.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		String strPhone = scanner.nextLine();
		System.out.print("주소를 입력하세요 : ");
		String strAdd = scanner.nextLine();
		
		System.out.println("-------------------");
		System.out.printf("회원가입을 환영합니다\n"
				+ "이름 : %s\n"
				+ "연락처 : %s\n"
				+ "주소 : %s\n", strName, strPhone, strAdd);
		
	}
}
