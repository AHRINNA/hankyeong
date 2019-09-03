package com.biz.grade;

import java.util.Random;

public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intNum = new int[50];
		Random rand = new Random();
		int index;
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rand.nextInt(100) + 1;
			for(index = 2; index < intNum[i]; index++) {
				if(intNum[i] % index == 0) break;
			
			}
			if(index >= intNum[i])
			{
				System.out.printf("%d번째 %d는 소수\n", i+1, intNum[i]);
			}
		}
	} // main end
	
	/* boolean prime(int n){
		if(n < 2) return false;
		if(n == 2) return true;
		
		int e = 2;
		while(e < n) {
			if(n % e == 0)
				return false;
			e++;
		}
		return true;
	} */
} // array end
