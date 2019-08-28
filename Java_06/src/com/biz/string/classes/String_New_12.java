package com.biz.string.classes;

public class String_New_12 {
	public static void main(String aags[]) {
		String s1 = "Korea", s2 = "Korea";
		String n1 = new String("Korea");
		String n2 = new String("Korea");
		
		boolean Yes = s1 == s2;
		System.out.println(Yes);
		
		Yes = n1 == n2;
		System.out.println(Yes);
		
		Yes = n1.equalsIgnoreCase(n2);
		System.out.println(Yes);
	}
}
