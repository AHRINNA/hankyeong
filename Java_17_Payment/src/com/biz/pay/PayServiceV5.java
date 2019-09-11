package com.biz.pay;

public class PayServiceV5 extends PayServiceV4 {

	public void forPay(int Pay) {
		this.headerView(Pay);
		for (int i = 0; Pay > 5; i++) { // while(pay>5)와 동일
			int nCount = Pay / nMoney;
			Pay -= nCount * nMoney;
			System.out.printf("%8s원권 %3d매\n", paperform.format(nMoney), nCount);
			if (i % 2 == 0) {
				nMoney /= 5;
			} else
				nMoney /= 2;
		}

	}
}
