package com.biz.books.exec;

import com.biz.books.service.BookReadServiceV1;

public class BookEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookFile = "src/com/biz/books/도서정보.txt";
		BookReadServiceV1 bs = new BookReadServiceV1();
		try {
			bs.readBookInfo(bookFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
