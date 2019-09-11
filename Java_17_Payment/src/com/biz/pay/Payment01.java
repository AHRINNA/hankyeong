package com.biz.pay;

public class Payment01 { // 화폐매수계산기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int pay = 3785870;
		int mo = 50000;
		/*
		int count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo;
		mo = mo / 5;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo;
		mo = mo / 2;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo;
		mo = mo / 5;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo;
		mo = mo / 2;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo;
		mo = mo / 5;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo;
		mo = mo / 2;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo;
		mo = mo / 5;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		*/
		
		/* int pay = 3785870;
		PayServiceV1 ps = new PayServiceV1();
		ps.array(pay);
		1번 배열만드는 클래스
		*/
		
		PayServiceV2 ps = new PayServiceV2();
		ps.whilePay(pay);
	}

}
