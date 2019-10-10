package com.biz.books.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookVO;
import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookFile = "src/com/biz/books/도서정보.txt";
		BookReadServiceV1 bRead = new BookReadServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		Scanner s = new Scanner(System.in);
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			bView.setBookList(bookList);
			// bView.view();
			// bView.search("책");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("도서검색");
			System.out.println("-----------------------");
			System.out.println("1.제목\t2.가격\t0.종료");
			System.out.println("입력 >> ");
			String strM = s.nextLine();
			int intM = Integer.valueOf(strM);
			if(intM == 0) break;
			if(intM == 1) {
				System.out.print("제목 >> ");
				String strTitle = s.nextLine();
				bView.search(strTitle);
			} else if(intM == 2) {
				System.out.print("최저가격 >> ");
				String sPrice = s.nextLine();
				System.out.print("최고가격 >> ");
				String ePrice = s.nextLine();
				
				try {
					bView.search(Integer.valueOf(sPrice), Integer.valueOf(ePrice));
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("가격은 숫자만 입력");
				}
			}
		}
		System.out.println("업무종료");
	}
}