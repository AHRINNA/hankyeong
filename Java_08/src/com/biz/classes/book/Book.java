package com.biz.classes.book;

public class Book {

	/* 도서 정보에는 도서명, 출판사, 저자, 가격 => 멤버 변수
	 * 필요한 메소드 : 도서의 개별 정보, 도서 리스트
	 */
	
	public String bookName;
	public String bookPu;
	public String bookWri;
	public int bookPrice;
	private static int bookNum = 1;
	
	// 데이터를 처리하는 과정에서 각 멤버변수에 값을 저장하고 처리하는데 어떤 문제가 발생했을 경우 멤버 변수의 값을 확인하는 용도 method
	public void view() {
		System.out.printf("도서명: %s\n출판사 : %s\n저자 :%s\n가격 :%d\n", bookName, bookPu, bookWri, bookPrice);
	}
	public void bookInfo() {
		System.out.printf("%s,\t%s,\t%s,\t%d\n", bookName, bookPu, bookWri, bookPrice);
	}
	
	// 여러 도서 정보 리스트를 확인할 때 사용할 메소드
	public void bookList() {
		System.out.printf("%d,\t%s,\t%s,\t%s\n", bookNum, bookName, bookPu, bookWri);
		bookNum++;
	}
	
}
