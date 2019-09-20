package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeServiceV2 extends GradeServiceV1 {

	protected List<String> nameList = null;

	public GradeServiceV2() {
		nameList = new ArrayList<String>();
	}

	// nameFile을 읽어서 nameList 생성
	@Override
	public void readNameFile(String nameFile) throws Exception {
		FileReader fR = null;
		;
		BufferedReader buffer = null;
		fR = new FileReader(nameFile);
		buffer = new BufferedReader(fR);
		String rd = new String();
		while (true) {
			rd = buffer.readLine();
			if (rd == null)
				break;
			nameList.add(rd);
		}
		buffer.close();
		fR.close();
		this.nameList();
	}

	private void nameList() {
		for (String s : nameList) {
			System.out.println(s);
		}
	}

	// nameList에서 length 개수만큼의 리스트 보이기
	// A0001, 이름, 형식으로 List를 console에 보이도록
	
	/*
	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {

		Random rnd = new Random();
		
		PrintWriter fileOut;
		fileOut = new PrintWriter(studentFile);
		
		int num = 0 ;
		for(num = 0; num < length; num++) {
			String strNum = String.format("A%03d",num + 1);

			// 전화번호 임의 생성
			int tel1st = rnd.nextInt(9999) + 1; // 1 ~ 9999 중의 1개의 숫자
			int tel2nd = rnd.nextInt(9999) + 1; // 1 ~ 9999 중의 1개의 숫자
			String strTel = String.format("010-%04d-%04d", tel1st,tel2nd);
			
			// 생년월일 임의 생성(단, 연도 1993으로 고정)
			int intMonth = rnd.nextInt(12) + 1; // 1 ~ 12 중의 1개의 숫자
			int intDay = rnd.nextInt(28) + 1; //  1 ~ 28
			String strBirth = String.format("1993-%02d-%02d",
							intMonth, intDay);
			
			// console에 보이기
			System.out.printf("%s\t%s\t%s\t%s\n",
					strNum,
					nameList.get(num),
					strTel,
					strBirth);
			
			// 파일에 기록하기
			fileOut.printf("%s:%s:%s:%s\n",
					strNum,
					nameList.get(num),
					strTel,
					strBirth);
			fileOut.flush();
			
		}
		fileOut.close();
	}
	*/
	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {
		
		PrintWriter pw = null;
		pw = new PrintWriter(studentFile);
		
		Random rnd = new Random();
		for (int i = 0; i < length; i++) {
			String strNum = String.format("A%04d", i+1);
			int tel1st = rnd.nextInt(9999) + 1;
			int tel2nd = rnd.nextInt(9999) + 1;
			String strTel = String.format("010-%04d-%04d", tel1st, tel2nd);
			int intMonth = rnd.nextInt(12) + 1;
			int intDay = rnd.nextInt(28) + 1;
			int intYear = rnd.nextInt(100) + 1900;
			String strDate = String.format("%4d-%02d-%02d", 1993, intMonth, intDay);
			
			
			System.out.printf("A%04d\t%s\t%s\t%s\n", i + 1, nameList.get(i), strTel, strDate);
			// 콘솔에 보이기와 파일에 기록하는 printwriter
			pw.printf("%s:%s:%s:%s\n", strNum, nameList.get(i), strTel, strDate);
			pw.flush();
		}
		pw.close();
	}
}
