package com.biz.thread.classes;

import java.util.Calendar;
import java.util.Date;

public class Cal_S_02 extends Thread {
	@Override
	public void run() {
		Calendar ca2 = Calendar.getInstance();
		ca2.set(2020, Calendar.JANUARY, 30);
		Date date2 = ca2.getTime();
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			String curDate;
			synchronized (SimpleStaticClass.sd) {
				curDate = SimpleStaticClass.sd.format(date2);
			}
			System.out.println("Thread2 : " + curDate);
		}
	}
}