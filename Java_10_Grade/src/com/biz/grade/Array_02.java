package com.biz.grade;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intKor = new int[50];
		int[] intEng = new int[50];
		int tKor = 0; 
		int tEng = 0;
		Random rand = new Random();
		System.out.println("------------------------");
		System.out.println("Kor\tEng");
		System.out.println("------------------------");
		for(int i = 0; i < intKor.length; i++) {
			intKor[i] = rand.nextInt(100)+1;
			intEng[i] = rand.nextInt(100)+1;
			tKor += intKor[i];
			tEng += intEng[i];
			System.out.printf("%d\t%d\n", intKor[i], intEng[i]);
		}
		System.out.println("------------------------");
		System.out.printf("%d\t%d\n", tKor, tEng);
		System.out.println("------------------------");
		
	}

}
