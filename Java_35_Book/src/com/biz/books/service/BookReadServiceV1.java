package com.biz.books.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.utils.BookSettings;
/*
 * 도서정보.txt를 읽어 문자열을 :으로 쪼개고 BookVO에 담고 bookList에 추가
 */
public class BookReadServiceV1 {
	private List<BookVO> bookList = new ArrayList<BookVO>();
	
	public List<BookVO> getBookList() {
		return bookList;
	}
	
	public void readBookInfo(String bookFile) throws Exception {
		FileReader fr = new FileReader(bookFile);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		
		int lineNum = 0;
		while(true) {
			System.out.println(++lineNum);
			String str = br.readLine();
			if(str == null) break;
			String strs[] =	str.split(":");
			BookVO vo = new BookVO();
			vo.setB_isbn(strs[BookSettings.FILE.ISBN]);
			vo.setB_comp(strs[BookSettings.FILE.COMP]);
			vo.setB_title(strs[BookSettings.FILE.TITLE]);
			vo.setB_writer(strs[BookSettings.FILE.WRITER]);
			vo.setB_trans(strs[BookSettings.FILE.TRANS]);
			vo.setB_date(strs[BookSettings.FILE.DATE]);
			vo.setB_page(Integer.valueOf(strs[BookSettings.FILE.PAGE]));
			vo.setB_price(Integer.valueOf(strs[BookSettings.FILE.PRICE].trim()));
			bookList.add(vo);
		}
		br.close();
		fr.close();
	}
}
