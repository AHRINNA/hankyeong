package com.biz.thread.classes;
/*
 * field를 static으로 선언하여 모든 클래스에서 접근가능하도록 만드는 것
 * Single Thread에서도 변수값이 모종의 이유로 변동되는 경우가 많이 발생하여 문제를 일으키므로
 * final keyword(상수선언. 값을 바꿀 수 없다)를 같이 써주는게 보통의 사용법이다
 */
public class StaticClassV1 {
	public static String name = "";
	public static int sum = 0;
}
