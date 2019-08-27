package com.biz.for_if;

public class If_02 {
	public static void main(String[] args) {
		int numM = 100; // main 영역의 변수
		if(3 == 3) {
			int numIf = 200; // if 안의 지역변수. if를 벗어나면 사용할 수 없다
			
			System.out.println(numM);
			System.out.println(numIf);
		}
		System.out.println(numM);
		// 오류 발생. numIf는 if 안에서만 쓰고 해제되므로. System.out.println(numIf);
		
	}
}
