package com.biz.dp.domain;

public class StudentVO {
	/*
	 * 정보은닉 private 외부에서 접근 불가. 간접적으로 접근할 수 있게 getter, setter 생성 캡슐화. 클래스 내부에서 어떤 일이
	 * 일어나는지 외부에서 알 수 없게. 외부에서 값을 검증하는 코드를 추가하여 논리적으로 잘못된 데이터가 들어가는 것을 막는 일
	 * 
	 * 정보은닉과 캡슐화를 한 VO를 통해 많은 데이터를 처리하려면 객체를 생성하고 setter를 이용해서 필드변수 값을 세팅하는데, 이 방식이
	 * 번거로울 때가 있다. 불편함을 해소하기 위해 생성자에 넣을 값을 전달인자로 받아 객체를 생성하는 방법도 있다
	 */
	private String num;
	private String name;
	private String tel;
	private String addr;
	private int grade;
	private String dept;

	public StudentVO(String num, String name, String tel, String addr, int grade, String dept) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.grade = grade;
		this.dept = dept;
	}
	

	public StudentVO(String num) {
		super();
		this.num = num;
	} // 점진적 생성자
	

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
