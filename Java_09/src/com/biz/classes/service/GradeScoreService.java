package com.biz.classes.service;

import java.util.Random;

import com.biz.classes.model.GradeScoreVO;

/* 서비스 클래스는 데이터를 활용하여 다양한 연산을 수행하는 클래스들을 지칭하는 접미사
 * 
 */

public class GradeScoreService {

	private GradeScoreVO[] gradeScoreVO; /* 이 변수는 이 클래스내의 method에서만 접근하고 있다
	 GSEx_03에서 gradeScoreVO 멤버 변수에 접근을 시도한다면 public으로 시작해야한다
	 현재 코드상 이 클래스가 아닌 곳에서 멤버 변수에 접근을 하지 않고 있으므로
	 다른 곳에서 참조, 접근하지 못하도록 해도 된다. 다른 곳에서 참조하지 못하도록 public이 아닌 private으로 설정
	*/

	public void newVO(int length) {

		gradeScoreVO = new GradeScoreVO[length];
		// length만큼 GradeScoreVO 배열을 만들어서 gradeScoreVO 인스턴스에 할당

	}

	public void makeScore() {
		Random rand = new Random();
		for (int i = 0; i < gradeScoreVO.length; i++) {
			gradeScoreVO[i] = new GradeScoreVO();

			String strNum = String.format("%03d", i + 1);
			gradeScoreVO[i].strNum = strNum;
			gradeScoreVO[i].intKor = rand.nextInt(50) + 51;
			gradeScoreVO[i].intEng = rand.nextInt(50) + 51;
			gradeScoreVO[i].intMath = rand.nextInt(50) + 51;
			
			gradeScoreVO[i].total();
			gradeScoreVO[i].average();
		}
	}
	
	public void scoreList() {
		System.out.println("=====================================================");
		System.out.println("성적일람표");
		System.out.println("-----------------------------------------------------");
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\n");

		for (int i = 0; i < gradeScoreVO.length; i++) {
			System.out.print(gradeScoreVO[i].strNum + "\t");
			System.out.printf("%3d\t", gradeScoreVO[i].intKor);
			System.out.printf("%3d\t", gradeScoreVO[i].intEng);
			System.out.printf("%3d\t", gradeScoreVO[i].intMath);
			System.out.printf("%3d\t", gradeScoreVO[i].total);
			System.out.printf("%5.2f\n", gradeScoreVO[i].average);
		}
		System.out.println("=====================================================");
		System.out.println();
	}
	
}
