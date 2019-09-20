package com.biz.files.service;

import java.io.PrintWriter;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NameServiceV2 extends NameServiceV1 {
	List<String> korNameList;
	public NameServiceV2() {
		korNameList = new ArrayList<String>();
		
		// collections.sort()나 collections.shuffle()에서 linkedlist가 더 효율적이다
		korNameList = new LinkedList<String>();
	}
	
	@Override
	public void writeNameFile(String korNameFile, int length) throws Exception{
		Random rand = new Random();
		int nameSize = nameList.size();
		int famSize = famList.size();
		System.out.printf("이름표 작성 : %d\n", System.currentTimeMillis());
		for(int i = 0; i < length; i++) {
			String strName = famList.get(rand.nextInt(famSize)).substring(0, 1);
			strName += nameList.get(rand.nextInt(nameSize));
			korNameList.add(strName);
		}
		System.out.printf("이름표 작성 완료 : %d\n", System.currentTimeMillis());
		System.out.printf("List 정렬 : %d\n", System.currentTimeMillis());
		Collections.sort(korNameList);
		System.out.printf("List 정렬완료 : %d\n", System.currentTimeMillis());
		PrintWriter pW = new PrintWriter(korNameFile);
		for(String s : korNameList) {
			pW.println(s);
		}
		pW.close();
		System.out.printf("프로그램 완료 : %d\n", System.currentTimeMillis());
	}
}