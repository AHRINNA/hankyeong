package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "src/com/biz/files/data.txt";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			
			while(true) {
				int al = fileReader.read();
				if(al < 0) break;
				System.out.println(al + "");
				System.out.println((char)al);	
			}
			
		} catch (FileNotFoundException e) { // 파일이 없는 exception만 처리
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (IOException e) { // 파일을 읽는동안 문제가 발생한 exception만 처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("어떠한 exception이어도 처리 가능");
		}

	}

}
