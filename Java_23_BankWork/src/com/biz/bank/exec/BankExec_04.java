package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.model.BankServiceV2;

public class BankExec_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankServiceV2 bs = null;

		Scanner sc = new Scanner(System.in);

		String strAccNum = "0001"; // Account 계좌
		int intBalance = 100000; // Balance = (예금)잔고
		bs = new BankServiceV2(strAccNum, intBalance);
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
			/*
			 * if가 반복된다. switch 코드가 더 깔끔하다 if (intMenu == 0) break; else if(intMenu == 1) {
			 * bs.viewAcc(); } else if(intMenu == 2) { if(bs.viewAcc()) { bs.input(); } else
			 * System.out.println("입금처리 불가"); } else if(intMenu == 3) { if(bs.viewAcc()) {
			 * bs.output(); } else System.out.println("출금처리 불가"); } }
			 */
			if(intMenu == 0) {
				System.out.println("업무종료");
				break;
			}
			/*
			 * switch는 문자열, 숫자, 문자를 파라미터로 쓸 수 있다.
			 * 문자열의 경우, case에서 문자열을 못찾는 문제 발생 가능성이 있다
			 */
			switch (intMenu) {
			case 1: // label. GOTO 명령을 사용할 때 쓰는 키워드
				System.out.println("계좌조회");
				bs.viewAcc();
				break;
			case 2:
				System.out.println("입금처리");
				if (bs.viewAcc()) {
					bs.input();
				}
				break;
			case 3:
				System.out.println("출금처리");
				if (bs.viewAcc()) {
					bs.output();
				}
				break;
			}
		}
		// System.out.println("업무를 종료합니다");
	}
}
