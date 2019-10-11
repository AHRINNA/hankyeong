package com.biz.lombok.service;

import java.util.List;

import com.biz.lombok.domain.StudentVO;

public abstract class StudentViewServiceABS {
	protected List<StudentVO> stdList;
	
	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}
	// stdList를 콘솔에
	public abstract void view();
	// 문자열을 전달인자로 받아서 학생 이름을 검색해 일치하는 리스트만
	public abstract void view(String name);
	// 정수값을 전달인자로 받아서 정수값과 일치하는 학년의 리스트만
	public abstract void view(int grade);
	// 시작학년과 끝학년을 받아서 해당 학년 리스트만
	public abstract void view(int grGrade, int lessGrade);
}