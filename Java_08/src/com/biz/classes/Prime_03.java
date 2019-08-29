package com.biz.classes;

public class Prime_03 {
	public static void main(String[] args) {
		// 2~100까지 숫자 중 소수들의 리스트보기
		
		
		for(int i = 2; i <= 1000000; i++)
		{
			// 2부터 i-1까지 각각의 수로 i값을 나눠 나머지가 한번도 0이 아니면 소수다
			int index;
			for(index = 2; index < i; index++) {
				if(i % index == 0) break;
			}
			if(index >= i) {
				System.out.println("Prime : " + i);
			}
		}
	}
}
