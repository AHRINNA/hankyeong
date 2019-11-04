package com.biz.thread.classes;

public class Run_02 implements Runnable {
	// 상속은 단 1개의 클래스만이 가능하기 때문에 Runnable이라는 interface를 상속받아
	// Thread 상속을 대체하고 또 다른 1개의 클래스를 상속받을 수 있게 하여 설계하는 것이 좋다

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long start = 1;
		long end = 100;
		String sum = "";
		for(long i = start; i <= end; i++) {
			sum += (int)(Math.random() * 100 ) + "\n";
			// 랜덤한 0~99까지의 숫자 100개를 100번 입력
		}
		System.out.println(sum);
	}
}
