package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.service.PayReadServiceV1;

public class PayEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String payFile = "src/com/biz/pay/pay.txt";
		PayReadServiceV1 pr = new PayReadServiceV1();
		try {
			pr.readPay(payFile); // 내부에서 payStrList를 생성한다
			List<String> payStrList = pr.getPayList(); // payStrList를 가져와서 사용
			/*
			for(String s : payStrList)
				System.out.println(s);
				*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 경로를 확인하세요");
		}
	}
}