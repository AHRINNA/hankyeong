package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.model.BankAccServiceV1;

public class BankAccEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccServiceV1 bs = new BankAccServiceV1("0001", 1500000);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=======================");
			System.out.println("대한은행 계정계 ver 1.0");
			System.out.println("=======================");
			System.out.println("1.조회 2.입금 3.출금 0.종료");
			System.out.println("-----------------------");
			System.out.print("업무 선택 >> ");
			String strMenu = sc.nextLine();
			int intMenu = Integer.valueOf(strMenu);
			if(intMenu == 0) break;
			else if(intMenu == 1) {
				bs.viewAcc();
			}
			else if(intMenu == 2) {
				bs.input();
			}
			else if(intMenu == 3) {
				bs.output();
			}
		}
		System.out.println("오늘도 수고하셨습니다");
	}
}