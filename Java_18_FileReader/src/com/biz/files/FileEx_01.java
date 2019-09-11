package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/* data.txt파일을 읽어서 기억장치로 넘기려 한다
 * OS에 data.txt를 읽을 것이라 FileReader클래스가 요청
 * 요청을 OS가 confirm하면 읽을 정보를 java에서 사용할 수 있게 준비해준다
 * 읽으려고 하는 파일의 경로(path)와 이름까지 문자열 형태로 전달하면서 객체로 생성
 */
public class FileEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "src/com/biz/files/data.txt";
		FileReader fileReader = null;
		
		// 1개의 try로 여러 catch를 달 수 있다
		
		try {
			fileReader = new FileReader(file); // FileReader클래스를 사용해서 파일을 읽을 준비 수행 중 여러 이유로 파일을 열지 못할 수 있다
			// 파일이 지워졌거나 깨졌으면 FileNotFoundException이 발생할 수 있다
			int alpha = fileReader.read(); // IOException이 발생할 수 있다. 한 글자를 읽어서 ASCII int값 return
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			
			alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
