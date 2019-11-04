package com.biz.thread.exec;

import com.biz.thread.classes.StaticClassV1;

public class StaticEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClassThread_01 sct = new StaticClassThread_01();
		sct.start();
		StaticClassV1.sum = 0;
		for(int i = 0; i <= 100; i++) {
			StaticClassV1.sum += i;
		}
		System.out.println("메인에서 계산한 합계");
		System.out.println(StaticClassV1.sum);
		
		// 두개의 쓰레드에서 계산한 값이 충돌이 나서 하나로 합쳐졌다
	}
}
