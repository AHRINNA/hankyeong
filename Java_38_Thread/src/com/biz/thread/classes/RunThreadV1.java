package com.biz.thread.classes;
/*
 * main() method의 흐름과 별도로 background에서 작동하도록 구성할 클래스
 * 
 * 1. background에서 별도의 thread가 작동하기 위해서는 Thread class를 상속받아서 작성해야한다 
 */
public class RunThreadV1 extends Thread {

	@Override // Thread에 있는 run 메소드를 재정의
	public void run() {
		// TODO Auto-generated method stub
		long sum = 0;
		for(long i = 1; i <= 10000000000L; i++) {
			sum += i;
		}
		System.out.printf("\n덧셈수행결과 : %d\n", sum);
	}
}
