package com.biz.thread.classes;

public class Run_01 implements Runnable {
	// 상속은 단 1개의 클래스만이 가능하기 때문에 Runnable이라는 interface를 상속받아
	// Thread 상속을 대체하고 또 다른 1개의 클래스를 상속받을 수 있게 하여 설계하는 것이 좋다

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long start = 1;
		long end = 10000000000L;
		long sum = 0;
		for(long i = start; i <= end; i++) {
			sum += i;
		}
		System.out.printf("\n%d부터 %d까지의 합 : %d\n", start, end, sum);
	}
}
