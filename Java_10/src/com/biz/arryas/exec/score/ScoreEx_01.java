package com.biz.arryas.exec;

import java.util.Random;

import com.biz.arryas.model.ScoreVO;

public class ScoreEx_01 {
	public static void main(String[] args) {

		ScoreVO[] sVO = new ScoreVO[20];
		Random rand = new Random();

		/*
		 * 선언된 sVO 각 요소를 초기화하고 임의 값으로 과목 점수를 세팅
		 */

		for (int i = 0; i < sVO.length; i++) {
			sVO[i] = new ScoreVO();
			sVO[i].strNum = String.format("%03d", i + 1);
			sVO[i].intKor = rand.nextInt(50) + 51;
			sVO[i].intEng = rand.nextInt(50) + 51;
			sVO[i].intMath = rand.nextInt(50) + 51;
			
			// sVO[i].intSum 접근제한자를 private로 선언하였기 때문에 외부에서 접근할 수 없다
			// public으로 선언한다면 접근할 수 있다
			// sVO[i].intSum = sVO[i].intKor + sVO[i].intEng + sVO[i].intMath;
			
			sVO[i].Sum();
		}
		
		System.out.println("=================");
		System.out.println("학번\t총점");
		System.out.println("-----------------");
		for(int i = 0; i < sVO.length; i++)
		{
			System.out.printf("%s\t%d\n", sVO[i].strNum, sVO[i].Sum());
		}
	}
}
