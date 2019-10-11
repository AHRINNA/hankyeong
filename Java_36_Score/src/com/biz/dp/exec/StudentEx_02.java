package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.StudentVO;

public class StudentEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		List<StudentVO> stdList2 = new ArrayList<StudentVO>();
		
		System.out.println(System.currentTimeMillis());
		// 객체생성, setter, list 저장
		for(long i = 0; i < 1000000; i++) {
			StudentVO vo = new StudentVO();
			vo.setNum(String.format("%05d", i));
			stdList.add(vo);
		}
		System.out.println(System.currentTimeMillis());
		
		// 생성자에 필드값 넣어서 add
		for(long i = 0; i < 1000000; i++) {
			stdList2.add(new StudentVO(String.format("%05d", i), "", "", "", 0, ""));
		}
		System.out.println(System.currentTimeMillis());
	}

}
