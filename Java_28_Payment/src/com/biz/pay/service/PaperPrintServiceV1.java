package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.List;

public class PaperPrintServiceV1 {

	String st = "src/com/biz/pay/";
	String stre = new String();
	PrintWriter pw;
	public void print(List<String[]> str) throws Exception {
		for (String[] s : str) {
			stre = s[0]+".txt";
			pw = new PrintWriter(st+stre);
			System.out.println("사원번호 : " + s[0] + ", 급여액 : " + s[1]);
			pw.println("사원번호 : " + s[0] + ", 급여액 : " + s[1]);
			int pay = Integer.valueOf(s[1]);

			int paper, count;
			paper = 50000;
			int sw = 1;
			// System.out.printf("%d원 화폐매수 계산\n", pay);
			while (pay > 5) {
				count = pay / paper;
				pay -= paper * count;
				System.out.printf("%d원 : %d\n", paper, count);
				pw.printf("%d원 : %d\n", paper, count);
				if (sw > 0) {
					paper /= 5;
				} else
					paper /= 2;
				sw *= (-1);
			}
			pw.close();
		}
	}
}