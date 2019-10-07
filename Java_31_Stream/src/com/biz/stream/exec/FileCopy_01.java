package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class FileCopy_01 {
	public static void main(String[] args) {
		String imgSrcFile = "src/com/biz/stream/[포맷변환]2019 (3).png";
		String imgCopyPath = "src/com/biz/stream/";
		
		// interface와 기능이 비슷한 추상클래스
		InputStream is = null;
		OutputStream os = null;
		Random rand = new Random();
		
		try {
			is = new FileInputStream(imgSrcFile);
			imgCopyPath += Math.abs(rand.nextInt()) + ".png"; // 정수의 절대값을 리턴해주는 math의 메소드
			os = new FileOutputStream(imgCopyPath);
			byte[] bytes = new byte[1024]; // 한번에 파일을 복사할 용량 1kb
			while(true) {
				int length = is.read(bytes);
				if(length < 1) break;
				os.write(bytes);
				// read에 byte 배열을 매개변수로 전달하면 파일에서 읽은 내용을 byte 배열에 담아 전달
				// byte 배열에 담은 데이터 개수를 return
				// read return값이 1 미만이면 파일을 다 읽었다고 판단하고 종료
			}
			System.out.println("File Copy !");
			os.close();
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
