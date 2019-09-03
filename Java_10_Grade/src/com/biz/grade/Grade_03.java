package com.biz.grade;

import com.biz.grade.service.GradeService;

public class Grade_03 {

	public static void main(String[] args) {
		GradeService gs = new GradeService(5);
		gs.input();
		gs.view();
	}

}
