package com.biz.classes;

/* static이 아니므로 method를 사용하려면 객체로 먼저 선언, 생성해야 한다
 * 클래스는 첫 글자를 대문자로 시작하는 이름을 가진다
 * 중간에 숫자, _를 포함할 수 있다
 * 빈칸이나 특수문자는 포함할 수 없다
 * method의 첫 글자는 소문자로 시작하는 이름을 가진다. 변수명 규칙과 같다
 */

public class Class_01 {

	public String strMember = "멤버 변수";
	
	public void method_01() {
		System.out.println("나는 method_01");
		System.out.println(strMember);
	}

	public void method_02() {
		System.out.println("나는 method_02");
		System.out.println("나는 Class 01의 두번째 method");
	}

	public void method_03() {
		System.out.println("나는 method_03");
		System.out.println("대한민국 만세");
	}
}
