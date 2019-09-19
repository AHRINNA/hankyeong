package com.biz.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/filewriter/data2.txt";
		
		FileWriter fW;
		BufferedWriter buffer;
		
		try {
			fW = new FileWriter(fileName);
			buffer = new BufferedWriter(fW);
			
			String str = String.format("%20s\n" , "Republic of Korea");
			buffer.write(str);
			// buffer.write를 쓰면 메모리에 버퍼 영역을 만들고 데이터를 기록한다
			// 버퍼 메모리 영역이 가득차면 JVM, OS는 자동으로 해당 내용을 파일에 기록한다
			// 가득차지 않으면 기록하지 않는다. flush는 현재 버퍼에 저장되어있는 내용을
			// 파일에 강제로 기록하게 하는 메소드다. close는 실행 후에는 다시 못쓰지만 flush는 다시 쓸수있다
			buffer.flush();
			buffer.write("12345");
			buffer.close();
			fW.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
