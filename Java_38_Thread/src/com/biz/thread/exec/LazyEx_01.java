package com.biz.thread.exec;

import com.biz.thread.classes.LazyClassV1;

public class LazyEx_01 { // 가장 안전한 형태의 싱글톤
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyThreadEx_01 lt = new LazyThreadEx_01();
		lt.start();
		
		LazyClassV1 lc = LazyClassV1.getInstance();
		lc.sum = 0;
		for(int i = 0; i < 100; i++)
			lc.sum += i+1;
		System.out.println(lc.sum);
	}
}
