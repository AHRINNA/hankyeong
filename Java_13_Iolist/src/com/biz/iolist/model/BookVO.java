package com.biz.iolist.model;
/* 클래스를 작성할 때 다른 클래스를 extends(상속)하지 않으면 모든 클래스는 자동으로
 * object 클래스를 상속받는다. object는 객체를 생성하는 등의 몇가지 메소드가 있다
 * 
 */
public class BookVO {
	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intYear;

	public void BookVO(){ // 생성자에 감춰진채 자동으로 실행되는 코드. primitive variable, string인 경우만
		strName = "";
		strWriter = "";
		strComp = "";
		intPrice = 0;
		intYear = 0;
	}
	
	public void BookVO(String name) {
		// 이 생성자는 객체를 생성하면서 매개변수 name의 값을 전달
		// 매개변수가 있는 생성자를 만들게 되면 자동으로 수행하던 생성자는 동작하지 않는다
		this.strName = name;
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
