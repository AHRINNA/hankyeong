package com.biz.date.exec;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * java에서 사용되었던 Date 클래스는 날짜와 관련된 많은 이슈를 가지고 있다
		 * 날짜와 관련된 연산(날짜수 계산)에서 정확하지 않은 값이 계산되는 이슈
		 * 
		 * 날짜와 관련된 여러 데이터는 문자열로 변환하거나 다양한 방법으로 연산을 수행해왔다
		 */
		
		// Date 생성자에 매개변수를 사용하지 않으면 JDK 8 이상에서 문제를 일으킨다
		// 현재 시스템 날짜 가져오기
		Date date = new Date(System.currentTimeMillis()); // old java에서 사용하는 날짜 관련 클래스
		
		
		// 날짜를 문자열로 변환하는 방법
		// SimpleDateFormat으로 형식지정객체 생성, format 메소드로 문자열 변환
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String curDate = sf.format(date);
		
		// 시간을 문자열로 변환하는 방법
		// SimpleDateFormat으로 형식지정객체 생성, format 메소드로 문자열 변환
		SimpleDateFormat st = new SimpleDateFormat("hh:mm:ss");
		String curTime = st.format(date);
		
		System.out.println(curDate + " " + curTime);
	}
}
