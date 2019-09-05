package com.biz.list.model;

/*
 * 고객관리 주소록 app 디자인
 * 
 * 이름 name, string
 * 주소 addr, string
 * 전화번호 tel, string
 * 핸드폰 hp, string
 * 
 * 포인트 point, int
 * 
 */
public class AddrVO {
	private String strName;
	private String strAddr;
	private String strTel;
	private String strHP;
	private int intPoint;

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}

	public String getStrTel() {
		return strTel;
	}

	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	public String getStrHP() {
		return strHP;
	}

	public void setStrHP(String strHP) {
		this.strHP = strHP;
	}

	public int getIntPoint() {
		return intPoint;
	}

	public void setIntPoint(int intPoint) {
		this.intPoint = intPoint;
	}

}
