package com.biz.arryas.exec.member;

import com.biz.arryas.model.MemberVO;
import com.biz.arryas.service.MemberService;

public class MemberEx_01 {

	public static void main(String[] args) {

		MemberService ms = new MemberService();
		// ms 객체를 생성하면 생성자 method의 내용이 호출된다

		MemberVO[] mVOs = ms.getMemberVO();
		for (int i = 0; i < mVOs.length; i++) {
			System.out.println(mVOs[i].strName);
		}

	}

}
