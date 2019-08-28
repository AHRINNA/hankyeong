package com.biz.string.classes;

// import java.util.Scanner;

public class String_10 {
	
	public static void main(String[] args) {
		
		
		// Scanner scanner = new Scanner(system.in);
		
		/*
		 * 1부터 100까지 숫자 중에서 7의 배수가 2번째로 나타나면
		 * 그 값을 표시하시오
		 */
		
		int cnt = 0;
		int cntCNT = 5;
		int baesu = 8;
		int intMax = 100;
		
		for(int i = 1; i <= intMax; i++) {
			if((i % baesu) == 0)
			{
				cnt += 1;
			}
			if(cnt == cntCNT)
			{
			System.out.printf("%d는 %d의 %d번째 배수입니다\n", i, baesu, cntCNT);
			break;
			}
		}
		
	}
}
