package com.biz.pay;

import java.text.DecimalFormat;

public class PayServiceV1 { // 화폐권 단위를 배열로 선언하는 방법
	private int[] money = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

	public void array(int py) {
		DecimalFormat payform = new DecimalFormat("###,###,###,###");
		String strPay = payform.format(py);
		
		DecimalFormat paperform = new DecimalFormat("###,###,###,###");
		
		System.out.printf("급여수령액 : %s\n", strPay);
		
		for (int i = 0; i < money.length; i++) {
			int nCount = py / money[i];
			py = py - money[i] * nCount;
			System.out.printf("%8s원권 %3d매\n", paperform.format(money[i]), nCount);
		}
	}
}
