package com.biz.thread.exec;

import com.biz.thread.classes.SingleClassV1;

public class SingleClassThreadEx_01 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		SingleClassV1 sc = SingleClassV1.getInstance();
		sc.sum = 0;
		for(int i = 0; i < 200; i++)
			sc.sum += i+1;
		System.out.println("쓰레드에서 계산한 결과 : " + sc.sum);
	}
}
