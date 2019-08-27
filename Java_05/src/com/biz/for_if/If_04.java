package com.biz.for_if;

public class If_04 {
	public static void main(String[] args) {
		short sum = 0;
		for(short i = 1; i <= 100; i++) {
			if(i % 2 == 0)
			{
				sum += i;
			}
		}
		System.out.println("1부터 100까지 짝수들의 합은 " + sum);
		
	}
}
