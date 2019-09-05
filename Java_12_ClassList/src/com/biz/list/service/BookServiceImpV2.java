package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

/*
 * 도서 정보를 입력받아서 리스트에 추가하고 목록, 정보보기
 */

public class BookServiceImpV2 implements BookService {

	Scanner scan; // 입출력을 받기 위해 스캔 선언
	List<BookVO> bookList; // VO클래스를 하나로 묶어서 입력하기 위해 리스트 선언

	public BookServiceImpV2() {
		scan = new Scanner(System.in); // 생성자에서 선언된 스캔 클래스 초기화
		bookList = new ArrayList<BookVO>(); // 하나로 묶은 리스트를 배열 리스트로 초기화

	}

	@Override
	public void input(int count) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) { // count 매개변수만큼 이 클래스에 있는 input() method 실행
			System.out.println((i + 1) + "번째 도서정보입력");
			try {
				this.input();
			} catch (Exception e) {
				System.out.println("데이터를 다시 입력하시오");
				i--;
				continue;
			}
		}

	}

	@Override
	public void input() { // VO클래스를 vo인스턴스로 초기화하여 각각의 값들을 입력받는 메소드
		// TODO Auto-generated method stub
		BookVO vo = new BookVO();
		System.out.print("도서번호 : ");
		vo.setStrNum(scan.nextLine());
		System.out.print("도서명 : ");
		vo.setStrName(scan.nextLine());
		System.out.print("저자 : ");
		vo.setStrWriter(scan.nextLine());
		System.out.print("출판사 : ");
		vo.setStrComp(scan.nextLine());
		System.out.print("가격 : ");
		// 문자열형 숫자를 숫자로 바꾸는 과정에서 예외상황이 많이 발생하므로 예외처리를 추가하려한다
		// 예외 상황이 발생할 코드를 작성, 예외상황이 발생하도록 테스트, 예외처리 시작
		// try~catch문을 작성, 예외가 발생할 코드를 try{~} ~안으로 이동
		// 예외상황을 처리하는 코드를 catch(){~} ~에 입력
		int intPrice = 0;
		try {
			intPrice = Integer.valueOf(scan.nextLine());
		} catch (Exception e) {
			/*
			 * 도서가격을 다시 입력하는 도중 오류가 발생하면 현재 입력중인 도서정보를 다시 입력하도록 코드 작성
			 * 
			 * 작성하는 위의 내용을 다시 가져오기에는 예외처리 코드가 길어진다
			 * 
			 * 값을 입력받고 변환하는 코드가 for문 안에 있다면 for문에서만 continue를 넣으면 조건증감문으로 for문이 돌아가므로 증감을 한번
			 * 빼주고 컨티뉴시키면 다시 입력시킬 수 있으나 for문과 별도로 되어있다면 continue를 사용할 수 없다
			 * 
			 * 메소드에서 exception이 발생했다고 알려주고 처리시킨다 throw는 본 메소드(input)를 호출한 곳으로 예외를 처리해주게 넘긴다
			 * 
			 * 
			 */
			System.out.println("가격은 숫자만 입력하시오");
			throw new NumberFormatException();
		}

		vo.setIntPrice(intPrice);

		System.out.print("출판년도 : ");
		int intYear = 0;
		try {
			vo.setIntYear(Integer.valueOf(scan.nextLine()));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("문자열을 입력했습니다");
			// throw new NumberFormatException();

			/*
			 * 옳은 값이 입력될 때까지 반복시켜주는 반복문 while(true) {
			 * System.out.println("연도를 다시 입력(종료 -1) : "); String s = scan.nextLine(); try {
			 * intYear = Integer.valueOf(s); if(intYear == -1) break; break; } catch
			 * (Exception e2) { // TODO: handle exception } }
			 */
		} // try~catch 예외처리구문을 활용하여 문자열이 잘못 입력되는 상황을 방지
		bookList.add(vo); // vo 인스턴스에 들어있는 내용을 bookList(0)에 입력
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		System.out.println("도서 정보 일람");
		System.out.println("------------------------------------");
		System.out.printf("번호\t도서명\t저자\t출판사\t가격\t출판년도\n");
		System.out.println("------------------------------------");

		/*
		 * int nSize = bookList.size(); // 입력된 항목들이 몇개인지 확인하는 리스트 메소드 for (int i = 0; i
		 * < nSize; i++) { // i번째 있는 리스트의 자료를 가리키기 위해 get method 사용하여 VO에 있는 get 메소드들을
		 * 호출 System.out.print(bookList.get(i).getStrNum() + "\t");
		 * System.out.print(bookList.get(i).getStrName() + "\t");
		 * System.out.print(bookList.get(i).getStrWriter() + "\t");
		 * System.out.print(bookList.get(i).getStrComp() + "\t");
		 * System.out.print(bookList.get(i).getIntPrice() + "\t");
		 * System.out.println(bookList.get(i).getIntYear()); }
		 * 
		 */
		// 확장 for
		for (BookVO vo : bookList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.print(vo.getIntPrice() + "\t");
			System.out.println(vo.getIntYear());
		}
	}

	@Override
	public void view(int i) { // n번째 있는 책의 정보를 출력
		// TODO Auto-generated method stub
		BookVO vo = bookList.get(i - 1); // 단순화, 고효율
		// bookList.get은 표시마다 i의 bookVO를 추출하고 추출된 bookVO의 getter를 호출하며 book.List또한 메모리를
		// 할당받지만 bookVO vo=bookList.get(i)는 bookList i의 bookVO를 추출하여 변수에 저장해두고 getter만
		// 호출한다
		System.out.println(i + "번째에 있는 책 정보");
		System.out.printf("번호\t도서명\t저자\t출판사\t가격\t출판년도\n");
		System.out.println(vo.getStrNum());
		System.out.println(vo.getStrName());
		System.out.println(vo.getStrWriter());
		System.out.println(vo.getStrComp());
		System.out.println(vo.getIntPrice());
		System.out.println(vo.getIntYear());
	}

	@Override
	public void view(String strName) {
		// TODO Auto-generated method stub
		int nCount = bookList.size();
		for (int i = 0; i < nCount; i++) {
			BookVO vo = bookList.get(i);
			String voStrName = vo.getStrName();
			if (voStrName.equalsIgnoreCase(strName)) { // if (bookList.get(i).getStrName().equalsIgnoreCase(strName))를 단순화
				this.view(i);
			}
			// "ABC".contains("B") 문자열 ABC 중에 문자열 B가 포함되어 있는가?
			// 중간문자열 검색. "abc".contains("b")로도 가능
			if(voStrName.toUpperCase().contains(strName.toUpperCase())) {
				this.view(i);
			}
		}
	}

}
