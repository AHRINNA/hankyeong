package com.biz.books.exec;

import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.ExcelSaveServiceV1;

public class BookEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookReadServiceV1 bRead = new BookReadServiceV1();
		ExcelSaveServiceV1 bExcel = new ExcelSaveServiceV1();
		
		String bookFile = "src/com/biz/books/도서정보.txt";
		String bookSavePath = "src/com/biz/books/";
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			bExcel.setBookList(bookList);
			bExcel.excelSave(bookSavePath + "도서정보_01");
			
			/*
			 * csv 파일을 열어서 서식을 지정하고 활용하려면
			 * 다른이름으로 저장을 클릭하여 파일 형식을 엑셀 통합문서 .xls로 변환시켜야한다
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
