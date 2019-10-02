package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV1;

public class PayEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaperMakeServiceV1 pm = new PaperMakeServiceV1();
		pm.make(3785960);
		List<PaperVO> paperList = pm.getPaperList();
		for(PaperVO pvo : paperList)
			System.out.println(pvo);
	}

}
