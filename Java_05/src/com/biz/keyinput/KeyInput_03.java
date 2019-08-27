package com.biz.keyinput;
import java.util.Scanner;

public class KeyInput_03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 객체 선언
		String strIn = ""; // 입력받을 문자열 생성
		
		System.out.printf("입력을 확인받을 문자들을 입력하세요\n입력 : ");
		
		strIn = scanner.nextLine(); // 입력 대기
		System.out.printf("입력 확인 : %s", strIn);
		
	}
}
