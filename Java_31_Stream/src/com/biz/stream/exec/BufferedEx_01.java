package com.biz.stream.exec;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imgFile = "src/com/biz/stream/[포맷변환]2019 (2).png";
		FileInputStream fs = null;
		BufferedInputStream bf = null;
		
		// bufferedinputstream. fileinputstream으로 open된 파일을 읽어서 buffer에 임시저장
		// read를 통해서 buffer로부터 값을 읽는다
		try {
			fs = new FileInputStream(imgFile);
			bf = new BufferedInputStream(fs);
			byte[] bytes = new byte[32];
			bf.read(bytes);
			for(int i = 0; i < bytes.length; i++) {
				System.out.printf("%02x ", bytes[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
