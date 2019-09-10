package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.string.domain.ScoreVO;

public class ScoreServiceV1 implements StringService {
//	private List<ScoreVO> scList; // 상속받은 클래스에서 접근할 수 있도록 바꿈
	protected List<ScoreVO> scList;
	private Random rnd = new Random();

	public ScoreServiceV1() {
		scList = new ArrayList<ScoreVO>();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			ScoreVO sc = new ScoreVO();
			String strNum = String.format("%05d", i + 1);
			int k;
			sc.setStrNum(strNum);
			k = rnd.nextInt(50) + 51;
			sc.setIntKor(k);
			k = rnd.nextInt(50) + 51;
			sc.setIntEng(k);
			k = rnd.nextInt(50) + 51;
			sc.setIntMath(k);
			total(sc);
			
			scList.add(sc);
		}
	}

	private void total(ScoreVO vo) {
		int total = 0;
		total += vo.getIntKor();
		total += vo.getIntEng();
		total += vo.getIntMath();
		vo.setIntTotal(total);
		vo.setIntAvg(total / 3);
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}
