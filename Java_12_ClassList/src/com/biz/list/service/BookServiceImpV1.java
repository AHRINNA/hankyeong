package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

public class BookServiceImpV1 implements BookService {

	Scanner scan;
	List<BookVO> bookList; // 입력받은 도서정보를 저장할 리스트 선언

	public BookServiceImpV1() { // scan과 bookList 초기화
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}

	// service.input(30); 30개의 데이터를 입력
	public void input(int count) {
		for (int i = 0; i < count; i++) {
			this.input();
		}
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("도서번호 : ");
		String strNum = scan.nextLine();
		System.out.print("도서이름 : ");
		String strName = scan.nextLine();
		System.out.print("저자 : ");
		String strWriter = scan.nextLine();
		System.out.print("출판사 : ");
		String strComp = scan.nextLine();
		/*
		 * 사용자가 데이터를 입력하는 중에 가격이나 출판년도를 숫자가 아닌 문자열을 입력하게 되면 문자열을 숫자로 바꾸는 과정에서
		 * NumberFormatException이 발생할 수있다. 이 앱에서 저 오류가 뜰 확률이 높다 사용자가 입력하는 과정에서 실수를 하게 되면
		 * 그동안 입력했던 모든 데이터를 날려버린다 개발자 입장에서 좋은 코드를 작성하기 위해 발생할 수 있는 exception을 예측하고 적절한
		 * 해결방안을 만들어야한다 = exception handling이라고 한다
		 * 
		 * int형에 문자열이 포함되어 있으면 안내 메시지를 띄우고 다음 값을 입력하도록 유도한다
		 * 
		 * try cntl+space. try 안에 exception 오류가 발생할 수 있는 코드를 넣고 catch 안에 오류가 발생시 넣을 코드
		 */
		System.out.print("가격 : ");
		int intPrice = 0;

		try {
			intPrice = Integer.valueOf(scan.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("가격에 문자열이 포함되었으므로 현재 정보는 추가하지 않음");
			return;
		}
		System.out.print("출판년도 : ");
		int intYear;

		/*
		 * 예외처리. 사용자가 데이터를 입력하거나 어떤 연산을 수행할 때 Runtime Error가 발생할 확률이 있다면 사용자에게 스트레스를 줄 수
		 * 있다
		 * 
		 * 개발자는 그런 상황을 만들지 않기 위해 예측할 수 있는 예외가 발생할 코드에서 try-catch로 예외처리를 해주어야한다 예외처리는 개발의
		 * 필수 항목으로 여기자
		 */
		/*
		 * 예외가 예측되는 코드는 try{}안에 작성 예외가 발생시 처리할 코드는 catch{}안에 작성
		 */
		try {
			intYear = Integer.valueOf(scan.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("가격에 문자열이 포함되었으므로 현재 정보는 추가하지 않음");
			return;
		}

		BookVO bVO = new BookVO();
		// VO를 이용해 클래스를 선언하고 초기화한 다음 입력값을 할당
		bVO.setStrNum(strNum);
		bVO.setStrName(strName);
		bVO.setStrComp(strComp);
		bVO.setStrWriter(strWriter);
		bVO.setIntPrice(intPrice);
		bVO.setIntYear(intYear);

		// 생성한 리스트에 입력값 추가
		bookList.add(bVO);
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("도서 정보 일람표");
		System.out.println("------------------------------------");
		System.out.println("ISBN\t도서명\t출판사\t저자\t가격\t출판년도");
		System.out.println("------------------------------------");
		int nSize = bookList.size();
		for (int i = 0; i < nSize; i++) {
			BookVO vo = bookList.get(i);
			System.out.println(vo.getStrNum() + "\t");
			System.out.println(vo.getStrName() + "\t");
			System.out.println(vo.getStrComp() + "\t");
			System.out.println(vo.getStrWriter() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%5d\n", vo.getIntYear());
		}
	}

	@Override
	public void view(int index) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------");
		System.out.println("ISBN : " + bookList.get(index).getStrNum());
		System.out.println("도서명 : " + bookList.get(index).getStrName());
		System.out.println("출판사 : " + bookList.get(index).getStrComp());
		System.out.println("저자 : " + bookList.get(index).getStrWriter());
		System.out.println("가격 : " + bookList.get(index).getIntPrice());
		System.out.println("출판년도 : " + bookList.get(index).getIntYear());
	}

	@Override
	public void view(String strName) {
		// TODO Auto-generated method stub
		int nSize = bookList.size();
		for (int i = 0; i < nSize; i++) {
			if (bookList.get(i).getStrName().equalsIgnoreCase(strName)) {
				this.view(i);
			}
			break; // 앞에서부터 먼저 발견한 1개만 확인하고 종료. 중복되는 strName이 있어도 패스
		}
	}

}
