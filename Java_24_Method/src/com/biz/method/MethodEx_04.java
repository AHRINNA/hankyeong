package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;

public class MethodEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeListService ms = new MakeListService();
		/*
		 * MakeListService 클래스의 getListAll을 호출해서 무엇인가를 수행
		 * 무엇인진 알 수 없어도 아무튼 호출함
		 */
		ms.getListAll();
		
		// eclipse의 assist 기능을 활용하여 ms.g(점 연산자) 라고 입력하면
		// getListAll() 가 정의된 형태를 볼 수 있다
		// ms.getListAll() : List<Integer> - MakeListService 라는 형태
		// 이 정보를 바탕으로 getListAll이 List<Integer> type의 데이터를 return해주도록
		// 디자인(설계, 작성)되었음을 알 수 있다
		// List<Integer> 타입의 aList 변수를 선언하고 = ms.getListAll 형태로 호출하여
		// getListAll 메소드가 return하는 값을 aList 변수에 저장하도록 코드를 완성함
		
		List<Integer> aList = ms.getListAll();
	}
}