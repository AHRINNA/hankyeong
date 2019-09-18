package com.biz.files.grade;

import java.io.IOException;

import com.biz.files.service.FileGradeService;
import com.biz.files.service.FileGradeServiceV2;

public class GradeEx_02 {
	public static void main(String[] args) {
		FileGradeService fg = new FileGradeServiceV2();
		String scoreFile = "src/com/biz/files/score.txt";
		try {
			fg.read(scoreFile);
			fg.total();
			fg.list();
		} catch(NumberFormatException e) {
			System.out.println("데이터 파일을 확인하세요");
			/*
			 * FileGradeService.read() 메소드가 실행되는 중에 문자열형 숫자를 숫자로 바꾸는 과정에서
			 * exception이 발생하면 throw new NumberFormatException으로 exception을 던지고 메인에서 해당 exception에 대해
			 * 다른 exception과 처리를 분리할 수 있다
			 */
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fg.list();
	}
}
