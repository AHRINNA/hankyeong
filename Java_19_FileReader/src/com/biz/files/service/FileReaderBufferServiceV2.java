package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV2 {
	FileReader fileReader;
	BufferedReader buffer;

	public void read(String fileName) throws IOException {
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		// readLine은 \n을 만날 때까지 읽는다. 반복할 때마다 다음줄의 문자열을 받는다
		// 파일의 저장된 줄수만큼 반복하면 된다. 하지만 저장된 줄수를 알 수 없기에 무한루프에서 반복시키고 끝조건을 활용해 break시킨다
		while(true) {
			String reader = buffer.readLine();
			if(reader == null) break;
			System.out.println(reader);
		}
		// 작업이 완료되었으므로 리소스들 반납. 버퍼부터 먼저 close 시켜야한다. 순서주의※
		buffer.close();
		fileReader.close();
	}
}
