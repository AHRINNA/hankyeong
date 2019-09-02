package com.biz.arryas.exec;

import com.biz.arryas.service.MemberService;

public class MemberEx_03 {

	public static void main(String[] args) {
		
		MemberService ms1 = new MemberService();// 생성자에 아무 매개변수도 쓰지 않고 호출
		MemberService ms2 = new MemberService(15);// 생성자에 15를 매개변수로 호출
		
		System.out.println("ms1"); 
		ms1.memberListView();
		System.out.println("ms2");
		ms2.memberListView();
	}

}
