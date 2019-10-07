package com.biz.stream.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.biz.stream.domain.BookVO;

public class ListEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String objectSaveFile = "src/com/biz/stream/bookList.dat";
		List<BookVO> bookList = new ArrayList<BookVO>();
		BookVO bVO = new BookVO();
		bVO.title = "Java만세";
		bVO.comp = "영진출판사";
		bVO.price = 5000;
		bookList.add(bVO);
		
		bVO = new BookVO();
		bVO.title = "Oracle";
		bVO.comp = "생문출판사";
		bVO.price = 30000;
		bookList.add(bVO);
		
		bVO = new BookVO();
		bVO.title = "Do it 자바";
		bVO.comp = "이지퍼블";
		bVO.price = 25000;
		bookList.add(bVO);
		
		OutputStream os = null;
		ObjectOutputStream obj = null;
		/*
		 * interface와 유사한 추상클래스를 사용하여 선언한다
		 * 이 때 각 객체는 null로 초기화(clear)
		 */
		
		try {
			// 파일을 기록하기 위한 상태로 open
			os = new FileOutputStream(objectSaveFile);
			obj = new ObjectOutputStream(os);
			// app 내에서 사용되는 변수, 객체 값을 파일로 저장하기 위해 보조 stream 연결
			obj.writeObject(bookList);
			// 자바의 내부변수 bookList 객체를 파일로 기록
			obj.flush();
			obj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
