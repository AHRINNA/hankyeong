package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV3 {
	private int[] intKor, intEng, intMath, sum;
	private Scanner scan;

	// 생성자 만들기. public 클래스와 같은 메소드 이름. return 타입 없음

	public GradeServiceV3(int length) {
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
	
	private void total(int index) {
		int intTotal = this.intKor[index] + this.intEng[index] + this.intMath[index];
		this.sum[index] = intTotal;
	}
	
	public void input() {
		for(int i = 0; i < intKor.length; i++) {
			this.inputKor(i);
			this.inputEng(i);
			this.inputMath(i);
			
			this.total(i);
		}
	}

	public void view() {
		System.out.println("================");
		System.out.println("성적 일람표");
		System.out.println("----------------");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\t%d\n", intKor[i], intEng[i], intMath[i], sum[i]);
		}
		System.out.println("================");
	}
	public void sort() { // 총점을 기준으로 내림차순(DESC) 정렬. 내용물은 바뀌지 않는 문제 발생
		for(int i = 0; i < sum.length; i++) {
			for(int j = i + 1; j < sum.length; j++) {
				if(sum[i] < sum[j]) {
					int temp = sum[i];
					sum[i] = sum[j];
					sum[j] = temp;
				}
			}
		}
	}
}
