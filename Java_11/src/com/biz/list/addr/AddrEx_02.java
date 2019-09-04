package com.biz.list.addr;

import com.biz.list.service.AddrService;
import com.biz.list.service.AddrServiceImp_01;

public class AddrEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 일반적인 생성자를 활용한 코드
		AddrServiceImp_01 addr1 = new AddrServiceImp_01();
		addr1.input();
		addr1.list();
		addr1.view(2);
		
		// 객체지향답게 인터페이스를 활용한 코드
		AddrService addr2 = new AddrServiceImp_01();
		addr2.input();
		addr2.list();
		addr2.view(1);

	}

}
