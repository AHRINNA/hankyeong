package com.biz.collections.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordQuiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "friday";
		List<String> words = Arrays.asList(word.split(""));
		Scanner scan = new Scanner(System.in);
		
		Collections.shuffle(words);
		System.out.println("알파벳을 알맞게 배열하여 단어를 만드시오 " + words);
		System.out.print("단어 : ");
		String strIn = scan.nextLine();
		if(word.equalsIgnoreCase(strIn)){
			System.out.println("RIGHT");
		}
		else
		{
			System.out.println("WRONG");
			System.out.println("원래 단어는 " + word);
		}
	}

}
