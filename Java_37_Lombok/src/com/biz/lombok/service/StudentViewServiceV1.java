package com.biz.lombok.service;

import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {
	// FileReader fr;
	// BufferedReader br;
	Scanner s;
	public StudentViewServiceV1() {
		// TODO Auto-generated constructor stub
		s = new Scanner(System.in);
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		for (StudentVO vo : stdList) {
			System.out.printf("학번:%s\t이름:%s\t전화번호:%s\t주소:%s\t학년:%3d\t학과:%s\n", vo.getS_num(), vo.getS_name(),
					vo.getS_tel(), vo.getS_addr(), vo.getS_grade(), vo.getS_dept());
		}
	}

	@Override
	public void view(String name) {
		// TODO Auto-generated method stub
		for (StudentVO vo : stdList) {
			if (vo.getS_name().equalsIgnoreCase(name)) {
				System.out.printf("학번:%s\t이름:%s\t전화번호:%s\t주소:%s\t학년:%3d\t학과:%s\n", vo.getS_num(), vo.getS_name(),
						vo.getS_tel(), vo.getS_addr(), vo.getS_grade(), vo.getS_dept());
			}
		}
	}

	@Override
	public void view(int grade) {
		// TODO Auto-generated method stub
		for (StudentVO vo : stdList) {
			if (vo.getS_grade() == grade) {
				System.out.printf("학번:%s\t이름:%s\t전화번호:%s\t주소:%s\t학년:%3d\t학과:%s\n", vo.getS_num(), vo.getS_name(),
						vo.getS_tel(), vo.getS_addr(), vo.getS_grade(), vo.getS_dept());
			}
		}
	}

	@Override
	public void view(int grGrade, int lessGrade) {
		// TODO Auto-generated method stub
		for (StudentVO vo : stdList) {
			if (vo.getS_grade() >= grGrade && vo.getS_grade() <= lessGrade) {
				System.out.printf("학번:%s\t이름:%s\t전화번호:%s\t주소:%s\t학년:%3d\t학과:%s\n", vo.getS_num(), vo.getS_name(),
						vo.getS_tel(), vo.getS_addr(), vo.getS_grade(), vo.getS_dept());
			}
		}
	}
}
