package com.biz.loop;

public class Loop_09 {
	public static void main(String[] args) {
		
		/* 표준 for 반복문의 ㅣㄹ행구조
		 * int i = 0 : 카운트 변수 선언 및 초기화
		 * i < 10 : i 값의 범위 비교하여 bool형 return
		 * return된 bool값이 true면 명령문 실행 후 증감문 실행
		 * return된 bool값이 false면 for문 종료
		 */
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		System.out.println("=========");
		for(int i = 0; i <= 10; i++) {
			if( i > 0 )
			{
				System.out.print("1부터 " + i +"까지의 덧셈 : ");
				sum += i;
				System.out.println(sum);
			}
		}
		
	}
}
