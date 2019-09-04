package com.biz.list.model;

public class StudentVO {
	
	// private는 외부에서 직접 접근하지 못하도록 제한을 한다
	
	private int intNum;
	private String strName;
	
	private String dept; // 전공
	private int intGrade; // 학년
	
	private String strTel;
	private String strAddr;
	
	// private로 선언된 것들에 접근할 수 있도록 통로를 형성해야한다
	
	
	// private으로 정보가 은닉된 멤버 변수를 외부에서 접근하도록 만들어주는 getter, setter 메소드
	
	// 학번을 외부에서 접근해 읽을 메소드
	public int getIntNum() {
		return intNum;
	}
	
	// 학번에 저장할 메소드
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getIntGrade() {
		return intGrade;
	}

	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	public String getStrTel() {
		return strTel;
	}

	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	
}
