package com.biz.thread.classes;

import java.util.Calendar;
import java.util.Date;

public class Cal_S_01 extends Thread {
	@Override
	public void run() {
		Calendar ca1 = Calendar.getInstance();
		ca1.set(2019, Calendar.OCTOBER, 10);
		Date date1 = ca1.getTime();
		// TODO Auto-generated method stub
		
		/*
		 * multi thread 환경에서 static 변수를 공유하여 코드를 작성하고 여러 thread에서 접근할 경우
		 * 데이터가 서로 겹치게 되 수 있다
		 * 
		 * 이럴 때 공유할 변수를 synchronized 키워드로 정리하면 JVM가 동기화해 문제를 해결해준다 
		 */
		for (int i = 0; i < 100; i++) {
			String curDate;
			synchronized (SimpleStaticClass.sd) {
				curDate = SimpleStaticClass.sd.format(date1);
			}
			System.out.println("Thread1 : " + curDate);
		}
	}
}