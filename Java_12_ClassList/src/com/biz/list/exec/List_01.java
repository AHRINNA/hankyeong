package com.biz.list.exec;

import com.biz.list.model.BookVO;

public class List_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookVO bVO = new BookVO();
		// 도서정보 1개를 데이터로 만들어 값 입력
		bVO.setStrNum("970001");
		bVO.setStrName("DO IT JAVA");
		bVO.setStrWriter("박은종");
		bVO.setStrComp("이지퍼블리싱");
		bVO.setIntPrice(25000);
		bVO.setIntYear(2018);
		
		// 저장정보 확인
		System.out.println("ISBN : " + bVO.getStrNum());
		System.out.println("제목 : " + bVO.getStrName());
		System.out.println("저자 : " + bVO.getStrWriter());
		System.out.println("출판사 : " + bVO.getStrComp());
		System.out.println("출판년도 : " + bVO.getIntYear());
		System.out.println("가격 : " + bVO.getIntPrice());
		
	}

}
