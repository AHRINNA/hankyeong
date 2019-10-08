package com.biz.single.exec;

import com.biz.single.service.SingleClassV1;

public class SingleEx_01 {
	public static void main(String[] args) {
		// SingleClassV1 s = new SingleClassV1();
		// 생성자를 private해둬서 생성자로 생성할 수 없다
		SingleClassV1 s1 = SingleClassV1.getInstance();
		// 싱글톤 패턴으로 설정된 클래스는 new 생성자로 만들지 않고 별도의 메소드를 통해서
		// 가져다쓴다
		SingleClassV1 s2 = SingleClassV1.getInstance();
		SingleClassV1 s3 = SingleClassV1.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		/*
		 * Single Tone 객체
		 * 프로젝트 전체에서 공유해야할 데이터(사용자 정보, 시스템 설정값 등)들을 메모리에 저장해두고
		 * 여러 클래스에서 공유하고자 할 때 사용하는 기법
		 * 
		 * 일반적인 static class와의 차이는 multi thread 환경에서 안전하게 사용할 수 있도록
		 * 설정이 가능하다. thread safe
		 * 
		 * multi Thread 환경에서는 여러곳의 메소드에서 동시에 한곳의 기억장소 값을
		 * 변경하는 경우가 발생한다
		 */
	}
}
