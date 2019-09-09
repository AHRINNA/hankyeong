package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.model.StudentListVO;

public class StudentListServiceImpV1 implements StudentListService {
	List<StudentListVO> studentList;
	Scanner scan;

	/*
	 * 멤버변수 영역에 선언된 객체(object)는
	 * 생성자에서 반드시 초기화를 해주자 
	 */
	public StudentListServiceImpV1() {
		studentList = new ArrayList<StudentListVO>();
		scan = new Scanner(System.in);
	}

	public void input(int n) {
		// StudentListVO stVO = new StudentListVO();
		for (int count = 0; count < n; count++) {
			String str = String.format("%04d", count + 1);
			// stVO.setStrNum(str);
			// studentList.get(count).setStrNum(str);
			this.input(str);
		}
	}

	@Override
	public void input(String stre) {
		// TODO Auto-generated method stub
		StudentListVO stVO = new StudentListVO();
		String str;
		int k;
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

		studentList.add(stVO);
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("=================================================");
		System.out.println("학생명부");
		System.out.println("-------------------------------------------------");
		System.out.println("학번\t이름\t전화번호\t주소\t학과\t학년");
		for (StudentListVO vo : studentList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrTel() + "\t");
			System.out.print(vo.getStrAddr() + "\t");
			System.out.print(vo.getStrDept() + "\t");
			int year = (2019 - vo.getIntGrade()) + 1;
			System.out.print(year + "\n");
		}
		System.out.println("-------------------------------------------------");
	}

}
