package com.biz.jack.utils;

public class BlackjackUtils {
	public static String getStringLong(String s, int length) {
		String r = "";
		for(int i = 0; i < length; i++) {
			r += s;
		}
		return r;
	}
}
