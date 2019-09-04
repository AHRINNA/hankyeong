/**
 * List Interface의 활용. ArrList, LinkedList는 List interface를 설계도로 하여 작성되었다
 * 
 */

package com.biz.list.array;

import java.util.LinkedList;
import java.util.List;

public class List_06 {
	public static void main(String[] args) {

		// List<Integer> nms = new ArrayList<Integer>();
		List<Integer> nms = new LinkedList<Integer>();
		
		
		// ArrayList의 기능을 활용하여 연산을 수행
		nms.add(100);
		nms.add(100);
		nms.add(100);
		int nm = nms.get(0) + nms.get(1) + nms.get(2);

		
	}
}
