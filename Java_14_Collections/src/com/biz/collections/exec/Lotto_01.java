package com.biz.collections.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list를 사용한 lotto 번호 추출. 정수값 저장할 리스트 생성. 1~45 add
		// Collections.shuffle로 뒤섞고 6개의 리스트를 get
		List<Integer> lotto = new ArrayList<Integer>();
		for(int i = 1; i <= 45; i++) {
			lotto.add(i);
		}
		for(int i = 0; i < 8; i++)
			Collections.shuffle(lotto);
		for(int i = 0; i < 6; i++) {
			System.out.println(lotto.get(i));
		}
		
		List<Integer> lottoView = new ArrayList<Integer>();
		for(int i = 0; i < 6; i++) {
			lottoView.add(lotto.get(i));
		}
		Collections.sort(lottoView);
		for(int n : lottoView) {
			System.out.printf("  %d \t", n);
		}
	}

}
