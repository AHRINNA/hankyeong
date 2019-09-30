package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
/*
 * recStrList는 외부에서 주입
 * - 생성한 객체들이 모두 공유하는 리스트. 다른 객체에서 리스트에 변경을 시도하면 모든 객체에서 변경됨
 * myStrList는 자체에서 생성할 리스트
 * - ListRecServiceV2로 객체를 생성하면서 새로 생성하기 때문에 다른 객체의 연산에 영향을 받지 않는다
 * 
 * 공유메모리기법. 객체에서만 가능
 */
public class ListRecServiceV2 {
	private String name;
	private List<String> myStrList;
	private List<String> recStrList;
	
	/*
	 * myStrList : ListServiceV1에서 임의로 생성한 리스트
	 * recStrList : 외부에서 주입되는 리스트
	 */
	public ListRecServiceV2(List<String> recStrList, String name) {
		myStrList = new ArrayList<String>();
		this.recStrList = recStrList;
		this.name = name;
	}
	
	public void remove() {	// myStrList에 recStrList 0번째 요소를 복사한 뒤 삭제
		this.myStrList.add(this.recStrList.get(0));
		this.recStrList.remove(0);
	}
	
	public void viewList() {
		/*
		for(String str : this.recStrList) {
			System.out.println(str + " : " + name);
		}
		*/
		System.out.println("=========================");
		System.out.println(this.name);
		System.out.println("=========================");
		System.out.println(recStrList.toString());
		System.out.println(myStrList.toString());
	}
}