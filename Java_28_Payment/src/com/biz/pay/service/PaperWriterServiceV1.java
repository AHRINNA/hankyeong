package com.biz.pay.service;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperWriterServiceV1 {
	private String str = "src/com/biz/pay/화폐매수.txt";
	public void print(List<PaperVO> pVO) throws Exception {
		FileWriter fw = new FileWriter(str);
		PrintWriter pw = new PrintWriter(fw);
		for(PaperVO pV : pVO) {
			pw.printf("%s\t%d\n", pV.getPaper(), pV.getCount());
			System.out.printf("%s\t%d\n", pV.getPaper(), pV.getCount());
		}
		pw.close();
	}
}
