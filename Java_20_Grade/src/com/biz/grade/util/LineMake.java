package com.biz.grade.util;

public class LineMake {
	public static String make(String str, int length) {
		String s = new String();
		for(int i = 0; i < length; i++) {
			s += str;
		}
		return s;
	}
}
