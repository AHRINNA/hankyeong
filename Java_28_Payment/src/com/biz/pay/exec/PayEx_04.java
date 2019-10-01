package com.biz.pay.exec;

import com.biz.pay.service.PaperPrintServiceV1;
import com.biz.pay.service.PaperReadServiceV1;

public class PayEx_04 {

	public static void main(String[] args) {
		PaperReadServiceV1 prs = new PaperReadServiceV1();
		PaperPrintServiceV1 pps = new PaperPrintServiceV1();
		
		try {
			prs.read();
			pps.print(prs.outList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
