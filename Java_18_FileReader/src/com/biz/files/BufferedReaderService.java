package com.biz.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderService {
	FileReader fr = null;
	BufferedReader buffer = null;
	
	public void read(String fileName) throws IOException {
		fr = new FileReader(fileName);
		buffer = new BufferedReader(fr);
		
		String str = buffer.readLine();
		System.out.println(str);
	}
}
