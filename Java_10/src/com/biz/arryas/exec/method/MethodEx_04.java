package com.biz.arryas.exec;

import com.biz.arryas.service.MethodService;

public class MethodEx_04 {
	public static void main(String[] args) {
		MethodService ms = new MethodService();
		
		ms.getSum(30, 40);
		ms.showSum();
	}
}
