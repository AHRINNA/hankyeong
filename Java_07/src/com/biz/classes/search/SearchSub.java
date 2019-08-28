package com.biz.classes.search;

import java.util.Scanner;

public class SearchSub {
	
	public String strNation;
	// public으로 선언된 멤버변수는 현재 클래스가 아닌 곳에서 값을 참조할 수 있다
	
	public void main() {
		// 임의의 문자열 중에 포함된 1개의 문자열을 찾는 클래스
	
		// String strNation = "Republic of Korea"; 클래스 변수단위로 이동
		
		Scanner scanner = new Scanner(System.in);
		// 임의 문자열을 제시하고 키보드에서 1개의 문자열을 입력, 이 문자열에 몇 번째 있나
		
		System.out.println("1개의 문자를 입려하시오");
		System.out.println("문자 : ");
		String strS = scanner.nextLine();
		
		/* boolean switc = false;
		
		for(int i = 0; i < strNation.length(); i++) {
			String strAt = strNation.substring(i, i+1);
			if(strAt.equalsIgnoreCase(strS)) {
				System.out.println((i+1) + "번째에서 찾음");
				switc = true;
				break;
			}
			
		}
		if(switc == false)
		{
			System.out.println("없는 문자열입니다");
		}
		*/
		
		int index = 0;
		for(index = 0; index < strNation.length(); index++)
		{
			String strAt = strNation.substring(index, index+1);
			if(strAt.equalsIgnoreCase(strS)) break;
		}
		/* 만약 문자열에 포함된 문자가 있으면 index < 17, 없으면 index == 17 */
		// System.out.println(index);
		if(index < strNation.length())
			System.out.printf("%d번째에서 찾음\n", index);
		else
			System.out.println("없는 문자열입니다");
		/*
		if(index == strNation.length())
			System.out.println("없는 문자열입니다");
		else
			System.out.printf("%d번째에서 찾음\n", index);
		*/
		// 두 if문의 결과는 같지만 위 if문이 index 범위를 검사하므로 좀 더 안전한 코드이다
		
	}
}
