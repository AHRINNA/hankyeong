package com.biz.classes;

import com.biz.classes.grade.GradeNew;

public class GradeMain_03 {
	public static void main(String[] args) {
		GradeNew grade01 = new GradeNew();
		GradeNew grade02 = new GradeNew();
		GradeNew grade03 = new GradeNew();
		GradeNew grade04 = new GradeNew();
		GradeNew grade05 = new GradeNew();
		GradeNew grade06 = new GradeNew();
		GradeNew grade07 = new GradeNew();
		// *********************************
		// 성적처리를 위하여 학생 7명 인스턴스 선언
		// -----------------------------------

		// grade01 인스턴스의 멤버변수에 값을 세팅
		
		//******************
		// 학생들의 멤버 변수에 값을 집어넣는 부분
		//---------------
		grade01.strNum = "001";
		grade01.strName = "홍길동";
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;

		grade02.strNum = "002";
		grade02.strName = "이몽룡";
		grade02.intKor = 88;
		grade02.intEng = 66;
		grade02.intMath = 78;

		grade03.strNum = "003";
		grade03.strName = "성춘향";
		grade03.intKor = 38;
		grade03.intEng = 70;
		grade03.intMath = 18;
		
		grade04.strNum = "004";
		grade04.strName = "놀부";
		grade04.intKor = 54;
		grade04.intEng = 17;
		grade04.intMath = 92;
		
		grade05.strNum = "005";
		grade05.strName = "흥부";
		grade05.intKor = 100;
		grade05.intEng = 80;
		grade05.intMath = 47;

		grade06.strNum = "006";
		grade06.strName = "박씨";
		grade06.intKor = 91;
		grade06.intEng = 82;
		grade06.intMath = 77;

		grade07.strNum = "007";
		grade07.strName = "제비";
		grade07.intKor = 44;
		grade07.intEng = 54;
		grade07.intMath = 61;
		
		//******************
		// 학생들의 멤버 변수에 값을 집어넣는 부분
		//---------------

		System.out.println("===============================================");
		System.out.println("\t\t응용SW 성적표");
		System.out.println("-----------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t영어\t총점");
		System.out.println("-----------------------------------------------");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		grade04.gradeList();
		grade05.gradeList();
		grade06.gradeList();
		grade07.gradeList();
		
		

	}
}
