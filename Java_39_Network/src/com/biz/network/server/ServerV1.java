package com.biz.network.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerV1 { // socket making
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8085); // 8085라는 포트(주소)를 가진 socket을 만들었다
		System.out.println("Wait....");
		Socket listen = server.accept();// 클라이언트의 요청이 들어올때까지 기다린다. blocking
		// 요청이 들어오면 listen이라는 객체를 생성한다
		
		
		System.out.println("Connect : " + listen.getInetAddress());
		// 접속한 사람의 ip 보이기
		System.out.println("Port : " + listen.getLocalPort());
		// 접속한 사람의 port 보이기
		
		while(true) {
			// socket으로부터 InputStream 정보값을 수신할 준비 완료  
			InputStream is = listen.getInputStream();
			byte[] msg = new byte[255]; // 255바이트 개의 버퍼 생성. 한번에 255개의 버퍼씩
			int msgSize = is.read(msg); // 버퍼만큼 데이터 수신
			
			String reader = new String(msg, 0, msgSize, "UTF-8");
			// 수신데이터를 UTF-8로 디코딩. NETWORK의 핵심
			// msg를 0번부터 msgSize만큼 읽어들여 UTF-8로 디코딩하라는 문구
			// msg의 데이터가 msgSize만큼 되지 않으면 문제를 고쳐야한다
			// 서버와 클라이언트의 1대1 채팅이며 다수의 사용자를 받아들이려면 thread를 써야한다
			
			System.out.println(" >> " + reader);
			break;
		}
		/*
		OutputStream os = listen.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		*/
	}
}
