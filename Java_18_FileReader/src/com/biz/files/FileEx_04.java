package com.biz.files;

import java.io.IOException;

import com.biz.service.FileReaderServiceV2;

public class FileEx_04 {
	public static void main(String[] args) {
		FileReaderServiceV2 fr = new FileReaderServiceV2();
		String fileName = "src/com/biz/files/data.txt";
		
		try {
			fr.read(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
