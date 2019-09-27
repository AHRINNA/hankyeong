package com.biz.word.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV2 extends WordQuizServiceV1 {
	int nCount;

	public WordQuizServiceV2() {
		nCount = 0;
	}
	// v1에 선언된 wordVOList를 사용할 수 있어진다
	// List<WordVO> wordVOList;
	/*
	 * v1에 선언된 setWordVOList를 사용하기 위해 제거 public void setWordVOList(List<WordVO>
	 * wordVOList) { this.wordVOList = wordVOList; }
	 */

	// wordVOList에서 임의 1개의 영문단어를 추출하여 알파벳 단위로 분해하여 무작위로 섞어서
	// console에 보이시오
	public void viewEngWord() {

		// 단어 맞추기를 1번이라도 틀린적이 있으면 여전히 그 단어를 보여주고
		// 처음 시작하거나 단어를 맞추면 새로운 단어를 불러온다
		if (nCount > 0) {
			System.out.println();
			viewEngWord(wordVOList);
		}
		Collections.shuffle(this.wordVOList);
		char[] c = this.wordVOList.get(0).getEngWord().toCharArray();
		List<Character> df = new ArrayList<Character>();
		for (int i = 0; i < c.length; i++) {
			df.add(c[i]);
		}
		System.out.println(df);
		Collections.shuffle(df);
		// for(Character se : df)
		// System.out.print(se);
		System.out.println(df);
	}

	private void viewEngWord(List<WordVO> wList) {
		wList = wordVOList;
		char[] c = this.wordVOList.get(0).getEngWord().toCharArray();
		List<Character> df = new ArrayList<Character>();
		for (int i = 0; i < c.length; i++) {
			df.add(c[i]);
		}
		Collections.shuffle(df);
		System.out.println(df);
	}

	// viewEngWord에서 뒤섞어 보여준 단어의 원형을 키보드로 입력받고 맞는지 확인하는 메소드
	@Override
	public void quizExec() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("다음 알파벳을 보고 연상되는 영어단어를 입력하세요");
		viewEngWord();
		System.out.print("입력 >> ");
		String s = br.readLine();
		WordVO wVO = this.wordVOList.get(0);
		if (s.equalsIgnoreCase(wVO.getEngWord())) {
			System.out.println(wVO.getKorMeans() + " (이)라는 뜻의 영단어");
			System.out.println("정답입니다");
			nCount = 0;
		} else {
			System.out.println((nCount + 1) + "째 오답입니다");
			nCount++;
		}
	}
}