package com.biz.classes.arrays;

import java.util.Random;

public class Lottos {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] lottos = new int[6];

		int nLottoIndex = 0; // 6개의 숫자가 채워졌는지 확인하는 index
		while (true) { // 6개의 숫자가 채워질 때까지 반복

			int lotNum = rand.nextInt(45) + 1;
			int index; // 이미 넣은 값 중 새로 뽑은 값이 있는지 확인하는 index
			for (index = 0; index < lottos.length; index++) {
				if (lottos[index] == lotNum) // lottos 배열에 저장된 값이 새로 뽑은 값과 같은게 있는가
					break; // 있으면 for문을 중지
			}

			// 같은 값이 없으면(for문을 다 빠져나온다면) nLottoIndex 위치에 뽑은 값을 채운다
			if (index >= lottos.length) {
				lottos[nLottoIndex++] = lotNum;
			}

			if (nLottoIndex >= lottos.length)
				break;

		}
		System.out.println("AI가 뽑아준 로또 번호");
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + ", ");
		}
	}

}
