package com.biz.for_if;

public class If_03 {
	public static void main(String[] args) {
		
		int num = 31;
		
		if(num % 2 == 0) {
			System.out.printf("%d는 짝수\n", num);
		}
		
		else if(num % 2 != 0) {
			System.out.printf("%d는 홀수\n", num);
		}
		
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				System.out.printf("%d는 짝수\n", i);
			}
			
		}
	}
	
}

