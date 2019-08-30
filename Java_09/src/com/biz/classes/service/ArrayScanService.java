package com.biz.classes.service;

import java.util.Random;
import java.util.Scanner;

public class ArrayScanService {

	private int[] nums;

	/*
	 * 클래스에 포함되는 method 중에 void 등이 없고 클래스 이름과 같은 method를 생성자 method라고 한다 누군가 new
	 * ArrayScanService()를 호출할 때 자동으로 호출되는 method
	 */
	public ArrayScanService(int length) {

		Random rand = new Random();
		nums = new int[length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.valueOf(rand.nextInt(10) + 1);
		}
	}

	public void scanArray() {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~10까지 정수 입력 :");
		int intNum = Integer.valueOf((scan.nextLine()));

		int index;
		for (index = 0; index < nums.length; index++) {
			if (nums[index] == intNum)
				break;
		}
		if (index >= nums.length)
			System.out.println("찾는 값이 없음");
		else
			System.out.printf("찾는 값이 %d번째 위치에 있음\n", index + 1);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		scan.close();
	}

	public void scanArrayAll() {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~10까지 정수 : ");
		int intNum = Integer.valueOf(scan.nextLine());

		int nCount = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == intNum) {
				System.out.printf("%d번째에서 찾음\n", i + 1);
				nCount++;
			}
		}
		if (nCount < 1) {
			System.out.println("찾지 못함");
		} else {
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + ", ");
			}
			System.out.println();
		}
		// scan.close(); 스캐너를 여러개 사용하면 오류가 발생할 확률이 있다
	}

}
