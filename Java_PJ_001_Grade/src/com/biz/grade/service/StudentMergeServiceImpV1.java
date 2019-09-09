package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.grade.model.StudentMergeVO;

public class StudentMergeServiceImpV1 implements StudentMergeService {
	
	
	List<StudentMergeVO> studentScore;
	List<StudentMergeVO> studentList;
	Scanner scan;
	Random rand;

	public StudentMergeServiceImpV1() {
		studentScore = new ArrayList<StudentMergeVO>();
		rand = new Random();
		studentList = new ArrayList<StudentMergeVO>();
		scan = new Scanner(System.in);

	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		for (StudentMergeVO vo : studentScore) {
			int total = vo.getIntKor() + vo.getIntEng() + vo.getIntMath();
			vo.setIntTotal(total);
		}
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		for (StudentMergeVO vo : studentScore) {
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

				StudentMergeVO voi = studentScore.get(i);
				StudentMergeVO voj = studentScore.get(j);
				StudentMergeVO temp;
				if (voi.getIntTotal() < voj.getIntTotal()) {
					temp = voi;
					voi = voj;
					voj = temp;
					studentScore.set(i, voi);
					studentScore.set(j, voj);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			StudentMergeVO vo = studentScore.get(i);
			vo.setIntRank(i + 1);
		}
	}

	@Override
	public void input(String stre) {
		// TODO Auto-generated method stub
		StudentMergeVO stVO = new StudentMergeVO();
		int k;
		String str;
		
		stVO.setStrNum(stre);
		System.out.print("학생의 이름 : ");
		str = scan.nextLine();
		stVO.setStrName(str);
		System.out.print("학생의 주소 : ");
		str = scan.nextLine();
		stVO.setStrAddr(str);
		System.out.print("학생의 전화번호 : ");
		str = scan.nextLine();
		stVO.setStrTel(str);
		System.out.print("학생의 학과 : ");
		str = scan.nextLine();
		stVO.setStrDept(str);
		System.out.print("학생의 입학년도(2011 ~ 2019) : ");
		str = scan.nextLine();
		k = Integer.valueOf(str);
		while (true) {
			if ((k > 2010) && (k < 2020)) {
				break;
			} else {
				System.out.println("잘못된 범위의 값을 입력하였습니다. 다시 입력해주세요");
				System.out.print("학생의 입학년도 : ");
				str = scan.nextLine();
				k = Integer.valueOf(str);
			}
		}
		stVO.setIntGrade(k);
		
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
		for (StudentMergeVO vo : studentScore) {
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