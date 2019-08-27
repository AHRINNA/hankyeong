package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Scanner 클래스를 scanner 객체로 만들면서 new Scanner생성자에게 System.in을 연결
		// 의존성 주입(Dependency Injection)라고 한다

		String strList = "";
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("===============");
			System.out.println((i+1)+"번 학생");
			System.out.println("---------------");
			System.out.print("국어 : ");
			String strKor = scanner.nextLine();
			
			System.out.print("영어 : ");
			String strEng = scanner.nextLine();
		
			System.out.print("수학 : ");
			String strMath = scanner.nextLine();
			
			strList += (i+1) + "\t";
			strList += strKor + "\t";
			strList += strEng + "\t";
			strList += strMath + "\n";
		}
		
		System.out.println("======================");
		System.out.println("성적표");
		System.out.println("----------------------");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println(strList);
		System.out.println("======================");
		
		
		/* for(int i = 0; i < 3; i++)
		{
			System.out.println("===============");
			System.out.println((i+1)+"번 학생 성적표");
			System.out.println("---------------");
			System.out.println("국어 : " + strKor);
			
			System.out.print("영어 : ");
			String strEng = scanner.nextLine();
		
			System.out.print("수학 : ");
			String strMath = scanner.nextLine();
		}
		*/

	}
}
