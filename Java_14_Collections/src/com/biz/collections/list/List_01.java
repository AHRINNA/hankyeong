package com.biz.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList;
		strList = new ArrayList<String>();
		
		intList = new LinkedList<Integer>();
		strList = new LinkedList<String>();
		// List로 선언한 객체는 array, linked리스트들로 생성초기화하여 사용할 수 있다
		
		/*					추가/삭제		get(index)조회
		 * ArrayList		달팽이		치타
		 * LinkedList		치타			달팽이
		 * Vector			Multi Threading시 리스트들의 불안정함을 해결하기 위해 쓰인다
		 */

	}

}
