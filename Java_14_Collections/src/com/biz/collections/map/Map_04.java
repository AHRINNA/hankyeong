package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

import com.biz.collections.model.GradeVO;

/*
 * 데이터를 저장할 때 Key, Value의 쌍으로 put한다
 * 데이터를 검색할 때 Key값만으로 Value를 찾는다
 */
public class Map_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, GradeVO> grades = new HashMap<String, GradeVO>();
		GradeVO vo = new GradeVO();

		vo.setStrName("홍길동");
		vo.setIntKor(90);
		vo.setIntEng(95);
		vo.setIntMath(77);
		grades.put("홍길동", vo);

		// vo = new GradeVO();
		vo.setStrName("이몽룡");
		vo.setIntKor(97);
		vo.setIntEng(77);
		vo.setIntMath(87);
		grades.put("이몽룡", vo);

		// vo = new GradeVO();
		vo.setStrName("성춘향");
		vo.setIntKor(92);
		vo.setIntEng(58);
		vo.setIntMath(78);
		grades.put("성춘향", vo);
		
		System.out.println("성춘향의 성적 : " + grades.get("성춘향").toString());
	}

}
