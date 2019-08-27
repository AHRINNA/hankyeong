package com.biz.for_if;

public class If_06 {
	public static void main(String[] args) {
		/* 다양한 조건에 따라 명령문을 실행할 경우
		 * 여러번의 조건을 수행하는 방법
		 * if-else if-else/if-if-if-if 결과는 같지만 내부 로직이 다르다
		 * if if if는 모두 거쳐가야하지만 else를 사용하는 경우에는 맞는 상황이 오면 if 탈출
		 * 
		 * 효율만이 아닌 문제풀이적 관점에서 2의 배수이면서 4의 배수인 것을 찾으려면 if-if-if
		 */
		int num = 47;
		if(num % 3 == 0) {
			System.out.printf("%d는 3의 배수", num);
		}
		else if(num % 4 == 0){
			System.out.printf("%d는 4의 배수", num);
		}
		else if(num % 2 == 0) {
			System.out.printf("%d는 2의 배수", num);
		}
		else
			System.out.printf("%d는 2, 3, 4의 배수가 아니다", num);
	}
}
