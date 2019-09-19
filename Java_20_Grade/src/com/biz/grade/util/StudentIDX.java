package com.biz.grade.util;
/*
 * static class의 다른 용도
 * 배열을 사용한 데이터를 처리할 때 배열의 요소를 숫자값으로 지정하여
 * 데이터를 읽거나 저장하는데, 숫자값은 사람이 보기에 쉽게 기억하기 어려운 데이터이므로
 * 숫자값을 static 변수로 선언하고 대체하여 사용해 해결할 수 있다
 * 
 * final
 * 변수를 선언하고 값을 최초 1회 저장하면 이후에 바꿀 수 없도록 하는 상수화 키워드
 */
public class StudentIDX {
	// 멤버변수에 static을 붙이면 그 변수를 포함하는 클래스도 static이 된다
	public final static int NUM = 0;
	public final static int NAME = 1;
	public final static int TEL = 2;
	public final static int ADDR = 3;
}
