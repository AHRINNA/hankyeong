package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nms = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 67; i++) {
			nms.add(rand.nextInt());
		}
		// 모든 리스트를 보려할 때
		for (int i = 0; i < nms.size(); i++) {
			System.out.println(nms.get(i));
		}
		// 확장for문. forEach. nms 개수만큼 반복문 실행, 요소를 get하여 n 변수에 담아준다
		// 전체를 읽어오므로 추가나 부분을 읽어오려할 때는 쓸 수 없다
		for(int n : nms)
			System.out.println(n);
		
		int sum = 0;
		for(int n : nms) {
			sum+=n;
		}
		System.out.println("합계" + sum);
		
		for(int n:nms) {
			int index;
			for(index =2; index < n; index++) {
				if(n % index == 0) break;
			}
			if(index >= n) {
				System.out.printf("%d는 소수\n", n);
			}
		}
	}

}
