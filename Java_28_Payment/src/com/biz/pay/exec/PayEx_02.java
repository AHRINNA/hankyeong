package com.biz.pay.exec;

import java.util.Scanner;

import com.biz.pay.service.PaperMakeServiceV1;

public class PayEx_02 {
	public static void main(String[] args) {
		PaperMakeServiceV1 ps = new PaperMakeServiceV1();
		System.out.print("시작권종 >> ");
		String str;
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		int 권종 = Integer.valueOf(str);
		ps.make(3875050, 권종);
	}
}