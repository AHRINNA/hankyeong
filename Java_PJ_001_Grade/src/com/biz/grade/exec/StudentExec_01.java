package com.biz.grade.exec;

import com.biz.grade.service.StudentListService;
import com.biz.grade.service.StudentListServiceImpV1;
import com.biz.grade.service.StudentScoreService;
import com.biz.grade.service.StudentScoreServiceImpV1;

public class StudentExec_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentListService stList = new StudentListServiceImpV1();
		StudentScoreService stScore = new StudentScoreServiceImpV1();
		
		stList.input(3);
		stList.list();
		
		stScore.input(3);
		stScore.total();
		stScore.avg();
		stScore.rank();
		stScore.list();
	}

}
