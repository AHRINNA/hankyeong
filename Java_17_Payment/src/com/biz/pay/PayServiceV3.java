package com.biz.pay;

public class PayServiceV3 extends PayServiceV2 {
	// V2의 whilepay를 override

	@Override
	public void whilePay(int Pay) {
		this.headerView(Pay);
		int intSw = 1;

		while (true) {
			if(nMoney < 5) break;
			int nCount = Pay / nMoney;
			Pay -= nMoney * nCount;
			System.out.printf("%8s원권 %3d매\n", paperform.format(nMoney), nCount);
			if (intSw == 1) {
				nMoney /= 5;
			} else {
				nMoney /= 2;
			}
			intSw *= (-1); 
		}
	}
}
