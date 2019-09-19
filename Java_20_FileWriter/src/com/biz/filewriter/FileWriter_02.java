package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_02 {

	public static void main(String[] args) {
		FileWriter fW;
		String fileName = "src/com/biz/filewriter/data1.txt";
		try {
			fW = new FileWriter(fileName);
			String str = String.format("%5d : %-5d\n", 12, 15);
			fW.write(str);
			fW.write("=================================================\n");
			fW.write("학번\t\t이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\n");
			fW.write("=================================================\n");
			fW.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
