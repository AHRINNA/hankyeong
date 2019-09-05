package com.biz.list.model;

/*
 * 마트를 오픈하면서 판매되는 거래내용을 관리하는 app. 거래내용을 관리할 클래스
 * 
 * 거래일자 date, string
 * 거래시작 time, string
 * 상품이름 productname, string
 * 상품단가 price, int
 * 수량 quantity, int
 * 상품금액 total = 단가 * 수량, int
 */
public class IolistVO {
	private String strDate;
	private String strTime;
	private String strProductName;
	private int intPrice;
	private int intQuantity;
	private int Total;

	// VO객체 생성시 4개의 값이 세팅되도록 매개변수가 있는 생성자를 작성
	public IolistVO(String strDate, String strTime, String strProducName, int intPrice) {
		this.strDate = strDate;
		this.strTime = strTime;
		this.strProductName = strProducName;
		this.intPrice = intPrice;
	}
	
	public IolistVO(String strDate, String strTime, String strProducName, int intPrice, int intQty) {
		this.strDate = strDate;
		this.strTime = strTime;
		this.strProductName = strProducName;
		this.intPrice = intPrice;
		this.intQuantity = intQty;
	}

	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public String getStrTime() {
		return strTime;
	}

	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}

	public String getStrProductName() {
		return strProductName;
	}

	public void setStrProductName(String strProductName) {
		this.strProductName = strProductName;
	}

	public int getIntPrice() {
		return intPrice;
	}

	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}

	public int getIntQuantity() {
		return intQuantity;
	}

	public void setIntQuantity(int intQuantity) {
		this.intQuantity = intQuantity;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

}
