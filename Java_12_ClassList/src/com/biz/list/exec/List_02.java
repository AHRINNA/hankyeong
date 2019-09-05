package com.biz.list.exec;

import com.biz.list.service.BookService;
import com.biz.list.service.BookServiceImpV2;

/*
 * 도서정보를 키보드에 입력받아 리스트로 만들고 리스트를 콘솔에 띄운다
 * Service
 */

public class List_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bs = new BookServiceImpV2();

		// 1개의 도서정보 입력 bs.input();
		// ((BookServiceImpV1)bs).input(3); Interface에 정의안된 기능을 사용했으니 bs 객체를 ImpV1 클래스로
		// 형변환을 시키는 코드
		// 클래스 형변환을 시키면 인터페이스를 사용하는 의미가 퇴색되므로 가급적 인터페이스에 추가하는 것이 좋다
		bs.input(2);
		bs.list();
		
		bs.view(1);

	}

}
