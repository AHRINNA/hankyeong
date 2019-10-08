package com.biz.classes.service.parents;

// abstract class : 추상클래스. 미완성된 모양만 가진 클래스. 부모클래스 역할을 수행, interface의 역할도 수행한다
// 부모 클래스 : 주요 기능을 미리 만들어두고 상속받은 클래스가 부모 메소드를 사용하도록 해주는 클래스
// protected 변수도 미리 선언해주고 상속받은 클래스가 접근해서 쓸 수 있게 해준다
// interface : 아직 기능을 구현하진 않았다. 반드시 내용을 구현해야하는 설계도

// 인터페이스이며 일반클래스. 구조 변경이 인터페이스보다 자유롭다


// 부모클래스에서 기능을 만들어 자식클래스에 물려줄 때는 메소드 코드를 모두 구현을 하고,
// 기능구현을 자식클래스에 일임하고자 할 땐 abstract를 선언해서 내부코드 없이 만든다(추상메소드)

// 자식클래스에선 부모클래스에 abstract 메소드는 반드시 메소드 원형(prototype)이라도 생성해야한다
public abstract class RemoconABSV2 {
	protected String name;

	public RemoconABSV2() {
		// TODO Auto-generated constructor stub
		name = "나는 리모콘입니다";
	}

	public void power() {
		System.out.println(name);
	}

	public abstract void volUp();

	public abstract void volDown();

	public abstract void chUp();

	public abstract void chDown();

	public abstract void setName(String string);


}
