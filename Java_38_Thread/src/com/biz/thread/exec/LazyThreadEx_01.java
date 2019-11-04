package com.biz.thread.exec;

import com.biz.thread.classes.LazyClassV1;

public class LazyThreadEx_01 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		LazyClassV1 lc = LazyClassV1.getInstance();
		lc.sum = 0;
		for(int i = 0; i < 100; i++)
			lc.sum += i+1;
		System.out.println(lc.sum);
	}
}
