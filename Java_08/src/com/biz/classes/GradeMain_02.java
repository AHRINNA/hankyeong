package com.biz.classes;

import com.biz.classes.grade.GradeNew;

public class GradeMain_02 {
	public static void main(String[] args) {
		GradeNew grade01 = new GradeNew();

		// grade01 인스턴스의 멤버변수에 값을 세팅
		grade01.strNum = "001";
		grade01.strName = "홍길동";
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;

		GradeNew grade02 = new GradeNew();

		grade02.strNum = "002";
		grade02.strName = "이몽룡";
		grade02.intKor = 88;
		grade02.intEng = 66;
		grade02.intMath = 78;

		GradeNew grade03 = new GradeNew();

		grade03.strNum = "003";
		grade03.strName = "이몽룡";
		grade03.intKor = 98;
		grade03.intEng = 78;
		grade03.intMath = 68;
		
		System.out.println("===============================================");
		System.out.println("\t\t응용SW 성적표");
		System.out.println("-----------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t영어\t총점");
		System.out.println("-----------------------------------------------");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		
		
/*
		System.out.println("001 학생의 성적");
		System.out.printf("국어 : %d\n", grade01.intKor);
		System.out.printf("영어 : %d\n", grade01.intEng);
		System.out.printf("수학 : %d\n", grade01.intMath);

		int intSum = grade01.intKor + grade01.intEng + grade01.intMath;

		System.out.printf("총점 : %d\n", intSum);
		
		
		System.out.println("002 학생의 성적");
		System.out.printf("국어 : %d\n", grade02.intKor);
		System.out.printf("영어 : %d\n", grade02.intEng);
		System.out.printf("수학 : %d\n", grade02.intMath);

		intSum = grade02.intKor + grade02.intEng + grade02.intMath;

		System.out.printf("총점 : %d\n", intSum);
		
		System.out.println("003 학생의 성적");
		System.out.printf("국어 : %d\n", grade03.intKor);
		System.out.printf("영어 : %d\n", grade03.intEng);
		System.out.printf("수학 : %d\n", grade03.intMath);

		intSum = grade03.intKor + grade03.intEng + grade03.intMath;
		System.out.printf("총점 : %d\n", intSum);
*/
	}
}
