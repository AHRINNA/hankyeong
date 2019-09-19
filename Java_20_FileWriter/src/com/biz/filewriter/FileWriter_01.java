package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/* txt파일을 생성해서
 * 내용을 기록
 */
public class FileWriter_01 {
	public static void main(String[] args) {
		String fileName = "src/com/biz/filewriter/data.txt";
		
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.write("대한민국만세");
			fileWriter.write(97); // char형 코드. ASCII
			for(int i = 97; i < 124; i++) {
				fileWriter.write(i);
			}
			fileWriter.write(13); // 개행문자 \n과 같은 ASCII
			for(int i = 'A'; i <= 'Z'; i++) { // char는 실제 문자 ASCII 코드값의 int형과 유사하기 때문에 int문으로 코드 작성 가능
				fileWriter.write(i);
			}
			fileWriter.close();
			// 반드시 close. 기록할 때 write 메소드는 직접 파일을 기록하지만
			// JVM이 기억장치 어딘가 임시로 모아두는데 close를 하지 않으면 데이터는 사라져버린다
			// close하여 JVM에서 OS로 데이터를 전달하여야 기록된다
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
