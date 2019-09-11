package com.biz.class_method;

import java.util.List;

public class ScoreEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreService sService = new ScoreService();
		int nTotal = sService.total();
		List<String> scList = sService.input(3);
	}

}
