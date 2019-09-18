package com.biz.files.service;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {
	FileReader fileReader;

	public void read(String fileName) throws IOException {
		fileReader = new FileReader(fileName); // 메인이 아닌 곳에서의 오류처리는 던진다

		while (true) {
			int intReadChar = fileReader.read();
			/*
			 * FileReader.read()는 문자를 읽어오고 파일의 끝에 도착하면 -1을 return return값을 비교하여 while을 종료시키면
			 * 모든 문자를 불러오게 할 수 있다
			 */
			if (intReadChar < 0)
				break;
			System.out.print((char) intReadChar);
		}
		fileReader.close(); // OS에게 파일정보를 사용했으니 리소스를 절약하기 위해 닫으라고 명령
	}
}