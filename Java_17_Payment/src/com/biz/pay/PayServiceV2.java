package com.biz.pay;

import java.text.DecimalFormat;

public class PayServiceV2 extends PayServiceV1 {
	
	protected int nMoney = 50000;
	protected DecimalFormat paperform = new DecimalFormat("###,###,###,###");
	
	public void whilePay(int py) {
		int intSw = 0;

		
		this.headerView(py);
		while (nMoney >= 10) {
			int nCount = py / nMoney;
			py -= nMoney * nCount;
			System.out.printf("%8s원권 %3d매\n", paperform.format(nMoney), nCount);
			if (intSw == 0) {
				nMoney /= 5;
				intSw = 1;
			} else {
				nMoney /= 2;
				intSw = 0;
			}
		}
	}

	protected void headerView(int py) {
		DecimalFormat payform = new DecimalFormat("###,###,###,###");
		String strPay = payform.format(py);

		System.out.printf("급여수령액 : %s\n", strPay);
	}
}
