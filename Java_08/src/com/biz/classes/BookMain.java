package com.biz.classes;

import com.biz.classes.book.Book;

public class BookMain {
	public static void main(String[] args) {

		Book book1 = new Book();
		book1.bookName = "Justice";
		book1.bookPu = "ab";
		book1.bookWri = "Micheal Sandel";
		book1.bookPrice = 15000;
		
		Book book2 = new Book();
		book2.bookName = "500년 역사";
		book2.bookPu = "ab";
		book2.bookWri = "김명";
		book2.bookPrice = 10000;

		System.out.printf("책의 정보입니다\n-------------------\n");
		System.out.println("책,\t출판사,\t저자,\t가격");
		book1.bookInfo();
		book2.bookInfo();

		System.out.println("책의 리스트입니다\n-------------------\n");
		System.out.println("번호,\t책,\t출판사\t,저자");
		book1.bookList();
		book2.bookList();
	}
}
