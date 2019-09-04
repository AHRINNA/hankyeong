package com.biz.list.service;


// 인터페이스는 메소드를 정의하는 문장만 있고 내용은 비어있으며 {}이 없다
// 다른 클래스를 작성하는 기본바탕설계도 역할을 하며 implement한 클래스는 인터페이스에 정의된
// 메소드를 반드시 구현해야한다

public interface GradeService {
	
	public void input(int size);// gradeList에 생성할 개수를 메소드에 매개변수로 보냄

	public void view();
	
	public void total();
}