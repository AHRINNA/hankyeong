package com.biz.books.service;

import java.util.List;

import com.biz.books.domain.BookVO;

public class BookViewServiceV1 {
	List<BookVO> bookList;
	
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	// 도서명으로 검색하여 해당 문자열이 포함된 리스트만 보이기
	public void search(String text) {
		listTitle();
		
		for(BookVO vo : bookList) {
			if(vo.getB_title().contains(text.trim()))
				// contains 문자열이 포함되어 있으면 true, 아니면 false
				body(vo);
		}
		System.out.println("=======================================");
	}
	
	public void search(int startPrice, int endPrice) {
		listTitle();
		
		for(BookVO vo : bookList) {
			int price = vo.getB_price();
			if(price >= startPrice && price <= endPrice)
				// 가격범위를 지정하여 검색
				body(vo);
		}
		System.out.println("=======================================");
	}
	
	private void listTitle() {
		System.out.println("도서정보 v1");
		System.out.println("=======================================");
		System.out.println("ISBN\t도서명\t출판사\t가격");
		System.out.println("---------------------------------------");
	}
	
	private void body(BookVO vo) {
		System.out.print(vo.getB_isbn() + "\t");
		System.out.print(vo.getB_title() + "\t");
		System.out.print(vo.getB_comp() + "\t");
		System.out.print(vo.getB_price() + "\n");
	}
	
	public void view() {
		listTitle();
		for(BookVO vo : bookList) {
			body(vo);
		}
		System.out.println("=======================================");
	}
}
