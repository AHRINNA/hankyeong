package com.biz.pay.exec;

public class PayEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary, paper, count;
		salary = 3758750;
		// count = 0;
		paper = 50000;
		int sw = 1;
		System.out.printf("%d원 화폐매수 계산\n", salary);
		while(salary > 5) {
			count = salary / paper;
			salary -= paper * count;
			System.out.printf("%d원 : %d\n", paper, count);
			if(sw > 0) {
				paper /= 5;
			}
			else paper /= 2;
			sw *= (-1);
		}
	}
}