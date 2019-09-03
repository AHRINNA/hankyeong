package com.biz.grade;

import java.util.Scanner;

public class Grade_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intKor = new int[5];
		for(int i = 0; i < intKor.length; i++) {
			System.out.print("국어점수 : ");
			intKor[i] = Integer.valueOf(scan.nextLine());
		}
		scan.close();

	}

}
