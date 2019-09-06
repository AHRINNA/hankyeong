package com.biz.collections.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordQuiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strWord = "yesterday";
		
		String[] words = strWord.split(""); // 문자열을 알파벳단위로 쪼개서 문자열 배열로 만드는 메소드
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	
		List<String> alphList = Arrays.asList(words); // 배열을 리스트 자료구조로 바꾸는 메소드
		System.out.println(alphList);
		
		Collections.shuffle(alphList);
		System.out.println(alphList);
	}

}
