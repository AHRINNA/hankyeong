package com.biz.classes.grade;

import java.util.Scanner;

public class GradeEx_01 {
	public static void main(String [] args) {
		
		/* 키보드로 한 학생의 성적 정보를 입력 받은 후
		 * GradeVO 클래스의 객체에 저장하고 입력된 정보를 콘솔에 확인
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("성적 정보 입력");
		System.out.println("-----------------------");
		System.out.print("학번 : ");
		String strNum = scanner.nextLine(); // Scanner.nextLine()은 문자열로만 입력을 받는다
		System.out.print("이름 : ");
		String strName = scanner.nextLine();
		System.out.print("국어 : ");
		String strKor = scanner.nextLine();
		System.out.print("영어 : ");
		String strEng = scanner.nextLine();
		System.out.print("수학 : ");
		String strMath = scanner.nextLine();
		
		GradeNew grade = New GradeNew();
		grade.strNum = strNum;
		grade.strName = strName;
		grade.intKor = Integer.valueOf(strKor); // 문자열형 숫자를 정수로 바꾸는 Integer클래스의 valueOf 메소드
		grade.intEng = Integer.valueOf(strEng);
		grade.intMath = Integer.valueOf(strMath);
		
		grade.sum();
	}
}
