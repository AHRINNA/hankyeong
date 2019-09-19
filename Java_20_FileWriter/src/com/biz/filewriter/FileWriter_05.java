package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_05 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/filewriter/data2.txt";
		FileWriter fw;
		try {
			fw = new FileWriter(fileName, true);
			// true는 파일에 내용을 추가하는 옵션이다. append mode open
			String str = String.format("%s\n", "대한민국");
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
