package com.biz.grade.service;

import java.util.Random;

import com.biz.grade.model.GradeVO;

public class GradeVoService {
	private GradeVO[] gradeVO;
	Random rnd;

	public GradeVoService(int length) {
		gradeVO = new GradeVO[length];
		for (int i = 0; i < gradeVO.length; i++) {
			gradeVO[i] = new GradeVO();
		}

		rnd = new Random();
	}

	public void input() {
		for (int i = 0; i < gradeVO.length; i++) {
			gradeVO[i].strNum = String.format("%05d", i + 1);
			gradeVO[i].intKor = rnd.nextInt(50) + 51;
			gradeVO[i].intEng = rnd.nextInt(50) + 51;
			gradeVO[i].intMath = rnd.nextInt(50) + 51;
		}
	}
	
	int tKor, tEng, tMath, tTotal, tAvg, aAvg;
	
	public void total() {
		for (int i = 0; i < gradeVO.length; i++) {
			gradeVO[i].intSum = gradeVO[i].intKor + gradeVO[i].intEng + gradeVO[i].intMath;
			gradeVO[i].intAvg = gradeVO[i].intSum / 3;

		}
	}
	public void view() {
		System.out.println("=================================================");
		System.out.println("성적표");
		System.out.println("-------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		for (int i = 0; i < gradeVO.length; i++) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%5d\t%3d\t%3d\n", gradeVO[i].strNum, gradeVO[i].intKor,
					gradeVO[i].intEng, gradeVO[i].intMath, gradeVO[i].intSum, gradeVO[i].intAvg, gradeVO[i].intRank);
			tKor += gradeVO[i].intKor;
			tEng += gradeVO[i].intEng;
			tMath += gradeVO[i].intMath;
			tTotal += gradeVO[i].intSum;
			tAvg += gradeVO[i].intAvg;
		}
		// 총점의 평균 aAvg = tTotal / (gradeVO.length * 3);
		aAvg = tAvg / gradeVO.length; // 평균의 평균. int형이라 소수점이 절삭되며 총점의 평균과 평균의 평균은 약간 다른 값이 나온다 
		System.out.println("=================================================");
		System.out.printf("  \t%3d\t%3d\t%3d\t%5d\t%3d\n\n", tKor, tEng, tMath, tTotal, aAvg);
	}

	/*
	 * 총점을 기준으로 내림차순 정렬하고 배열개수만큼 각 값을 intRank에 저장하여 랭크. 동점자 처리는 하지 않는다
	 */
	public void rank() {
		for (int i = 0; i < gradeVO.length; i++) {
			for (int j = i + 1; j < gradeVO.length; j++) {
				if (gradeVO[i].intSum < gradeVO[j].intSum) {
					GradeVO temp; // 같은 형식의 클래스로 임시 객체를 만들어 객체에서 객체로 통으로 데이터를 할당한다
					temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = temp;
				}
			}
		}
		for (int i = 0; i < gradeVO.length; i++) {
			gradeVO[i].intRank = i + 1;
		}
	}

	public void sort() { // 학번 순으로 오름차순 ASC 재정렬
		for (int i = 0; i < gradeVO.length; i++) {
			for (int j = i + 1; j < gradeVO.length; j++) {
				if (Integer.valueOf(gradeVO[i].strNum) > Integer.valueOf(gradeVO[j].strNum)) {
					GradeVO temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = temp;
				}
			}
		}
	}
}
