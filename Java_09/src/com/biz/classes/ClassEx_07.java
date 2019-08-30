package com.biz.classes;

import java.util.Scanner;

import com.biz.classes.model.StudentVO;

public class ClassEx_07 {

	public static void main(String[] args) {

		/*
		 * 원시변수, 스트링 변수는 배열을 선언만 해도 자체적으로 초기화하는 코드가
		 * 실행되도록 만들어져 있다. 하지만 사용자가 만든 클래스는 배열을 선언한 후 반드시 초기화를 해주어야한다
		 * 
		 * 반복문으로 배열을 초기화한다
		 */
		
		// 배열인스턴스.length라는 멤버변수에 배열을 선언시 자바 컴파일러가 자동으로 개수를 저장한다 
		

		
		StudentVO[] stVO = new StudentVO[100];
		for(int i = 0; i < stVO.length; i++)
		{
			stVO[i] = new StudentVO();
		}
		
	}

}
