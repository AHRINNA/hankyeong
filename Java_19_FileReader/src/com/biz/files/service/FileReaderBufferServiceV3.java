package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV3 {
	FileReader fileReader;
	BufferedReader buffer;

	public void read(String fileName) throws IOException {
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		String reader = "";
		// while의 조건문에 reader를 쓰기 위해 scope를 변화시킨다. 다만 초기화를 null 값으로 했으므로 do~while을 사용
		// 하지만 마지막 줄에 null값까지 불러들여 보여주므로 if가 들어가더라도 V2 코드가 더 나은 코드가 된다
		
		/*
		while(reader != null) {
			reader = buffer.readLine();
			if(reader == null) break;
			System.out.println(reader);
		}
		*/
		
		do {
			reader = buffer.readLine();
			System.out.println(reader);
		} while(reader != null);
		// 작업이 완료되었으므로 리소스들 반납. 버퍼부터 먼저 close 시켜야한다. 순서주의※
		buffer.close();
		fileReader.close();
	}
}
