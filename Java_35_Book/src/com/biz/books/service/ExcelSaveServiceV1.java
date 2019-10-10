package com.biz.books.service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.biz.books.domain.BookVO;

/*
 * text 파일은 자바에서 읽고 쓰기(저장)이 가능
 * 그 외 Binary(이미지, 영상, 음성, 엑셀)들은 기본적으로 읽기는 가능하지만 읽어서 어떠한 처리를
 * 하는 것은 어렵다
 * 
 * 형식에 맞도록 저장하는 것도 매우 어렵다
 * 
 * Binary 파일을 읽고 쓰는데는 3rd Party SDK(Software Developer Kit)를 빌려와서 사용한다
 * 
 * 엑셀 저장하기 기능은 text 파일 저장하기를 조금 응용하여 가능
 */
public class ExcelSaveServiceV1 {
	private List<BookVO> bookList;

	// Comma Separate Values
	// PrintWrtier는 사용불가
	private String excelExt = ".csv";
	int listSize = 10;
	// FileWriter fw;
	BufferedWriter bw;

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	private void bufferOpen(String fileName) throws IOException {
		FileOutputStream fo = new FileOutputStream(fileName + excelExt);
		OutputStreamWriter os = new OutputStreamWriter(fo, "euc-kr"); // 한글 인코딩
		// 엑셀의 한글 인코딩 방식은 euc-kr
		bw = new BufferedWriter(os);
	}

	public void excelSave(String fileName) throws IOException {
		// fw = new FileWriter(fileName + excelExt);
		bufferOpen(fileName);

		listSize = 1;
		// 내용 작성
		title();
		for (BookVO vo : bookList) {
			body(vo);
			listSize++;
		}
		footer();

		bw.flush();
		bw.close();
		// fw.close();
	}

	public void excelSave(String fileName, String text) throws IOException {
		// 텍스트로 검색해서 해당하는 리스트만 저장
		// fw = new FileWriter(fileName + excelExt);
		bufferOpen(fileName);

		listSize = 1;
		// 내용 작성
		title();
		for (BookVO vo : bookList) {
			if (vo.getB_title().contains(text.trim())) {
				body(vo);
				listSize++;
			}
		}
		footer();

		bw.flush();
		bw.close();
		// fw.close();
	}
	
	public void excelSave(String fileName, int grPrice, int lessPrice) throws IOException {
		// 금액으로 검색해서 해당하는 리스트만 저장
		// fw = new FileWriter(fileName + excelExt);
		bufferOpen(fileName);

		listSize = 1;
		// 내용 작성
		title();
		for (BookVO vo : bookList) {
			int price = vo.getB_price();
			if (price >= grPrice && price <= lessPrice) {
				body(vo);
				listSize++;
			}
		}
		footer();

		bw.flush();
		bw.close();
		// fw.close();
	}

	private void title() throws IOException {
		// ISBN, TITLE, COMP, WRITER, DATE, PRICE
		bw.write("ISBM,");
		bw.write("도서명,");
		bw.write("출판사,");
		bw.write("저자,");
		bw.write("발행일,");
		bw.write("가격,");
		bw.newLine(); // 개행문자 입력
		bw.flush();
	}

	private void body(BookVO vo) throws IOException { // 각각의 콤마로 csv의 한 칸으로 구분
		bw.write("'" + vo.getB_isbn() + ",");
		bw.write(vo.getB_title() + ",");
		bw.write(vo.getB_comp() + ",");
		bw.write(vo.getB_writer() + ",");
		bw.write(vo.getB_date() + ",");
		bw.write(vo.getB_price() + ",");
		bw.newLine(); // 개행문자 입력
		bw.flush();
	}

	private void footer() throws IOException {
		// int nSize = bookList.size();

		bw.write("도서개수,");
		bw.write("=COUNTA(B2..B" + listSize + "),"); // 엑셀 계산식을 넣는다
		bw.newLine(); // 개행문자 입력
		bw.flush();
	}
}
