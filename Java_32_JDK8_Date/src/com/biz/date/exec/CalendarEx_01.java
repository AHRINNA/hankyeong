package com.biz.date.exec;

import java.util.Calendar;

public class CalendarEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * java에서 Date 클래스를 사용해서 날짜 관련 연산을 수행하는 과정에서 발생하는 이슈들을
		 * 개선하기 위해 만든 클래스. 하지만 여전히 많은 이슈를 그대로 가지고 있다
		 * 
		 * 날짜관련 연산을 Date에서 제거하면서 Calendar를 사용한다
		 * Calendar는 생성자로 객체를 생성할 수 없다
		 * 
		 * Calendar는 싱글톤 객체, 1개의 프로젝트에서 공통으로 공유하는 객체
		 * 
		 * 객체를 만드는 것이 아닌 이미 생성되어 있는 객체를 getInstance를 이용해 가져다 쓴다
		 */
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // 24시간제
		System.out.println(calendar.get(Calendar.HOUR)); // 12시간제
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.printf("%02d:%02d:%02d\n", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
	}
	
}
