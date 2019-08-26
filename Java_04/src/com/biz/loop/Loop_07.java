package com.biz.loop;

public class Loop_07 {
	public static void main(String[] args) {
		
		int nCount = 0;
		for(; nCount < 10 ;) {
			
			nCount++;
			System.out.println(nCount);
		}
		nCount = 0;
		for(; nCount < 100 ;) {
			
			nCount++;
			System.out.println(nCount);
		}
		
		/*
		 * for 첫번째 키워드는 count를 reset하는 명령
		 * 두번째 키워드는 조건문. bool형 return
		 * 세번째 키워드는 count 증감식
		 */
		nCount = 0;
		for(; nCount < 1000 ;) {
			
			nCount++;
			System.out.println(nCount);
		}
	}
}
