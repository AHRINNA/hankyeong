package com.biz.classes.service.parents;

// abstract class : 추상클래스. 미완성된 모양만 가진 클래스. 부모클래스 역할을 수행, interface의 역할도 수행한다
// 부모 클래스 : 주요 기능을 미리 만들어두고 상속받은 클래스가 부모 메소드를 사용하도록 해주는 클래스
// protected 변수도 미리 선언해주고 상속받은 클래스가 접근해서 쓸 수 있게 해준다
// interface : 아직 기능을 구현하진 않았다. 반드시 내용을 구현해야하는 설계도

// 인터페이스이며 일반클래스. 구조 변경이 인터페이스보다 자유롭다
public abstract class RemoconABS {
	protected String name;

	public RemoconABS() {
		// TODO Auto-generated constructor stub
		name = "나는 리모콘입니다";
	}

	public void power() {
		System.out.println(name);
	}

	public void volUp() {
		System.out.println("볼륨올리기");
	};

	public abstract void volDown();

	public abstract void chUp();
	public abstract void chDown();

}
