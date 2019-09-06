package com.biz.iolist.model;

public class GradeVO {
	private String strNum, strName;
	private int intKor;

	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GradeVO(String str) {
		strNum = str;
	}
	public GradeVO(String strNum, String strName, int intKor) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.intKor = intKor;
	}

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

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
/*
 * object클래스에 정의된 toString 메소드는 객체가 생성된 주소를 보여주는 메소드다. 자바에서 객체가 생성된 주소는
 * 의미가 없다. vo를 만들 때 ecslipse에 자동코드작성기능으로 toString을 필드에
 * 어떤 값이 세팅되있는지 보여주는 코드로 오버라이드(재정의)한다
 * 
 */
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + "]";
	}

}
