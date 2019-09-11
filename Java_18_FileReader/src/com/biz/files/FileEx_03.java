package com.biz.files;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.service.FileReaderServiceV1;

public class FileEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReaderServiceV1 fr = new FileReaderServiceV1();
		try {
			fr.read("src/com/biz/files/data.txt");
		} catch(FileNotFoundException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
