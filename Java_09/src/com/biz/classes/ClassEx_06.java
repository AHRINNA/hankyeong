package com.biz.classes;

import java.util.Scanner;

import com.biz.classes.model.StudentVO;

public class ClassEx_06 {

	public static void main(String[] args) {

		/*
		 * 원시변수, 스트링 변수는 배열을 선언만 해도 자체적으로 초기화하는 코드가
		 * 실행되도록 만들어져 있다. 하지만 사용자가 만든 클래스는 배열을 선언한 후 반드시 초기화를 해주어야한다
		 * 
		 * 반복문으로 배열을 초기화한다
		 */
		
		// 배열의 개수를 입력받아 입력받은 integer 범위 내의 개수만큼 초기화하는 코드
		System.out.print("선언할 배열의 개수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		// int arrIndex = Integer.valueOf(scanner.nextLine());
		
		StudentVO[] stVO = new StudentVO[Integer.valueOf(scanner.nextLine())];
		for(int i = 0; i < Integer.valueOf(scanner.nextLine()); i++)
		{
			stVO[i] = new StudentVO();
		}
		
	}

}
