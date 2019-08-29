package com.biz.classes;

import com.biz.classes.student.Student;

public class studentMain {
	public static void main(String[] args) {

		Student student01 = new Student();
		student01.strName = "봉";
		student01.strMajor = "컴퓨터";
		student01.iphak = 2016;
		student01.hakbun = 167361;

		System.out.println("======================================");
		System.out.printf("학생의 개인정보를 열람합니다\n");
		System.out.println("--------------------------------------");		
		student01.studentInfo();

		System.out.println("======================================");
		System.out.println("학생의 리스트를 출력합니다");
		System.out.println("--------------------------------------");
		student01.studentList();

	}
}
