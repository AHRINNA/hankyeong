package com.biz.thread.classes;
/*
 * 일반적인 SingleTone
 * Single Thread에서는 메모리를 절약하지만
 * Multi Thread에서는 동기화 문제를 일으키고
 * ==> synchronized로 동기화를 억지로 수행할 경우 때론 SingleTone이 아닌 다수의 객체 인스턴스가 생성될 여지가 있다 
 */
public class SingleClassV1 {
	private static SingleClassV1 singleClassV1 = new SingleClassV1(); // 자기자신을 private static 선언
	public int sum;
	
	static {
		// 강제로 동기화를 할 경우 다수의 인스턴스가 생성되는 것을 방지
		if(singleClassV1 == null) {
			singleClassV1 = new SingleClassV1();
		}
	
	/*
	private SingleClassV1() { // 싱글톤으로 만들기. null이면 싱글톤 보장
/*		if(singleClassV1 == null)
			singleClassV1 = new SingleClassV1();
			*/
	}
	public static SingleClassV1 getInstance() {
		return singleClassV1;
	}
}
