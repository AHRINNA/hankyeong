package com.biz.list.exec;

import com.biz.list.service.IolistServiceImp;

public class IolistEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IolistServiceImp ioService = new IolistServiceImp();
		
		ioService.input(10);
		ioService.total();
		ioService.list();
	}

}
