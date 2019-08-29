package com.biz.classes.model;

public class AddressVO {

	/* 
	 * 이름, 전화번호, 주소, 관계
	 * 주소정보 확인기능 메소드
	 */
	
	public String strName;
	public String strTel;
	public String strAddr;
	public String strRela;
	
	public void check() {
		
		System.out.println(strName + "님의 주소정보를 확인합니다");
		System.out.println("번호 : " + strTel);
		System.out.println("주소 : " + strAddr);
		System.out.println("관계 : " + strRela);
		
		
	}
	
}
