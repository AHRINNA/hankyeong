package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV2 {
	private int[] intKor, intEng, intMath, sum;
	private Scanner scan;

	// 생성자 만들기. public 클래스와 같은 메소드 이름. return 타입 없음

	public GradeServiceV2(int length) {
		// 여기서 4개의 멤버 배열 변수들을 사용할 수 있도록 생성하는 일을 수행
		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];
		sum = new int[length];
		scan = new Scanner(System.in);
	} // GradeService end

/*	public void input() {
		for (int i = 0; i < intKor.length; i++) {

			sum[i] = intKor[i] + intEng[i] + intMath[i];
		}
	}
	*/

	private void inputKor(int index) {
		System.out.print((index + 1) + "번 국어 :");
		intKor[index] = Integer.valueOf(scan.nextLine());
	}

	private void inputEng(int index) {
		System.out.print((index + 1) + "번 영어 :");
		intEng[index] = Integer.valueOf(scan.nextLine());
	}

	private void inputMath(int index) {
		System.out.print((index + 1) + "번 수학 :");
		intMath[index] = Integer.valueOf(scan.nextLine());
	}
	
	public void input() {
		for(int i = 0; i < intKor.length; i++) {
			this.inputKor(i);
			this.inputEng(i);
			this.inputMath(i);
		}
	}

	public void view() {
		System.out.println("================");
		System.out.println("성적 일람표");
		System.out.println("----------------");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\n", intKor, intEng, intMath);
		}
		System.out.println("================");
	}
}
