package com.biz.arryas.exec;

import java.util.Scanner;

import com.biz.arryas.model.MemberVO;

public class MethodEx_02 {
	public static void main(String[] args) {
		
		MemberVO mVO = new MemberVO();
		mVO.strName = "홍길동";
		mVO.strTel = "010-1111-1123";
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 나이를 입력하시오 : ");
		mVO.setIntAge(Integer.valueOf(scan.nextLine()));

		System.out.println("이름 : " + mVO.strName);
		System.out.println("전화번호 : " + mVO.strTel);
		System.out.println("나이 : " + mVO.getIntAge());
	}
}