package com.biz.pay.service;
// pay.txt 파일이름으로 파일을 열어서 급여 내역을 문자열형 List에 담기 

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PayReadServiceV1 {
	// 급여내역 문자열형 List
	private List<String> payStrList;
	// payStrList를 가져갈 메소드 생성
	
	public List<String> getPayList() {
		return payStrList;
	}
	
	public void readPay(String payFile) throws Exception {
		payStrList = new ArrayList<String>();
		FileReader fr = new FileReader(payFile);
		BufferedReader br = new BufferedReader(fr);
		
		// 버퍼로부터 문자열을 읽을 문자열
		String reader = new String();
		while(true) {
			reader = br.readLine();
			if(reader == null) break;
			
			payStrList.add(reader);
		}
		br.close();
		fr.close();
	}
}