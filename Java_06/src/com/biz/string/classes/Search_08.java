package com.biz.string.classes;

import java.util.Scanner;

public class Search_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		System.out.printf("전체 문자열 : %s\n", strNation);
		System.out.printf("앞에서부터 찾고자하는 문자를 입력하세요 : ");
		String strSearch = scanner.nextLine();
		System.out.printf("입력한 문자 : %s\n", strSearch);
		
		// int indexOf = strNation.indexOf(strSearch);
		
		// System.out.println(strNation.substring(3,4));
		
		// Search 알고리즘. 선형탐색
		
		for(int i = 0; i < intLength; i++)
		{
			if(strNation.substring(i, i+1).equals(strSearch)) {
				System.out.printf("찾고자하는 문자는 %s이며, 앞에서부터 %d번째에 있는"
						+ " %s입니다\n", strSearch, i+1, strNation.substring(i,i+1));
				break; // 반복문 중단
			}
		}		
	}
}
