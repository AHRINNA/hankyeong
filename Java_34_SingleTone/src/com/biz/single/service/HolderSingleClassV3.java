package com.biz.single.service;

// 제한된 자원을 가진 환경에서 효율을 낼 수 있는 방법
/*
 * THREAD에서 안전성을 보장한다 = 동기화 보장. 동시에 하나의 메모리에 접근했을 때 이를 안전하게 보장
 * thread 환경에서 개발자가 동기화 문제를 직접 해결하는 것은 배보다 배꼽이 커지는 결과.
 * 
 * 다양한 방법으로 thread safe 하기 위해 여러가지 도구를 사용한다
 * V2처럼 운영체제에게 메모리 관리를 넘겨버리는 방법도 있다(JVM 환경에선 그다지 좋은 패턴이 아니다.
 * OS마다 메모리 관리 기법이 달라서 호환성의 문제를 일으킬 수 있다)
 * 
 * Holder 방식은 JVM의 초기화(시작) 과정에서 원자적 특성을 이용하여 싱글톤 클래스의 초기화와 관련된
 * thread 관련된 문제에 대한 책임을 전적으로 JVM에게 일임한다
 * 코드가 비교적 간단하고 매우 안정적이어서 최근에 가장 많이 사용하는 기법
 */
public class HolderSingleClassV3 {
	private HolderSingleClassV3() {
		// TODO Auto-generated constructor stub
	}
	
	private static class InnerHolder { // InnerClass. 클래스 내부에 존재하는 클래스
		public static final HolderSingleClassV3 INSTANCE = new
				HolderSingleClassV3();
	}
	
	public static HolderSingleClassV3 getInstace() {
		return InnerHolder.INSTANCE;
	}
	
	// 나머지 부분들은 일반 클래스를 다루는 것과 똑같이 다루면 된다. 모든 변수를 공유한다는 점만 생각하자
	// 서버 어플리케이션, 네트워크 프로그램에 가면 멀티 쓰레드 환경이 되므로 이를 활용해야한다
}
