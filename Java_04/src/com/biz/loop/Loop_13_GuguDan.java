package com.biz.loop;

public class Loop_13_GuguDan {
	public static void main(String[] args) {
		
		for(int dan = 2; dan < 10; dan++)
		{
			System.out.println("============");
			System.out.printf("구구단 %d단\n", dan);
			System.out.println("------------");
			for(int num = 1; num < 10; num++)
			{
				System.out.printf("%d x %d = %2d\n", dan, num, dan * num);
			}
		}
		
	}
}
