package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_03 {

	public static void main(String[] args) {
		String fileName = "src/com/biz/filewriter/data2.txt";
		FileWriter fW;
		try {
			fW = new FileWriter(fileName);
			while(true) {
				// 파일을 열고 무한루프. 아무도 그 파일에 프로세스 할 수 없게 된다
				// 읽기 위해 open한 경우는 close를 하지 않아도 일단은 문제를 일으키지 않지만
				// 쓰기 위한 open은 close를 꼭 해줘야한다
				// close하는 목적 두가지. 정확한 기록을 위해/단독점유로 문제를 만들지 않기 위해
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
