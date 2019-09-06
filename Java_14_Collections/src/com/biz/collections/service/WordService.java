package com.biz.collections.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {

	public int count;
	private List<String> wordList;
	private String word;
	private List<String> words;
	private Scanner scan;

	public WordService() {
		scan = new Scanner(System.in);
		wordList = new ArrayList<String>();
		wordList.add("apple");
		wordList.add("deny");
		wordList.add("warning");
		wordList.add("car");
		wordList.add("danger");
		wordList.add("lane");
		wordList.add("split");
		wordList.add("bicycle");
		wordList.add("ship");
	}

	public void viewWord() {
		Collections.shuffle(wordList);
		word = wordList.get(0);
		words = Arrays.asList(word.split(""));

		Collections.shuffle(words);
		System.out.println(words);

	}

	public void input() {
		System.out.println("단어맞추기");
		this.viewWord();
		System.out.print("알파벳들을 보고 단어를 입력하시오 : ");
		 // for (int i = 1;; i++) {
			String kIn = scan.nextLine();
			if (kIn.equalsIgnoreCase(word)) {
				System.out.println("정답"); // break;
			} else {
				System.out.println("오답. 단어는 " + word);
			}
		// }
	}
}
