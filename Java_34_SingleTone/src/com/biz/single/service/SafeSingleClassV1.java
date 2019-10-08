package com.biz.single.service;

public class SafeSingleClassV1 {
	
	private String name;
	private String nation;
	private static SafeSingleClassV1 myObject;
	private SafeSingleClassV1() { // 생성자를 못쓰게 막는 용도의 private
		// TODO Auto-generated constructor stub
	}
	
	// Thread Safe Single Tone 패턴
	public static synchronized SafeSingleClassV1 getInstance() {
		// synchronized는 thread safe 상태가 된다(게으른 초기화 코드. synchronized는 성능상의 이슈가 있다)
		if(myObject == null)
			myObject = new SafeSingleClassV1();
		return myObject;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNation() {
		return nation;
	}
}
