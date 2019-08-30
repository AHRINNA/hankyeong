package com.biz.classes;

import java.util.Random;

import com.biz.classes.model.GradeScoreVO;

public class GSEx_02 {
	public static void main(String[] args) {

		Random rnd = new Random(); // JDK에서 제공하는 난수발생기. 인스턴스.next변수형(난수범위);로 사용
		GradeScoreVO[] gsVO = new GradeScoreVO[100];

		for (int i = 0; i < gsVO.length; i++) {
			gsVO[i] = new GradeScoreVO();

			gsVO[i].strNum = String.format("%03d", i + 1);
			gsVO[i].intKor = rnd.nextInt(50) + 51;
			gsVO[i].intEng = rnd.nextInt(50) + 51;
			gsVO[i].intMath = rnd.nextInt(50) + 51;

			gsVO[i].total();
			gsVO[i].average();
		}

		System.out.println("=====================================================");
		System.out.println("성적일람표");
		System.out.println("-----------------------------------------------------");
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\n");

		for (int i = 0; i < gsVO.length; i++) {
			System.out.print(gsVO[i].strNum + "\t");
			System.out.printf("%3d\t", gsVO[i].intKor);
			System.out.printf("%3d\t", gsVO[i].intEng);
			System.out.printf("%3d\t", gsVO[i].intMath);
			System.out.printf("%3d\t", gsVO[i].total);
			System.out.printf("%5.2f\n", gsVO[i].average);
		}
		System.out.println("=====================================================");
		System.out.println();
	}
}
