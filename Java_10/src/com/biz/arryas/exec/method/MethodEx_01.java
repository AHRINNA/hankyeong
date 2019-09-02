package com.biz.arryas.exec;

import com.biz.arryas.service.MethodService;

public class MethodEx_01 {

	public static void main(String[] args) {

		MethodService ms = new MethodService();
		// MS에 정의된 메소드를 호출하기 위해 인스턴스 선언하고 생성자로 초기화
		ms.consoleView(); // 호출만 가능한 void형 메서드
		
		int num = ms.numRet() + 300; // int return값을 같은타입에 저장.
		// return을 변수로 생각하고 핸들링 가능
	}

}
