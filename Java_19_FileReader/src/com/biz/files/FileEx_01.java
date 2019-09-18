package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_01 {

	public static void main(String[] args) {
		String fileName = "src/com/biz/files/data.txt";
		FileReader fileReader;
		try { // fileName으로 지정된 txt파일을 읽을 수 없을 경우를 처리해줘야 함. 메인에선 try~catch
			// fileReader 인스턴스에는 파일을 읽는데 필요한 여러가지 정보가 담겨있고, 메소드로 핸들링
			fileReader = new FileReader(fileName);
			int intChar = fileReader.read(); // 파일정보를 이용해 한개의 문자를 읽어서 ASCII로. IO exeception을 처리해줘야함
			System.out.printf("%d : %c\n" , intChar, (char)intChar); // ASCII값을 확인하고 어떤 문자인지 console 출력
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}