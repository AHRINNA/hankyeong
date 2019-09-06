package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV2;

/*
 * 판매관리app을 사용하여 일반미 판매관리를 잘해왔다
 * 
 * 햇반제품을 판매하려고 보니 판매관리를 변경해야 할 일이 발생했다
 * 일반미 판매금액 = 수량 * 단가
 * 햇반 판매금액은 부가가치세(Value Added Tax)가 발생하여 합산해야할 필요가 생겼다
 * 
 *  새 프젝을 만들어야하나?
 *  기존 클래스를 복사해서 사용해야하나?
 *  
 *  => 상속 inheritance 하여 사용한다. 물려받음+기능 확장
 */
public class IolistEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IolistService ioService = new IolistServiceImpV2();
		ioService.input(5);
		ioService.total();
		ioService.list();

	}

}
