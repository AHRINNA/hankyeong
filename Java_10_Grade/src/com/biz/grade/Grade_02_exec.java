package com.biz.grade;

import java.util.Scanner;

public class Grade_02_exec {

	private static int[] intKor;
	private static Scanner scan;

	public static void main(String[] args) {

		intKor = new int[5];
		scan = new Scanner(System.in);
		for (int i = 0; i < intKor.length; i++) {
			input(i);
		}
		scan.close();

		for (int i = 0; i < intKor.length; i++) {
			view(i);
		} // 메인에서 배열의 개수만큼 반복하며 view 메소드에게 국어점수를 표시하라고 시키는 for
		view(intKor); // intKor 배열을 통째로 view 메소드에 넘기고 알아서 표시
	}

	public static void input(int index) {
		System.out.print((index + 1) + "번의 국어 : ");
		intKor[index] = Integer.valueOf(scan.nextLine());
	}

	public static void view(int index) {
		System.out.println((index + 1) + "번 국어:" + intKor[index]);
	}

	public static void view(int[] intKor) {
		for (int i = 0; i < intKor.length; i++) {
			System.out.println((i + 1) + "번 국어)" + intKor[i]);
		}
	}
}
