package com.biz.for_if;

public class If_08 {
	public static void main(String[] args) {
		
		short intAge = 67;
		/*나이의 조건은 0세 이상 120세 이하의 값을 허용하는데 intAge에 담긴 값이 해당 조건에
		 * 맞지 않으면 메시지를 표시하시오
		 */
		if(intAge >= 0 && intAge <= 120) {
			System.out.println("나이는 " + intAge +"살입니다");
		}
		else
			System.out.println("나이의 범위를 벗어났습니다");
		
	}
}
