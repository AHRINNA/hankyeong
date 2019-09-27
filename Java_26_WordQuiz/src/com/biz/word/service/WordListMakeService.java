package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.word.domain.WordVO;

public class WordListMakeService {
	protected List<String> wordList;
	protected List<WordVO> wordVOList;
	
	// wordList와 WordVOList를 외부에서 가져가기 위한 메소드
	public List<String> getWordList() {
		return wordList;
	}

	public List<WordVO> getWordVOList() {
		return wordVOList;
	}
	
	// String str = "src/com/biz/word/필수어휘.txt";

	/*
	 * wordFileName 파일을 열어서 문자열을 읽어들인 다음 단어:의미 형식의
	 * 문자열을 생성하고 wordList에 담기
	 */

	public void makeWordList(String wordFileName) throws Exception {
		wordList = new ArrayList<String>();
		wordVOList = new ArrayList<WordVO>();
		FileReader fr = new FileReader(wordFileName);
		BufferedReader br = new BufferedReader(fr);
		String reader = new String();
		while (true) {
			reader = br.readLine();
			if (reader == null)
				break;

			String words[] = reader.split(":");
			// words[0] : 순서번호, words[1] : 영단어, words[2] : 의미
			// 영단어랑 의미만 필요하므로 이 두개만 wordList에 추가
			String word = String.format("%s:%s", words[1], words[2]);
			wordList.add(word);
			WordVO wVO = new WordVO();
			wVO.setEngWord(words[1]);
			wVO.setKorMeans(words[2]);
			wordVOList.add(wVO);
		}
		br.close();
		fr.close();
	}
}