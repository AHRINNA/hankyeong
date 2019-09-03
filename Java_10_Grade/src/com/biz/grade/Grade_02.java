package com.biz.grade;

import java.util.Scanner;

public class Grade_02 {
/**
 * 멤버 변수 영역에 선언된 변수들은 종류, 타입에 관계없이 현재 클래스에 선언된 모든 메소드에서 접근 가능
 * 
 * 멤버 변수 접근자
 * private : 현재 클래스에 있는 메소드에서만 접근 가능
 * 현재 클래스에 main 메소드가 있으면 모든 멤버 변수에 static을 붙여야 main에서 접근할 수 있다
 */
	private static int[] intKor;
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		intKor = new int[5];
		 scan = new Scanner(System.in);
		for(int i = 0; i < intKor.length; i++) {
			input(i);
			/* System.out.print("국어점수 : ");
			intKor[i] = Integer.valueOf(scan.nextLine()); */
		}
		scan.close();
		
	}

	public static void input(int index) {
		System.out.print("국어점수 : ");
		intKor[index] = Integer.valueOf(scan.nextLine());
	}
}
