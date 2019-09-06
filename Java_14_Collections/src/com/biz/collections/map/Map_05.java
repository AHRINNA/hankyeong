package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.biz.collections.model.GradeVO;

public class Map_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, GradeVO> grades = new HashMap<String, GradeVO>();
		GradeVO vo = new GradeVO();

		vo.setStrName("홍길동");
		vo.setIntKor(90);
		vo.setIntEng(95);
		vo.setIntMath(77);
		grades.put("홍길동", vo);

		vo = new GradeVO();
		vo.setStrName("이몽룡");
		vo.setIntKor(97);
		vo.setIntEng(77);
		vo.setIntMath(87);
		grades.put("이몽룡", vo);

		vo = new GradeVO();
		vo.setStrName("성춘향");
		vo.setIntKor(92);
		vo.setIntEng(58);
		vo.setIntMath(78);
		grades.put("성춘향", vo);
		
		// Map은 할당된 데이터 전체를 조회할 때 불편하다
		// 해결을 위해 응용한다. key만 추출하여 set에 담는다. for문을 이용해 추출한 key값을 인덱스로 검색하는 방법
		
		
		Set<String> gradeKeys = grades.keySet();
		for(String s : gradeKeys) {
			GradeVO v = grades.get(s);
			System.out.println(v.toString());
		}
		grades.putAll(grades);
		
	}

}
