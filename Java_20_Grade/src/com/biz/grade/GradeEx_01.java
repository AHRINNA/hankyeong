package com.biz.grade;

import java.util.Map;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.service.GradeServiceV1;
import com.biz.grade.service.ScoreServiceV2;
import com.biz.grade.service.StudentServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		StudentServiceV1 stService = new StudentServiceV1();
		ScoreServiceV2 scService = new ScoreServiceV2();
		String stdFileName = "src/com/biz/grade/학생명부.txt";
		String scoreFileName = "src/com/biz/grade/score.txt";
		try {
			stService.read(stdFileName);
			scService.read(scoreFileName);
			scService.total();
			scService.rank();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, ScoreVO> scList = scService.getScList();
		Map<String, StudentVO> stdList = stService.getStdList();
		
		GradeServiceV1 gs = new GradeServiceV1(); // 기본생성자 호출
		
		gs = new GradeServiceV1(scList); // scList를 보내서 gs객체 생성하며 scList값 초기화
		gs = new GradeServiceV1(stdList, scList); // scList랑 stdList를 보내서 gs인스턴스 생성하면서 초기화
		gs.list();
	}
}
