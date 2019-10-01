package com.biz.pay.service;

public class PaperMakeServiceV1 {
	public void make(int pay, int paper) {
		// int paper, count;
		int count;
		// paper = 50000;
		int sw = 1;
		System.out.printf("%d원 화폐매수 계산\n", pay);
		while(pay > 5) {
			count = pay / paper;
			pay -= paper * count;
			System.out.printf("%d원 : %d\n", paper, count);
			if(sw > 0) {
				paper /= 5;
			}
			else paper /= 2;
			sw *= (-1);
		}
	}
}
