package com.biz.arryas.exec;

import com.biz.arryas.service.MethodService;

public class Method_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodService ms = new MethodService();
		ms.add();
		ms.add(100);
		ms.add(30,40);
		ms.add(30f, 40f);
	}

}
