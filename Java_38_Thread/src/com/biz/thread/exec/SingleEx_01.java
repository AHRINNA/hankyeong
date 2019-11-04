package com.biz.thread.exec;

import com.biz.thread.classes.SingleClassV1;
//SingleClass를 이용해서 sc라는 변수를 만들고 쓰레드에서도 sct를 만들어서 사용하였지만 데이터를 침범하여 데이터가 깨졌다
public class SingleEx_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleClassThreadEx_01 sct = new SingleClassThreadEx_01();
		sct.start();
		SingleClassV1 sc = SingleClassV1.getInstance();
		sc.sum = 0;
		for(int i = 0; i < 100; i++)
			sc.sum += i+1;
		System.out.println("메인에서 계산한 결과 : " + sc.sum);
	}
}
