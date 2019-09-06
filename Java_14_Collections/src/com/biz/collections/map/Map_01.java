package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 콜렉션 프레임워크의 다른 데이터 구조(List, Set 등)와 형식이 다르다
		 * List, Set은 한가지 타입만을 List로 포함하는 구조
		 * Map은 2가지 타입의 자료를 한묶음의 List로 포함하며 Key, Value라는 구조를 가짐
		 */
		Map<String, String> strMap = new HashMap<String, String>();
		strMap.put("1", "홍길동");
		strMap.put("3", "성춘향");
		strMap.put("2", "이몽룡");
		strMap.put("5", "장길산");
		strMap.put("9", "임꺽정");
		
		System.out.println(strMap.get("9"));
		
	}

}
