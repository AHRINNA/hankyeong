package com.biz.string;

public class String_05 {
	public static void main(String[] args) {
		short num = 30;
		boolean bYes = num == 30;
		
		if(bYes)
			System.out.println("num에는 30이 담겨있다");
		else
			System.out.println("num에는 30이 담겨 있지 않다");
		
		
		num = 50;
		int num1 = 30;
		
		bYes = num == num1;
		
		String strNation = "Korea";
		String strKorea = "Korea";
		
		bYes = strNation == strKorea;
		System.out.println(bYes);
		
		if(strNation == strKorea)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		/* String은 클래스형 변수로
		내부 로직이 달라서 일반변수처럼 ==을 이용해서 비교하면 안된다
		결과가 같을 때도 있고 다를 때도 존재하기에, 비교하는 메소드를 사용해야 한다
		*/
		
		// 대소문자를 포함하여 문자의 일치를 확인하는 메소드
		bYes = strNation.equals(strKorea);
		System.out.println(bYes);
		bYes = strKorea.equals(strNation);
		System.out.println(bYes);
		
		// 대소문자를 신경쓰지 않고 문자의 일치만 확인하는 메소드
		bYes = strNation.equalsIgnoreCase(strKorea);
		bYes = strKorea.equalsIgnoreCase(strNation);
	}
}
