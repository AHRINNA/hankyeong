package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentVO[] stVO = new StudentVO[10];
		// 객체 선언
		
		stVO[0] = new StudentVO();
		// 0번 클래스 배열의 초기화
		
		stVO[0].strNum = "001";
		stVO[0].strName = "홍길동";
		System.out.println(stVO[0].strName);
	}
	/*
	 * 클래스를 객체배열로 선언했을 때 몇몇 클래스(String 등)을 제외하고 객체배열의 요소 초기화를 해야 접근이 가능
	 * 요소가 전부 초기화가 되지 않은 상태에서 멤버 변수/메소드에 접근하면 NullPointer Exception 오류 발생
	 * 반복문으로 초기화
	 */

}
