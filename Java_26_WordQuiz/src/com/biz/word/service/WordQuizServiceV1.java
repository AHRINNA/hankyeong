package com.biz.word.service;

import java.util.Collections;
import java.util.List;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV1 implements WordQuizService {
	protected List<WordVO> wordVOList;
	// 이 클래스를 누군가에게 상속하고 상속받은 곳에서
	// wordVOList를 사용할 수 있게 하려면 protected로 설정
	 

	public WordQuizServiceV1() {

	}

	public WordQuizServiceV1(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}

	public void setWordVOList(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}
	// wordVOList에서 임의의 1개 영단어를 추출하여 console에 출력
	public void viewEngWord() {
		Collections.shuffle(this.wordVOList);
		System.out.println(this.wordVOList.get(0).getEngWord());
	}

	@Override
	public void quizExec() throws Exception {
		// TODO Auto-generated method stub
		
	}
}