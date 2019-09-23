package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.model.BankServiceV1;

public class BankExec_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankServiceV1 bs = null;

		Scanner sc = new Scanner(System.in);
		
		String strAccNum = "0001"; // Account 계좌
		int intBalance = 100000; // Balance = (예금)잔고
		bs = new BankServiceV1(strAccNum, intBalance);
		// bs에 strAccNum 계좌번호, intBalance 잔고를 가진 인스턴스를 만든다 

		while (true) {
			System.out.println("===========================");
			System.out.println("광한루 은행");
			System.out.println("===========================");
			System.out.println("1.계좌조회 2.입금 3.출금 0.종료");
			System.out.println("---------------------------");
			System.out.print("선택 >> ");
			String strMenu = sc.nextLine();
			int intMenu = Integer.valueOf(strMenu);
			if (intMenu == 0)	break;
			else if(intMenu == 1) {
				bs.viewAcc();
			}
			else if(intMenu == 2) {
				// bs.viewAcc();
				bs.input();
			}
			else if(intMenu == 3) {
				// bs.viewAcc();
				bs.output();
			}
		}
		System.out.println("업무를 종료합니다");

	}

}
