package com.biz.loop;

public class Boolean_01 {
	public static void main(String[] args) {
		
		boolean Yes = 3 == 3;
		System.out.println(Yes);
		Yes = 4 == 4;
		System.out.println(Yes);
		Yes = 4 > 4;
		System.out.println(Yes);
		Yes = 4 >= 4;
		System.out.println(Yes);
		Yes = 5 == 5 || 4 == 4; // || 는 부울대수의 OR
		System.out.println(Yes);
		
		Yes = 5 == 5 && 3 == 3; // && 는 부울대수의 AND
		System.out.println(Yes);
		Yes = 5 > 5 && 4 == 4;
		System.out.println(Yes);
		Yes = 5 <= 5 && 3 >= 3;
		System.out.println(Yes);
		
		Yes = 3 != 4; // != 같지않냐
		System.out.println(Yes);
		
		Yes = !Yes; // ! NOT연산. 값 반전. TRUE -> FALSE, FALSE -> TRUE
		System.out.println(Yes);
		
	}
}
