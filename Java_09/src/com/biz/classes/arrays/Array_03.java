package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {
	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);

		int[] iNum = new int[10]; // 10개 배열생성
		int index; // 검색시 활용될 값
		int sNum; // 찾을 값
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = rand.nextInt(10) + 1; // 배열에 난수 할당
		}

		System.out.print("1~10까지의 정수 하나를 입력하세요 : ");
		sNum = Integer.valueOf(scanner.nextLine()); // 문자열형 정수를 받아 정수형으로 형변환
		if (sNum >= 1 && sNum <= 10) { // 만약 입력받은 값이 범위를 벗어나는 정수값이면 종료하고 범위 이내면 프로그램 실행
			for (index = 0; index < iNum.length; index++) {
				if (iNum[index] == sNum) // 앞에서부터 입력값과 배열에 동일한 값이 있으면 for문 break;
					break;
			}
			if (index >= iNum.length) { // index를 10까지 돌리고 index가 배열보다 길어져있는 상태로 for문이 끝나면 값이 없는 것
				System.out.println("값이 없습니다");
			} else // 동일한 값이 있는 상태에서 for문을 종료했으므로 index++가 안되고 for문을 빠져나온다. 그 index값을 출력
				System.out.printf("%d번째에 입력값이 있습니다\n", index + 1);

			for (int i = 0; i < iNum.length; i++) { // 배열에 어떤 난수들이 할당되었는지 확인
				System.out.printf("%d ", iNum[i]);
			}
		}
		else
			System.out.println("입력값이 범위에서 벗어났습니다");
	}
}
