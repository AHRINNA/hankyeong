package com.biz.grade.service;

import java.util.Map;
import java.util.Set;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.util.LineMake;

// 학번		이름		국어		영어		수학		총점		평균		순위
public class GradeServiceV1 {

	Map<String, StudentVO> stdList;
	Map<String, ScoreVO> scList;
	
	public GradeServiceV1() {
		
	}
	public GradeServiceV1(Map<String, ScoreVO> scList) {
		this.scList = scList;
	}
	public GradeServiceV1(Map<String, StudentVO> stdList, Map<String, ScoreVO> scList) {
		this.stdList = stdList;
		this.scList = scList;
	}
	
	/* 3번째 생성자를 쓰면 이하는 필요 없음
	public void setScList(Map<String, ScoreVO> scList) {
		this.scList = scList;
	}
	public void setStdList(Map<String, StudentVO> stdList) {
		this.stdList = stdList;
	}
	*/
	public void list() {
		int length = 60;
		System.out.println(LineMake.make("=", length));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t순위");
		System.out.println(LineMake.make("-", length));
		
		
		
		
		Set<String> keys = scList.keySet();
		for(String key : keys) {
			ScoreVO scVO = scList.get(key);
			StudentVO sdVO = stdList.get(scVO.getNum()); // scVO의 학번을 key값으로 stdList 학생정보도 추출
			System.out.printf("%5s\t%3s\t%3d\t%3d\t%3d\t%3d\t%4.2f%5d\n",
					scVO.getNum(), sdVO.getName(), scVO.getKorScore(), scVO.getEngScore(), scVO.getMathScore(), scVO.getSumScore(), scVO.getAverage(), scVO.getRank());
		}
		
	}
}
