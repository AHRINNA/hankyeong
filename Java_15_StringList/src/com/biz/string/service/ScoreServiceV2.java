package com.biz.string.service;

import java.util.List;

import com.biz.string.domain.ScoreVO;
import com.biz.string.domain.StudentVO;

public class ScoreServiceV2 extends ScoreServiceV1 {
	List<StudentVO> stdList = null;
	
	// java 패턴에선 특별한 경우가 아니면 private나 protected 권장
	// StudentServiceV2에 멤버변수로 선언된 stdList는 값이 set되있다. ScoreService에서 쓰려면
	// main에서 StudentService로부터 stdList를 get하여 setStdList를 통해 Score에 주입
	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}
	
	public void list() {
		System.out.println("성적");
		System.out.println("--------------------");
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("----------------------");
		for(ScoreVO scVO : scList) { // scList는 선언 초기화가 없지만 V1에서 protected로 상속받았으므로 V2에서도 접근가능
			// 학번을 vo로 추출
			String strNum = scVO.getStrNum();
			StudentVO stVO = this.searchStd(strNum);
			
			String strName;
			String strAddr;
			String strTel;
			if(stVO == null) {
				strName = "(없음)";
				strAddr = "(없음)";
				strTel = "(없음)";
			}else {
				strName = stVO.getStrName();
				strAddr = stVO.getStrAddr();
				strTel = stVO.getStrTel();
			}
			System.out.print(scVO.getStrNum() + "\t");
			System.out.print(strName + "\t");
			System.out.printf("%3d\t", scVO.getIntKor());
			System.out.printf("%3d\t", scVO.getIntEng());
			System.out.printf("%3d\t", scVO.getIntMath());
			System.out.printf("%3d\t", scVO.getIntTotal());
			System.out.printf("%3d\n", scVO.getIntAvg());
			
		}
	}
	
	
	private StudentVO searchStd(String strNum) { // 학번을 매개변수로 넘기고 stdList에 해당정보가 있는지 if문으로 검사 있으면 리턴
		for(StudentVO vo : stdList) {
			if(vo.getStrNum().equals(strNum)) {
				return vo;
			}
		}
		return null;
	}
}
