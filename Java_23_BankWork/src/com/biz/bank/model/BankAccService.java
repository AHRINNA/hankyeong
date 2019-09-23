package com.biz.bank.model;

/*
 * 은행 계정계 app Service
 */
public interface BankAccService {
	
	public boolean viewAcc() throws Exception;
	public void input() throws Exception;
	public void output() throws Exception;
}