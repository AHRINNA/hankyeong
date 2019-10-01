package com.biz.pay.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV2;
import com.biz.pay.service.PaperWriterServiceV1;

public class PayEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaperMakeServiceV2 ps = new PaperMakeServiceV2();
		PaperWriterServiceV1 pws = new PaperWriterServiceV1();
		int pay = 3775060;
		List<PaperVO> pVO = new ArrayList<PaperVO>();
		pVO = ps.setList();
		ps.make(pay);
		try {
			pws.print(pVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}