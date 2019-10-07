package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

import com.biz.stream.domain.BookVO;

public class ListEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String objectSaveFile = "src/com/biz/stream/bookList.dat";
		InputStream is = null;
		ObjectInput obj = null;
		
		// interface와 유사한 추상클래스 선언, null로 초기화
		
		try {
			// 파일을 읽기 상태로 오픈
			
			is = new FileInputStream(objectSaveFile);
			obj = new ObjectInputStream(is);
			// 파일에 저장된 변수를 실제 변수로 환원하기 위한 보조 stream 연결
			List<BookVO> bookList = (List<BookVO>)obj.readObject();
			// 저장된 변수 타입을 그대로 선언하여 지정
			// 다수를 저장했을 때는 저장한 순서대로 환원해야한다
			obj.close();
			for(BookVO bVO : bookList) {
				System.out.print(bVO.title + "\t");
				System.out.print(bVO.comp + "\t");
				System.out.print(bVO.price + "\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
