package com.biz.classes.service.exec;

import com.biz.classes.service.children.RadioClassV2;
import com.biz.classes.service.children.TvClassV2;
import com.biz.classes.service.parents.RemoconABSV2;

public class RemoconEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvClassV2 tv1 = new TvClassV2(); // 자신으로 선언, 초기화
		RemoconABSV2 tv = new TvClassV2(); // 부모로 선언, 자신의 생성자로 초기화(권장)
		RemoconABSV2 radio = new RadioClassV2();
		tv.setName("TV");
		tv.power();
		tv.volUp();
		tv.volDown();
		tv.chUp();
		tv.chDown();
		radio.power();
	}

}
