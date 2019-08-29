package com.biz.classes;

import com.biz.classes.grade.GradeNew;
import com.biz.classes.grade.StaticGrade;

/*
 * 다른 패키지에 있는 클래스에 접근하려면 public이 필요하다
 * 다른 패키지에 있는 클래스를 쓰려면 import 패키지가 필요하다
 * 
 * static class는 생성, 초기화 과정을 안거쳐도 접근할 수 있다
 * static이 아닌 class는 인스턴스(객체)로 선언, 생성, 초기화해야 한다
 * 인스턴스는 일반 변수와 비슷한 방식으로 사용된다
 */

public class StartMain {
	public static void main(String[] args) {

		StaticGrade.strNum = "001";
		StaticGrade.strName = "홍길동";

		StaticGrade.intKor = 90;
		StaticGrade.intEng = 88;
		StaticGrade.intMath = 77;

		StaticGrade.sum();
		
		/* 인스턴스로 선언된 클래스들은 서로 별개의 메모리 장소에 존재하므로
		 * 전혀 아무런 영향도 미치지 않는 복제품이다
		 */
		GradeNew gradeNew = new GradeNew();
		gradeNew.strNum = "002";
		gradeNew.strName = "성춘향";
		gradeNew.intKor = 98;
		gradeNew.intEng = 98;
		gradeNew.intMath = 98;
		
		gradeNew.sum();
		
		GradeNew gradeNew01 = new GradeNew();
		gradeNew01.strNum = "002";
		gradeNew01.strName = "성춘향";
		gradeNew01.intKor = 98;
		gradeNew01.intEng = 98;
		gradeNew01.intMath = 98;

		
		
		GradeNew gradeNew02 = new GradeNew();
		gradeNew02.strNum = "002";
		gradeNew02.strName = "성춘향";
		gradeNew02.intKor = 98;
		gradeNew02.intEng = 98;
		gradeNew02.intMath = 98;
	}
}
