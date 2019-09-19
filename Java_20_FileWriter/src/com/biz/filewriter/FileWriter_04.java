package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_04 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/filewriter/data2.txt";
		FileWriter fw;
		try {
			fw = new FileWriter(fileName, false);
// FileWriter 생성자의 두번째 옵션값이 false면 기존 file은 삭제하고 새로 생성한 후 기록하도록 open
// 값을 비워둔다면 default는 false
// true는 파일에 내용을 추가하는 옵션이다. append mode open. 파일이 없으면 생성한다.
			String str = String.format("%s\n", "대한민국");
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
