package com.biz.arryas.model;

public class MemberVO {
	
	public String strName;
	public String strTel;
	
	/* MemberVO의 멤버 변수 중 intAge는 나이를 보관하는 변수이다. 만약 실수로
	 * 데이터를 저장할 때 실제 나이범위를 벗어나면 연산수행시 문제를 일으킬 수 있다
	 * 이럴 때 private으로 선언하고 저장할 때 메소드를 이용하여 저장하는 방법이 있다
	 */
	private int intAge;
	
	public int getIntAge() { // 외부에서 값을 읽을 때 사용할 메소드
		return intAge;
	}
	// 외부에서 intAge변수에 값을 할당할 때 사용할 메소드
	public void setIntAge(int intAge) {
		// 잘못된 값이 들어가지 않도록 보호하는 역할을 한다. 이것을 유효성 검사라고 한다
		if(intAge > 120) {
			System.out.println("나이는 120세 이하여야 한다");
			return ; // 반복문의 break와 비슷하게 void문이 여기서 끝난다
		}
		if(intAge < 0) {
			System.out.println("나이는 0세 이상이어야 한다");
			return ; // 반복문의 break와 비슷하게 void문이 여기서 끝난다
		}
		this.intAge = intAge;
	}
}
