package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.GradeVO;

public class GradeServiceImp_01 implements GradeService {
	private List<GradeVO> gradeList;
	Random rnd;

	public GradeServiceImp_01() { // 생성자로 초기화하여 클래스들 초기화
		gradeList = new ArrayList<GradeVO>();
		rnd = new Random();
	}

	public void input(int size) { // gradeList에 생성할 개수를 메소드에 매개변수로 보냄
		for (int i = 0; i < size; i++) {
			String strNum = String.format("%05d", i + 1);

			// GradeVO 작성
			GradeVO gVO = new GradeVO();
			gVO.strNum = strNum;
			gVO.intKor = rnd.nextInt(50) + 51;
			gVO.intEng = rnd.nextInt(50) + 51;
			gVO.intMath = rnd.nextInt(50) + 51;

			// gradeList에 VO추가
			gradeList.add(gVO);

		}
	}

	public void view() {
		System.out.println("성적 일람표");
		System.out.println("=========================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		for (GradeVO vo : gradeList) {
			System.out.printf("%5s\t", vo.strNum);
			System.out.printf("%3d\t", vo.intKor);
			System.out.printf("%3d\t", vo.intEng);
			System.out.printf("%3d\t", vo.intMath);
			System.out.printf("%3d\t", vo.intTotal);
			System.out.printf("%3d\t", vo.intAvg);
			System.out.printf("%3d\n", vo.intRank);
		}
	}

	public void total() {
		int nSize = gradeList.size();
		for (int i = 0; i < nSize; i++) {

			gradeList.get(i).intTotal = gradeList.get(i).intKor + gradeList.get(i).intEng + gradeList.get(i).intMath;
			gradeList.get(i).intAvg = gradeList.get(i).intTotal / 3;
			// get 메소드는 리스트의 값을 반환한다. get(i).멤버변수로 멤버변수에 접근할 수 있다
		}
	}
}