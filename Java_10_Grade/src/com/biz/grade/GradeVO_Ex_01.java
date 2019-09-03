package com.biz.grade;

import com.biz.grade.service.GradeVoService;

public class GradeVO_Ex_01 {

	public static void main(String[] args) {
		
		GradeVoService gs = new GradeVoService(20);
		gs.input();
		gs.total();
		gs.rank();
		gs.view();
		gs.sort();
		gs.view();
		
		
		int sum = 0;
		int[] test = new int[10]; // 임의의 숫자가 할당되었다고 가정
		for(int i = 0; i < test.length; i++) { // 합을 구하는 반복문
			sum += test[i];
		}
		// test 배열에 저장된 숫자의 평균
		// int avg1 = sum / test.length;
		float avg = sum / test.length;
		
	}

}
