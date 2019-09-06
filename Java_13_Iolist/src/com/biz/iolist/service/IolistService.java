package com.biz.iolist.service;
// 판매관리
public interface IolistService {
	public void input(); // 판매정보입력 거래일자, 거래시각, 상품이름, 단가, 수량
	public void input(int count); // 몇 개의 데이터를 입력할지 
	public void list(); // 판매정보내역
	// public void view(); // 판매정보 1개 보기
	public void total();
	
}
