package com.biz.string.exec;

import java.util.Random;

public class StringEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int r = rnd.nextInt();
			if (r < 0) {
				r *= (-1);
			}

			String strNum = r + "";
			
			/* String[] str = strNum.split(""); 문자열 배열에 잘라내서 3번째 값을 정수형으로 돌려 sum에 합계계산.
			sum += Integer.valueOf(str[3]); */
			/* for(int j = 0; j < str.length; j++) { 값들을 확인하는 콘솔출력문
				System.out.print(str[j]);
			}System.out.println();
			System.out.println(strNum); */
			
			// sum += Integer.valueOf(strNum.substring(3, 4)); 3번부터 4번까지의 문자열을 잘라서 정수형으로 변환
			
			char j = strNum.charAt(3);
			System.out.println(strNum);
			System.out.println(j);
			// sum += Integer.valueOf(j); // 캐릭터가 아스키값의 정수형으로 들어가서 의도치 않은 값이 출력된다
			// sum += Character.getNumericValue(j); // 캐릭터를 정수로 바꿔주는
			sum += Integer.valueOf(String.valueOf(j));
		}
		System.out.println(sum);
	}
}
