package com.biz.date.exec;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime local = LocalDateTime.now();
		// 시간 + 날짜
		System.out.println(local.toString());
		System.out.println(local.getYear());
		System.out.println(local.getMonth());
		System.out.println(local.getDayOfYear());
		System.out.printf("%02d:%02d:%02d\n", local.getHour(), local.getMinute(), local.getSecond());
		local.plusDays(3); // 현재 날짜에 +3일
		System.out.println(local.plusDays(3));
		System.out.println(local.minusDays(3));
		System.out.println(local.plusMonths(3));
		System.out.println(local.minusMonths(3));
		System.out.println(local.plusHours(3));
		System.out.println(local.minusHours(3));
		System.out.println(local.with(TemporalAdjusters.firstDayOfYear())); // 올해 첫날
		System.out.println(local.with(TemporalAdjusters.firstDayOfNextYear())); // 내년 첫번째 날
		System.out.println(local.with(TemporalAdjusters.lastDayOfYear())); // 올해 마지막날
		System.out.println(local.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(local.with(TemporalAdjusters.lastDayOfMonth())); // 윤달을 감안하여 마지막날 계산을 해준다
		System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY))); // 이달의 첫번째 월요일 날짜
		System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY))); // 이달의 첫번째 일요일 날짜
		System.out.println(local.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY))); // 이달의 마지막 월요일 날짜
		System.out.println(local.with(TemporalAdjusters.lastInMonth(DayOfWeek.TUESDAY)));
		System.out.println(local.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
		System.out.println(local.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY))); // 오늘을 포함한 다음주 목요일을 검색
		System.out.println(local.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY))); // 지난주 목요일
		System.out.println(local.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY))); // 오늘을 포함하여 가장 마지막 월요일
		LocalDateTime makeDateTime = LocalDateTime.now();
		makeDateTime = makeDateTime.withYear(2000);
		makeDateTime = makeDateTime.withMonth(7);
		makeDateTime = makeDateTime.withDayOfMonth(29);
		makeDateTime = makeDateTime.withHour(10);
		makeDateTime = makeDateTime.withMinute(12);
		makeDateTime = makeDateTime.withSecond(22);
		System.out.println(makeDateTime.toString());
		
		LocalDateTime t = LocalDateTime.now();
		int curMonth = t.getYear();
		int p2Month = LocalDateTime.now().plusYears(2).getYear();
		System.out.printf("%d - %d = %d", p2Month, curMonth, p2Month - curMonth);
	}

}
