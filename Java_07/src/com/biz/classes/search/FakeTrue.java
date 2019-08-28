package com.biz.classes.search;

import java.util.Scanner;

public class FakeTrue {
	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		Scanner scanner = new Scanner(System.in);
		// 임의 문자열을 제시하고 키보드에서 1개의 문자열을 입력, 이 문자열에 몇 번째 있나

		System.out.println("1개의 문자를 입려하시오");
		System.out.println("문자 : ");
		String strS = scanner.nextLine();

		/*
		 * boolean switc = false;
		 * 
		 * for(int i = 0; i < strNation.length(); i++) { String strAt =
		 * strNation.substring(i, i+1); if(strAt.equalsIgnoreCase(strS)) {
		 * System.out.println((i+1) + "번째에서 찾음"); switc = true; break; }
		 * 
		 * } if(switc == false) { System.out.println("없는 문자열입니다"); }
		 */

		int index = 0;
		for (index = 0; index < strNation.length(); index++) {
			String strAt = strNation.substring(index, index + 1);
			if (strAt.equalsIgnoreCase(strS))
				break;
		}
	}
}
