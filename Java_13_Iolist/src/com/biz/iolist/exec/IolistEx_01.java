package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV1;

public class IolistEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IolistService ioService = new IolistServiceImpV1();
		ioService.input(8);
		ioService.total();
		ioService.list();
	}

}
