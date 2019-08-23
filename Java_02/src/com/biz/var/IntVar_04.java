package com.biz.var;

public class IntVar_04 {
	public static void main(String[] args) {
		int num1=30;
		//int num1=40;
		//이미 발생한 지역변수명으로는 오류가 발생한다
	}
	int num1=60;
	//여기서 main 메소드 안에서 소멸한 지역변수 num1을 선언은 잘 된다
}