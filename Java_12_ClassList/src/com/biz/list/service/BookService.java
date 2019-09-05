package com.biz.list.service;

/*
 * 도서정보를 관리하기위해 Service 클래스를 만들기 전, 설계도를 만드는 interface
 */
/**
 * 
 * @author 505-26
 * @version 2
 * 처음 추상화 당시에 없던 input(int count)를 추가
 * input(int count)는 다수의 정보를 입력받을 때 사용하는 메소드
 */
public interface BookService {
	public void input(); // 도서 정보를 입력받아 리스트로 생성
	public void input(int count);
	public void list(); // 도서 리스트를 콘솔에 표시
	public void view(int index); // 도서 한권의 정보를 콘솔에 표시
	public void view(String strName); // 도서 이름으로 검색해서 정보를 표시. 같은 이름책은 처리안함
	
}
