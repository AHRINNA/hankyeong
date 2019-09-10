package com.biz.string.exec;

public class Payment01 { // 화폐매수계산기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay = 3785870;
		int mo = 50000;
		
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
	}

}
