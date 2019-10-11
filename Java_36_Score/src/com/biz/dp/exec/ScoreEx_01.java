package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		// TODO Auto-generated method stub
		ScoreVO sVO = new ScoreVO();
		/*
		 * build 패턴 객체 생성. 객체를 생성하면서 필드 값을 삽입
		 * 필드 이름과 같은 setter를 통해 값을 삽입하는 두 개의 기능들을 모아둔 패턴
		 * 
		 * 생성자를 통해 값을 넣을 때 어떤 필드에 값을 넣는지 불명확하여 잘못 넣을 가능성을 없애고
		 * 별도 객체를 생성하여 setter를 통해 필드값을 주입하는 형태에서
		 * 별도로 객체를 만들지 않아도 값을 넣을 수 있다 
		 */
		// 빌드패턴을 이용한 객체생성 및 리스트 추가
		ScoreVO sBVO = new ScoreVO.Builder()
				.s_num("001")
				.s_kor(90)
				.s_eng(80)
				.s_math(70)
				.build();
		scoreList.add(sVO);
		scoreList.add(new ScoreVO.Builder()
				.s_num("002")
				.s_kor(90)
				.s_eng(80)
				.s_math(70)
				.build());
		
		scoreList.add(new ScoreVO.Builder()
				.s_num("003")
				.s_kor(90)
				.s_eng(80)
				.s_math(70)
				.build());
		
		scoreList.add(new ScoreVO.Builder()
				.s_num("004")
				.s_kor(90)
				.s_eng(80)
				.s_math(70)
				.build());
	}
}
