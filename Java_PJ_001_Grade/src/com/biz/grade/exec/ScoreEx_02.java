package com.biz.grade.exec;

import com.biz.grade.service.StudentListService;
import com.biz.grade.service.StudentListServiceImpV1;
import com.biz.grade.service.StudentScoreService;
import com.biz.grade.service.StudentScoreServiceImpV2;

public class ScoreEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentListService stList = new StudentListServiceImpV1();
		StudentScoreService stScore = new StudentScoreServiceImpV2();
		
		stList.input(3);
		stList.list();
		
		stScore.input(3);
		stScore.total();
		stScore.avg();
		stScore.rank();
		stScore.list();
	}

}
