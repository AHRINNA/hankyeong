package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.model.BankAccService;
import com.biz.bank.model.BankAccServiceV2;

public class BankAccEx_02 {

	public static void main(String[] args) {
		BankAccService bs = new BankAccServiceV2();
		Scanner sc = new Scanner(System.in);
		String strBookFile = "src/com/biz/bank/계좌원장.txt";
		while (true) {
			System.out.println("======================");
			System.out.println("한국은행 차세대 시스템 V2");
			System.out.println("======================");
			System.out.println("1.조회 2.입금 3.출금 0.종료");
			System.out.println("----------------------");
			System.out.print("업무선택 >> ");
			String strMenu = sc.nextLine();
			int intMenu = Integer.valueOf(strMenu);

			try {
				if (intMenu == 1) {
					bs.viewAcc();
				} else if (intMenu == 2) {
					bs.input();
				} else if (intMenu == 3) {
					bs.output();
				} else if (intMenu == 0) {
					BankAccServiceV2 bs2 = (BankAccServiceV2) bs; // Override되지 않은 새로운 메소드를 호출하기 위해 형변환
					// 한줄로 쓰면 ((BankAccServiceV2)bs).writeAccBook(strBookFile);
					bs2.writeAccBook(strBookFile);
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("업무를 종료합니다!!!");
		sc.close();
	}
}