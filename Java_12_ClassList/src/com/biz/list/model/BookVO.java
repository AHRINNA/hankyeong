package com.biz.list.model;

/**
 * 도서정보 관리 어플에 사용될 클래스
 * 
 * 추상화 도서명:name, string 저자:writer, string 출판사:company, string 가격:price, int
 * 출판연도:year, int ISBN(International Serial Book Number):num, string
 * 
 * VO:Value Object 데이터를 담는 최소클래스
 * 
 * VO추상화:어떤 필드(멤버변수)를 만들것? 은닉을 위해 접근제한자 private 선언
 * 은닉된 멤버변수 접근을 위해 getter setter 메소드 생성
 * 메소드를 통해 외부클래스에서 접근하게 만들고 메소드에 유효성검사까지 포함시킬 수 있다
 * 
 */
public class BookVO {
	private String strNum, strName, strWriter, strComp;
	private int intPrice, intYear;
	
	
	// String num = vo.getStrNum(); 으로 읽어옴
	public String getStrNum() {
		return strNum;
	}
	
	// setStrNum("~~");
	public void setStrNum(String strNum) {
		this.strNum = strNum;
		// this는 필드에 있는 멤버 변수를 가리키며 우항은 매개변수를 가리킨다
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrWriter() {
		return strWriter;
	}
	public void setStrWriter(String strWriter) {
		this.strWriter = strWriter;
	}
	public String getStrComp() {
		return strComp;
	}
	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntYear() {
		return intYear;
	}
	public void setIntYear(int intYear) {
		this.intYear = intYear;
	}
	
}
