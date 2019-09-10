package com.biz.string;

import java.util.List;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.ScoreServiceV2;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceImpV1;

public class ScoreEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringService stdService = new StudentServiceImpV1();
		stdService.input(); // 학생정보 생성
		List<StudentVO> stdList = ((StudentServiceImpV1)stdService).getScoreList();
		// StudentServiceImpV1 stdService에서 stdList 추출
		
		StringService sc = new ScoreServiceV2();
		((ScoreServiceV2)sc).setStdList(stdList);
		// stdList를 ScoreService에 주입
		
		sc.input(); // 점수 생성
		sc.list();
	}

}
