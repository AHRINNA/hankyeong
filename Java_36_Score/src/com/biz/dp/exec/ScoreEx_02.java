package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.ScoreVO;

public class ScoreEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		// build pattern을 이용한 객체 생성하고 리스트 추가
		// 일일이 vo를 생성해 add를 수행하는 java beans pattern으로 할 필요가 없다
		// 또한 생성자로 필드변수에 잘못된 값이 추가될 수 있는 잠재적 오류를 줄일 수 있다
		scoreList.add(new ScoreVO.Builder().s_num("001").build());
		scoreList.add(new ScoreVO.Builder().s_num("001").s_kor(90).build());
		scoreList.add(new ScoreVO.Builder().s_num("001").s_kor(90).s_eng(80).build());
		scoreList.add(new ScoreVO.Builder().s_num("001").s_kor(90).s_eng(80).s_math(70).build());
	}
}
