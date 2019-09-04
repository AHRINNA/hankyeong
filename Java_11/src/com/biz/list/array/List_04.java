package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {
	public static void main(String[] args) {
		
		List<Integer> nms = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i = 0; i < 5; i++)
		{
			nms.add(rand.nextInt());
		}
		// list.size() 현재까지 add된 리스트가 몇개인지 알려주는 메소드
		for(int i = 0; i < nms.size(); i++)
		{
			System.out.println(nms.get(i));
		}
		// 위 코드는 for가 반복될때마다 nms.size메소드를 계속 불러와 비효율적
		// 아래 코드는 메소드를 사전에 실행해 변수에 입력. 변수로만 불러오므로 효율적
		int nmsSize = nms.size();
		for(int i = 0; i < nmsSize; i++)
		{
			System.out.println(nms.get(i));
		}
	}
}
