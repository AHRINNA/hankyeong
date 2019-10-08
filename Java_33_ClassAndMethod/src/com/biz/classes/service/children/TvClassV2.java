package com.biz.classes.service.children;

import com.biz.classes.service.parents.RemoconABSV2;

public class TvClassV2 extends RemoconABSV2{

	public void power() {
		System.out.println(name + "을(를) 켭니다");
	}
	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

}
