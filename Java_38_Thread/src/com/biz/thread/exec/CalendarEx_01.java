package com.biz.thread.exec;

import com.biz.thread.classes.Cal_01;
import com.biz.thread.classes.Cal_02;

public class CalendarEx_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_01 j = new Cal_01();
		j.start();
		
		Cal_02 k = new Cal_02();
		k.start();
		// 멀티쓰레드 환경에서 static 변수는 메모리상 섞임 현상이 발생해서 문제가 크게 발생할 수 있다
	}
}
