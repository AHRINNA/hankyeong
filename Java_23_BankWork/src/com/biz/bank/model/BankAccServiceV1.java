package com.biz.bank.model;

import java.util.Scanner;

import com.biz.bank.domain.BankAccVO;

/*
 * 1개의 계좌에 대한 처리를 수행할 클래스
 */
public class BankAccServiceV1 implements BankAccService {
	BankAccVO bankAccVO;
	Scanner sc;

	public BankAccServiceV1(String strNum, int intBalance) {
		bankAccVO = new BankAccVO();
		sc = new Scanner(System.in);
		bankAccVO.setNum(strNum);
		bankAccVO.setBalance(intBalance);
	}

	@Override
	public boolean viewAcc() {
		System.out.print("계좌번호 >> ");
		// 계좌번호를 키보드로 입력받기
		String strAccNum = sc.nextLine();
		if (!strAccNum.equals(bankAccVO.getNum())) {
			System.out.println("계좌번호 오류");
			return false;
		}
		System.out.printf("계좌번호 : %s\n", bankAccVO.getNum());
		System.out.printf("잔액 : %d\n", bankAccVO.getBalance());
		System.out.printf("최종거래 : %s\n", bankAccVO.getLastDate());
		System.out.printf("비고 : %s\n", bankAccVO.getRemark());
		return true;
	}

	@Override
	public void input() {
		if (this.viewAcc()) {
			System.out.print("입금액 >> ");
			// 키보드 입력값으로 입금처리
			String strInput = sc.nextLine();
			int intInput = Integer.valueOf(strInput);

			// 입금액을 나머지 잔액에 합산
			bankAccVO.setBalance(bankAccVO.getBalance() + intInput);
		}
	}

	@Override
	public void output() {
		if (this.viewAcc()) {
			System.out.print("출금액 >> ");
			// 키보드 입력값을 출금액으로
			String strOutput = sc.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			// 잔액에서 출금액 비교하여 출금여부 처리
			int intBalance = bankAccVO.getBalance();
			if (intBalance >= intOutput) {
				bankAccVO.setBalance(bankAccVO.getBalance() - intOutput);
			} else
				System.out.println("잔액이 부족합니다");
		}
	}
}