package com.biz.date.exec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Date, Calender의 다양한 이슈를 해결하고 locale(국가별) 여러가지 사항들을 해결하는
		 * 새로운 클래스를 도입. jdk 8 이상에서 사용 가능
		 */
		LocalDate localDate = LocalDate.now(); // 문자열로 생성하기
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String curDate = dtf.format(localDate);
		System.out.println(curDate);
	}

}
