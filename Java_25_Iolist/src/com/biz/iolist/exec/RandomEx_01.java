package com.biz.iolist.exec;

public class RandomEx_01 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++)
		{
		double rnd = Math.random();
		// 0부터 1미만의 값을 double형으로 생성하는 메소드
		System.out.println(rnd);
		}
		
		int start = 10;
		int end = 55;
		for(int i = 0; i < 10; i++)
		{
		double rnd = Math.random();
		int num = (int)(rnd * (end - start + 1) + start);
		// start~end까지 임의의 수 생성
		System.out.println(num);
		}
	}
}