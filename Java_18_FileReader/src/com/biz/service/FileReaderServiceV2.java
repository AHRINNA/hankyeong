package com.biz.service;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV2 {
	FileReader fr = null;

	public void read(String fileName) throws IOException {
		/*
		 * read(String fileName)이 실행될 때 IOException이 발생하면 read method를 호출한 곳으로
		 * exception을 던진다
		 */
		fr = new FileReader(fileName);
		while (true) {
			int al = fr.read();
			if (al < 0)
				break;
			System.out.print((char)al);
		}
	}
}
