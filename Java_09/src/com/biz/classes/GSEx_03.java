package com.biz.classes;

import com.biz.classes.model.GradeScoreVO;
import com.biz.classes.service.GradeScoreService;

public class GSEx_03 {

	static public void main(String[] args) {

		// GradeScoreVO[] gsVO = new GradeScoreVO[100];

		GradeScoreService gService = new GradeScoreService();
		gService.newVO(100);
		gService.makeScore();
		gService.scoreList();
		
		// newVO를 호출하면서 100을 매개변수로
	}
}
