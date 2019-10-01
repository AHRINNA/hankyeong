package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV2 {
	List<PaperVO> paperList = new ArrayList<PaperVO>();
	
	public void make(int pay) {
		int paper, count;
		paper = 50000;
		int sw = 1;
		System.out.printf("%d원 화폐매수 계산\n", pay);
		while(pay > 5) {
			count = pay / paper;
			pay -= paper * count;
			// System.out.printf("%d원 : %d\n", paper, count);
			String p = paper + "";
			// PaperVO pVO = new PaperVO(p, count);
			PaperVO pVO = new PaperVO();
			pVO.setPaper(p);
			pVO.setCount(count);
			
			paperList.add(pVO);
			if(sw > 0) {
				paper /= 5;
			}
			else paper /= 2;
			sw *= (-1);
		}
	}
	
	public List<PaperVO> setList(){
		return this.paperList;
	}
}
