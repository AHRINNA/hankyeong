package com.biz.list.grade;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.service.GradeService;
import com.biz.list.service.GradeServiceImp_02;

public class GradeEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// GradeService gs = new GradeServiceImp_01(); // 인터페이스로 gs 인스턴스 정의, imp01로 생성
		GradeService gs = new GradeServiceImp_02(); // 인터페이스로 gs 인스턴스 정의, imp01로 생성
		
		List<Integer> nms = new ArrayList<Integer>();
		
		gs.input(10);
		gs.total();
		gs.view();
	}

}
