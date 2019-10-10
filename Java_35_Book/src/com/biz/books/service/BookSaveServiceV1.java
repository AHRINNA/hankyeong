package com.biz.books.service;

import java.io.PrintWriter;
import java.util.List;

import com.biz.books.domain.BookVO;

public class BookSaveServiceV1 {
	private List<BookVO> bookList;
	private PrintWriter pw = null;

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	public void print(String saveFile) throws Exception {
		pw = new PrintWriter(saveFile);
		listTitle();
		for (BookVO vo : bookList)
			body(vo);

		pw.close();
	}

	public void print(String saveFile, String text) throws Exception {
		pw = new PrintWriter(saveFile);
		listTitle();
		for (BookVO vo : bookList) {
			if (vo.getB_title().contains(text.trim())) {
				body(vo);
			}
		}
		pw.close();
	}
	
	public void print(String saveFile, int grPrice, int lessPrice) throws Exception {
		pw = new PrintWriter(saveFile);
		listTitle();
		for (BookVO vo : bookList) {
			int price = vo.getB_price();
			if (price >= grPrice && price <= lessPrice) {
				body(vo);
			}
		}
		pw.close();
	}

	private void listTitle() {
		pw.println("도서정보 v1");
		pw.println("=======================================");
		pw.println("ISBN\t도서명\t출판사\t가격");
		pw.println("---------------------------------------");
	}

	private void body(BookVO vo) {
		pw.print(vo.getB_isbn() + "\t");
		pw.print(vo.getB_title() + "\t");
		pw.print(vo.getB_comp() + "\t");
		pw.print(vo.getB_price() + "\n");
	}
}
