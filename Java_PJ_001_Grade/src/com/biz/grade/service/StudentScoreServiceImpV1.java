package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.grade.model.StudentScoreVO;

public class StudentScoreServiceImpV1 implements StudentScoreService {

	protected List<StudentScoreVO> studentScore;
	protected Random rand;

	public StudentScoreServiceImpV1() {
		studentScore = new ArrayList<StudentScoreVO>();
		rand = new Random();

	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		for (StudentScoreVO vo : studentScore) {
			int total = vo.getIntKor() + vo.getIntEng() + vo.getIntMath();
			vo.setIntTotal(total);
		}
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		for (StudentScoreVO vo : studentScore) {
			int avg = vo.getIntTotal() / 3;
			vo.setIntAvg(avg);
		}
	}

	@Override
	public void rank() {
		// TODO Auto-generated method stub
		int n;
		n = studentScore.size();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				StudentScoreVO voi = studentScore.get(i);
				StudentScoreVO voj = studentScore.get(j);
				StudentScoreVO temp;
				if (voi.getIntTotal() < voj.getIntTotal()) {
					temp = voi;
					voi = voj;
					voj = temp;
					studentScore.set(i, voi); // List.set(index, value)
					studentScore.set(j, voj); // List.set(index, value)
				}
			}
		}
		for (int i = 0; i < n; i++) {
			StudentScoreVO vo = studentScore.get(i);
			vo.setIntRank(i + 1);
		}
	}

	@Override
	public void input(String stre) {
		// TODO Auto-generated method stub
		StudentScoreVO stVO = new StudentScoreVO();
		int k;
		stVO.setStrNum(stre);
		k = rand.nextInt(50) + 51;
		stVO.setIntKor(k);
		k = rand.nextInt(50) + 51;
		stVO.setIntEng(k);
		k = rand.nextInt(50) + 51;
		stVO.setIntMath(k);

		studentScore.add(stVO);
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("=================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("-------------------------------------------------");
		for (StudentScoreVO vo : studentScore) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getIntKor() + "\t");
			System.out.print(vo.getIntEng() + "\t");
			System.out.print(vo.getIntMath() + "\t");
			System.out.print(vo.getIntTotal() + "\t");
			System.out.print(vo.getIntAvg() + "\t");
			System.out.print(vo.getIntRank() + "\n");
		}
		System.out.println("-------------------------------------------------");
	}

	@Override
	public void input(int n) {
		// TODO Auto-generated method stub
//		StudentScoreVO stVO = new StudentScoreVO();
		for (int count = 0; count < n; count++) {
			String str = String.format("%04d", count + 1);
//			stVO.setStrNum(str);
//			studentScore.add(stVO);
			// studentScore.get(count - 1).setStrNum(String.format("%04d", count+""));
			this.input(str);
		}
	}
}
