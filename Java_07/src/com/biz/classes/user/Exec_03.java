package com.biz.classes.user;

public class Exec_03 {
	
	public static void main(String[] args) {
	
		for(int i = 0; i < 10; i++) { // User_03 Class의 count() method 10회 호출
			User_03.count();
		}
		System.out.println("================");
		
		for(int i = 0; i < 10; i++) { // User_033 Class의 count() method 10회 호출
			User_033.count();
		}
		for(int i = 0; i < 10; i++) { // User_033 Class의 count() method 10회 호출
			User_033.count();
		}
	}
	
}
