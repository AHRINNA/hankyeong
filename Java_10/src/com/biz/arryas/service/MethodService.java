package com.biz.arryas.service;

import java.util.Scanner;

// void는 return이 있어도 되고 없어도 되고

// method 타입(data type)을 method()정의문에 작성해준다
// 예를 들어 int형 변수를 return하려면 정의문 또한 int형
// ScoreVO method() {return sVO}; 사용자 정의 클래스의 경우 리턴
// 잘못된 데이터 타입으로 return 시키면 syntax error 

public class MethodService {
	
	private int intSum;
	
	public void consoleView() {
		System.out.println("콘솔에 표시하는 method()");
		return ;
	}
	
	public int numRet() {
		int num = 100 + 200 + 300;
		return num;
	}
	
	public String strRet() {
		return "";
	}
	
	public int getIntSum() {
		return intSum;
	}
	
	public void showSum() {
		System.out.println(intSum);
	}
	
	public int getSum(int i, int j) {
		return intSum = i * j;
	}
	
	
	
	public void add() {
		System.out.println("매개변수가 없는 메소드");
	}
	public void add(int i) {
		System.out.printf("매개변수 1개, %d가 있는 메소드\n", i);
	}
	public void add(int i, int j) {
		int sum = i + j;
		System.out.println("2개 매개변수의 합 : " + sum);
	}
	public void add(float i, float j) {
		float sum = i + j;
		System.out.printf("두 실수의 합 : %f\n", sum);
	}
	
	public void ex() {
		Scanner scan = new Scanner(System.in);
	}
	
	
}
