package com.biz.bank.exec;

import java.util.Scanner;

public class BankExec_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strAccNum = "0001"; // Account 계좌
		int intBalance = 100000; // Balance = (예금)잔고
		
		System.out.println("===========================");
		System.out.println("광한루 은행");
		System.out.println("===========================");
		System.out.println("1.계좌조회 2.입금 3.출금 0.종료");
		System.out.println("---------------------------");
		System.out.print("선택 >> ");
		String strMenu = sc.nextLine();
		int intMenu = Integer.valueOf(strMenu);
		if(intMenu == 0) {
			System.out.println("업무종료");
		}else if(intMenu == 1) {
			System.out.println("계좌조회");
			/*
			 * 계좌번호 입력받고 일치하는 계좌번호가 있으면 계좌내역 띄우기
			 */
			System.out.println("계좌번호 >> ");
			String strAccKeyIn = sc.nextLine();
			if(strAccKeyIn.equalsIgnoreCase(strAccNum)) {
				System.out.printf("계좌번호 : %s\n잔고 :  %d\n",
						strAccNum, intBalance);
			}else {
				System.out.println("계좌번호가 없습니다");
			}
				
		}else if(intMenu == 2) {
			System.out.println("입금처리");
			/*
			 * 계좌번호를 입력받고 계좌번호가 일치하면 입금액을 입력받고 계좌잔액과 더해서 계좌잔액으로 리턴
			 */
			System.out.print("계좌번호 >> ");
			String strAccKeyIn = sc.nextLine();
			if(strAccKeyIn.equalsIgnoreCase(strAccNum)) {
				System.out.printf("계좌번호 : %s\n잔고 :  %d\n",
						strAccNum, intBalance);
				System.out.print("입금액 >> ");
				String strInput = sc.nextLine();
				int intInput = Integer.valueOf(strInput);
				intBalance += intInput;
			}else {
				System.out.println("계좌번호가 없습니다");
			}
		}
		else if(intMenu == 3){
			System.out.println("출금처리");
			/*
			 * 계좌번호 입력받고 일치하면 출금금액 입력받고 잔액 >= 출금액이면 출금처리, 잔액< 출금액이면 오류메시지
			 */
			System.out.print("계좌번호 >> ");
			String strAccKeyIn = sc.nextLine();
			if(strAccKeyIn.equalsIgnoreCase(strAccNum)) {
				System.out.printf("계좌번호 : %s\n잔고 :  %d\n",
						strAccNum, intBalance);
				System.out.print("출금액 >> ");
				String strOutput = sc.nextLine();
				int intOutput = Integer.valueOf(strOutput);
				if(intBalance >= intOutput) {
					System.out.printf("%d를 출금하고 잔액이 %d 남습니다\n",
							intOutput, intBalance);
					intBalance -= intOutput;
				}
				else
					System.out.println("출금요청액이 입금되어있는 잔액보다 많습니다");
			}else {
				System.out.println("계좌번호가 없습니다");
			}
		}
	}
}
