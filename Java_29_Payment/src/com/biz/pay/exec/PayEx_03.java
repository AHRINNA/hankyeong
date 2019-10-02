package com.biz.pay.exec;

import com.biz.pay.service.PaperPrintServiceV1;

public class PayEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaperPrintServiceV1 pp = new PaperPrintServiceV1("src/com/biz/pay/pay.txt");
		try {
			pp.makePaperList();
			pp.viewPaper();
			pp.printPaper();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
