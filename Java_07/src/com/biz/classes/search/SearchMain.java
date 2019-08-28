package com.biz.classes.search;

import java.util.Scanner;

public class SearchMain {
	public static void main(String ars[]) {

		SearchSub ss = new SearchSub();
		Scanner scanner = new Scanner(System.in);
		
		ss.strNation = "UNITED NATION";
		// sub class의 멤버변수 strNation에 문자열 세팅
		// ss.main();

		// 조건으로 횟수를 지정한 반복문. for (;;) {
		while (true) { // 단일 조건으로 무한/유한 반복을 수행 while반복문

			ss.main();
			System.out.println("Press anykey coutinue...");
			System.out.println("종료하려면 END를 입력하시오");
			String anyKey = scanner.nextLine();
			if (anyKey.contentEquals("END")) {
				break;
			}

		}
		System.out.println("It's Over");

		/*
		 * // 임의의 문자열 중에 포함된 1개의 문자열을 찾는 클래스
		 * 
		 * String strNation = "Republic of Korea"; Scanner scanner = new
		 * Scanner(System.in); // 임의 문자열을 제시하고 키보드에서 1개의 문자열을 입력, 이 문자열에 몇 번째 있나
		 * 
		 * System.out.println("1개의 문자를 입려하시오"); System.out.println("문자 : "); String strS
		 * = scanner.nextLine();
		 * 
		 * for(int i = 0; i < strNation.length(); i++) { String strAt =
		 * strNation.substring(i, i+1); if(strAt.equalsIgnoreCase(strS)) {
		 * System.out.println(i+"번째에서 찾음"); } break;
		 * 
		 * }
		 */
	}
}
