package com.biz.arryas.service;

import com.biz.arryas.model.MemberVO;

public class MemberService {

	private MemberVO[] mVO;

	// 생성자 메소드. 리턴 타입의 키워드가 없고 메소드의 이름이 클래스 이름과 같음
	// 클래스를 인스턴스로 생성, 선언, 초기화할 때 자동으로 호출된다
	public MemberService() {
		mVO = new MemberVO[10];
		for (int i = 0; i < mVO.length; i++) {
			mVO[i] = new MemberVO();
			mVO[i].strName = String.format("KO%03d", i);
		}
	}// 배열 10개 생성, 개수만큼 반복하면서 객체 생성, 초기화하면서 임의로 strName에 이름을 저장

	public MemberService(int length) {
		mVO = new MemberVO[length]; // length만큼 배열 선언
		for(int i = 0; i < mVO.length; i++) {
			mVO[i] = new MemberVO();
			mVO[i].strName = String.format("K-%05d", i);
			mVO[i].strTel = String.format("010-%04d-%04d", i+1, i+1);
		}
	}
	
	public MemberVO[] getMemberVO() {
		
		return mVO;
	}
	
	public void memberListView() {
		System.out.println("=================");
		System.out.println("이름\t전화번호");
		System.out.println("-----------------");
		for(int i = 0; i < mVO.length; i++)
		{
			System.out.printf("%s\t%s\n", mVO[i].strName, mVO[i].strTel);	
		}
		System.out.println("=================");
	}

}
