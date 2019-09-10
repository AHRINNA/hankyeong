package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.string.domain.StudentVO;

public class StudentServiceImpV1 implements StringService {

	List<StudentVO> stdList;
	
	public StudentServiceImpV1() {
		stdList = new ArrayList<StudentVO>();
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		String[] stu = new String[] { "홍길동:서울:010-11:33", "성춘향:남원:010-22:16", "이몽룡:익산:010-33:18"};
		String[] stdArray = stu[0].split(":"); // 콜론을 기준으로 문자열을 분해해서 stdArray 배열에 넣어라
		//stdArray[0]은 홍길동, [1]은 서울, [2]는 010-11, [3]은 33
		int intNum = 1;
		for(String s : stu) { // 문자열 배열 s를 stu까지
			
			StudentVO stVO = new StudentVO();
			String strNum = String.format("%05d", intNum++); // 자동증가되는 번호를 넣는다
			
			stdArray = s.split(":"); // studentVO의 정보가 담긴 s 배열을 : 단위로 분해하여 stdArray 배열에 담는다
			stVO.setStrNum(strNum);
			stVO.setStrName(stdArray[0]); // stdArray에 담긴 인자들을 stVO VO형 인스턴스에 할당
			stVO.setStrAddr(stdArray[1]);
			stVO.setStrTel(stdArray[2]);
			stVO.setIntAge(Integer.valueOf(stdArray[3]));
			
			stdList.add(stVO); // stVO인스턴스에 할당된 값을 stdList 리스트에 할당
		}
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		for(StudentVO vo : stdList) {
			System.out.println(vo.getStrNum());
			System.out.println(vo.getStrName());
			System.out.println(vo.getStrTel());
			System.out.println(vo.getStrAddr());
			System.out.println(vo.getIntAge());
		}
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	// strNum으로 학생정보조회
	public StudentVO search(String strNum) {
		for(StudentVO vo : stdList) {
			if(vo.getStrNum().equals(strNum)) {
				System.out.println("find");
				return vo;
			}
		}
		return null;	
	}
	
	public List<StudentVO> getScoreList(){
		return stdList;
	}
}
