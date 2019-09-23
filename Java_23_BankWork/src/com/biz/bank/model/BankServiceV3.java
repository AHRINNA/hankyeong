package com.biz.bank.model;

import java.util.Scanner;

public class BankServiceV3 {
	int intBalance = 0;
	String strAccNum = new String();
	// 반복되는 계좌입출력을 메소드로 빼낸다
	Scanner sc = null;
	// private boolean boolSwitch = false;
	// main에서 계좌번호를 잘못입력해도 0001 계좌로 연결되므로 계좌번호가 다른경우처리를 위한 스위치

	public BankServiceV3() {
		sc = new Scanner(System.in);
	}

	// 계좌번호와 잔액을 파라미터로 받는 생성자
	public BankServiceV3(String strAccNum, int intBalance) {
		this.strAccNum = strAccNum;
		this.intBalance = intBalance;
		sc = new Scanner(System.in);
	}

	public boolean viewAcc() {
		System.out.println("계좌번호 >> ");
		String strAccKeyIn = sc.nextLine();
		if (!strAccKeyIn.equalsIgnoreCase(strAccNum)) {
			System.out.println("계좌번호가 없습니다");
			return false;
		}
		System.out.printf("계좌번호 : %s\n잔고 :  %d\n", strAccNum, intBalance);
		return true;
	}

	// 메소드가 실행되는동안 NumberFormatException이 발생하면 오류를 띄우지 말고 호출하는 메인에서 처리하게 던질 것
	public void input() throws NumberFormatException {
		System.out.println("입금처리");
		/*
		 * 입금액을 입력받고 계좌잔액과 더해서 계좌잔액으로 리턴
		 */
		System.out.print("입금액 >> ");
		String strInput = sc.nextLine();
		int intInput = Integer.valueOf(strInput);
		intBalance += intInput;
//			boolSwitch = false;
		/*
		 * else { System.out.println("계좌번호가 없습니다"); }
		 */
	}

	// 메소드가 실행되는동안 NumberFormatException이 발생하면 오류를 띄우지 말고 호출하는 메인에서 처리하게 던질 것
	public void output() throws NumberFormatException {
		System.out.println("출금처리");
		// 출금액을 입력받고 계좌잔액에서 빼서 0보다 크면 잔액 - 출금액, 0보다 작으면 처리불가 출력
		System.out.print("출금요청액 >> ");
		String strOutput = sc.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		if (intBalance >= intOutput) {
			intBalance -= intOutput;
//				boolSwitch = false;
		} else
			System.out.println("잔액보다 출금요청액이 많아 처리할 수 없습니다");
		/*
		 * else { System.out.println("계좌번호가 없습니다"); }
		 */
	}
}
