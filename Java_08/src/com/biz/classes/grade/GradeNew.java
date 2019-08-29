package com.biz.classes.grade;

public class GradeNew {
	/*
	 * 객체의 정의
	 * 연산을 통해서 얻을 수 없는 데이터를 멤버변수로 정의
	 * 
	 * 멤버 변수를 통해 연산을 하여 얻을 수 있는 항목들로 method()들을 정의한다
	 * 
	 * 이런 과정을 추상화라고 한다. 객체지향 언어를 이용한 프로그래밍에서 매우 중요한 개념
	 */

		// 멤버변수
		
		public String strNum, strName;
		public int intKor, intEng, intMath;
		
		public void sum() {
			int sum = intKor + intEng + intMath;
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + sum / 3);
		}
		
		public void gradeList() {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\n", strNum, strName, intKor, intEng, intMath, intKor+intEng+intMath);
		}
		
}