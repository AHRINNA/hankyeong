package com.biz.string.domain;

public class StudentVO { // Value Object크래스들을 저장하는 패키지 이름 model, domain, command
	// Data Transfer Object : VO와 쓰임새가 거의 같다. 혼용해서 사용하는 경우도 있다
	// 일부 프로젝트 패턴에서는 VO와 구별해서 사용한다
	private String strNum, strName, strTel, strAddr;
	private int intAge;

	// 멤버 변수, 필드, 속성으로 호칭
	
	
	
	
	
	// getter setter
	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
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

	public int getIntAge() {
		return intAge;
	}

	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}

	@Override
	public String toString() {
		return "StudentVO [strNum=" + strNum + ", strName=" + strName + ", strTel=" + strTel + ", strAddr=" + strAddr
				+ ", intAge=" + intAge + "]";
	}

	public StudentVO(String strNum, String strName, String strTel, String strAddr, int intAge) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strTel = strTel;
		this.strAddr = strAddr;
		this.intAge = intAge;
	}

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
