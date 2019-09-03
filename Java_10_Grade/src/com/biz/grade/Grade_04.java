package com.biz.grade;

import com.biz.grade.service.GradeServiceV4;

public class Grade_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeServiceV4 gs = new GradeServiceV4(3);
		gs.input();
		gs.view();
		gs.sort();
		gs.view();
	}

}
