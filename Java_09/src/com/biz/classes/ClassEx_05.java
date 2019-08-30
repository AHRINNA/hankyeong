package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_05 {

	public static void main(String[] args) {

		/*
		 * 원시변수, 스트링 변수는 배열을 선언만 해도 자체적으로 초기화하는 코드가
		 * 실행되도록 만들어져 있다. 하지만 사용자가 만든 클래스는 배열을 선언한 후 반드시 초기화를 해주어야한다
		 */
		
		StudentVO[] stVO = new StudentVO[100];
		for(int i = 0; i < 100; i++)
		{
			stVO[i] = new StudentVO();
		}
		
		
		// st01라는 변수명을 코드, 변수 조합으로(st0i, i = 0) 생성할 수 없다
		
	}

}
