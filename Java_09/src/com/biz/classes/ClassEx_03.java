package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_03 {
	public static void main(String [] args) {
		
		// StudentVO를 이용해 학생 10명의 신상정보 저장, 학생 정보와 리스트를 확인하고 싶다
		// 학생 인스턴스 선언문 10개 복제하거나 배열을 이용하는 방법이 있다
		// []는 배열을 선언
		StudentVO[] stVO = new StudentVO[10]; // 10개의 배열을 생성
		

		
		// 객체를 사용할 수 있도록 초기화. 배열은 대괄호가 따라다닌다
		// 배열의 위치는 0부터 시작하며 배열첨자(Array Index)를 대괄호 안에 넣어 접근한다
		
		/*
		 * 현 시점에서 stVO 배열 10개의 연속된 메모리 주소를 사용하겠다고 선언만 되어있다
		 * 이 상황에 stVO[0]의 각 멤버변수에 접근을 시도하면 아직 stVO의 변수들이 초기화가 되지 않아
		 * Exception오류, Runtime에러ㅉ 발생
		 */
		stVO[0].strNum = "001";
		stVO[0].strName = "홍길동";
		System.out.println(strVO[0].strName); // 배열 클래스에 초기화되지 않은 값이 마저 있기 때문에 컴파일러 오류
		
//		stVO[1] = new StudentVO();
		
		
	}
}
