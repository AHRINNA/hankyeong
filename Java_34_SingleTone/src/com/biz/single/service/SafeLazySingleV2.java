package com.biz.single.service;

/*
 * Thread에 안전하고 초기화과정을 좀 더 빠르게 개선하는 싱글톤 코드
 */
public class SafeLazySingleV2 {
	// volatile : 휘발성의, 불안한, 변덕스러운
	// 이 변수를 JVM 영역에 저장하지 않고 컴퓨터 하드웨어적인 main memory 영역에 저장해서 운영체제가
	// 관리하도록 만드는 키워드
	
	// Multi Thread 환경에서 성능 향상을 위해 운영체제한테 메모리 관리를 넘긴다
	private volatile static SafeLazySingleV2 instance;

	private SafeLazySingleV2() {
		// TODO Auto-generated constructor stub
	}

	public static SafeLazySingleV2 getInstance() {
		if (instance == null) {
			synchronized (SafeLazySingleV2.class) {
				instance = new SafeLazySingleV2();
			}
		}
		return instance;
	}
}
