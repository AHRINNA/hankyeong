package com.biz.thread.exec;

import com.biz.thread.classes.Cal_S_01;
import com.biz.thread.classes.Cal_S_02;

public class CalendarEx_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_S_01 j = new Cal_S_01();
		j.start();
		
		Cal_S_02 k = new Cal_S_02();
		k.start();
		// 멀티쓰레드 환경에서 static 변수는 메모리상 섞임 현상이 발생해서 문제가 크게 발생할 수 있는데
		// 이를 JVM이 내부 스케줄링을 통해 동기화하여 막는 방법으로 synchronized 키워드를 통해
		// 해결할 수 있다
	}
}
