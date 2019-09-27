package com.biz.word.exec;

import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizService;
import com.biz.word.service.WordQuizServiceV1;
import com.biz.word.service.WordQuizServiceV2;

public class WordEx_03 {
	public static void main(String[] args) {
		
		WordListMakeService wm = new WordListMakeService();
		WordQuizService wq = new WordQuizServiceV1();
		wq = new WordQuizServiceV2();
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		try {
			wm.makeWordList(wordFileName);
			// WordQuizServiceV2 ws = new WordQuizServiceV2();
			wq.setWordVOList(wm.getWordVOList());
			wq.quizExec();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}