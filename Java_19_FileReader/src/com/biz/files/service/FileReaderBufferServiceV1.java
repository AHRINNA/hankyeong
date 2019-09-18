package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader는 OS, JVM, App 사이에서 데이터를 이동하며 읽는동안 프로세스가 집중되어 비효율적이고
 * 다른 곳에서의 접근을 막아 위험을 내포한다(하드웨어에 가까운 c언어는 filereader만으로 리드)
 * 고급 프로그래밍 기법으로 파일에 직접 접근하여 하나하나 읽어내는 대신 완충을 두어
 * 안전하게 파일을 읽을 수 있게 한다. Java에서의 가장 기본적인 완충도구는 BufferedReader 클래스이다
 * FileReader >> BufferedReader를 사용
 */
public class FileReaderBufferServiceV1 {
	FileReader fileReader;
	BufferedReader buffer;

	public void read(String fileName) throws IOException {
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		// fileReader 객체에 담긴 파일정보를 buffer에 주입해서 메모리에 보관중

		buffer.readLine();
		// buffer에서 \n를 만날 때까지 받는다
	}
}
