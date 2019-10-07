package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 파일을 바이트 단위로 읽을 수 있는 클래스. text, img, 영상, 음악 등 모든 파일을 읽을 수 있다
		 */
		String imgFile = "src/com/biz/stream/[포맷변환]2019 (1).png";
		// null로 선언, 파일을 open하여 인스턴스화, byte씩 읽어서 변수에 저장, 읽기 끝나면 닫기
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(imgFile);
			int input;
			while(true) {
				input = fs.read();
				if(input == -1) break;
				System.out.printf("%02x\n", input); // input 변수에 담긴 값을 16진수로
			}
			fs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
