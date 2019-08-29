package com.biz.classes.book;

public class BookVO {

	/* 도서 정보에는 도서명, 출판사, 저자, 가격 => 멤버 변수
	 * 필요한 메소드 : 도서의 개별 정보, 도서 리스트
	 * 
	 * ~~VO
	 * Value Object
	 * 정보처리를 할 때 기본적인 데이터(멤버 변수)의 묶음을 처리할 때 사용하는 클래스
	 */
	
	public String bookName;
	public String bookPu;
	public String bookWri;
	public int bookPrice;
	private static int bookNum = 1;
	
	public void bookInfo() {
		System.out.printf("%s,\t%s,\t%s,\t%d\n", bookName, bookPu, bookWri, bookPrice);
	}
	
	public void bookList() {
		System.out.printf("%d,\t%s,\t%s,\t%s\n", bookNum, bookName, bookPu, bookWri);
		bookNum++;
	}
	
}
