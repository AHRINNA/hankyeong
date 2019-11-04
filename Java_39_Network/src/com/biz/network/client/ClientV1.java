package com.biz.network.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// 192.168.123.70 커맨드창 ipconfig IPv4 address
public class ClientV1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String serverIP = "192.168.123.45"; // 본인 pc ip말고 접속하고자하는 선생님 ip
		int port = 8085;
		Socket sendSocket = new Socket(serverIP, port);
		
		System.out.println("Client Start");
		// sendSocket.connect(new InetSocketAddress(port));
		
		while(true) {
			System.out.print(">> ");
			String strSend = s.nextLine();
			byte[] msg = strSend.getBytes("UTF-8");
			// 키보드로 입력한 한글처리를 위한 인코딩을 지정하고 byte 배열로 변환
			// socket을 통해서 문자열을 전송하기 위한 준비
			OutputStream os = sendSocket.getOutputStream();
			os.write(msg);
		}
		
	}
}
