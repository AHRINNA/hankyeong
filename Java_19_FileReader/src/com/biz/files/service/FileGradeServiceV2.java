package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.biz.files.domain.ScoreVO;

public class FileGradeServiceV2 extends FileGradeServiceV1 {

	@Override
	public void read(String fileName) throws IOException {
		FileReader fileReader;
		BufferedReader buffer;
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		String reader = new String(); // 문자열 변수를 초기화
		while (reader != null) {
			reader = buffer.readLine();
			if (reader == null)
				break;
			String[] scores = reader.split(":"); // :을 기준으로 문자열을 해체
			String strNum = scores[0];
			int intKor = Integer.valueOf(scores[1]);
			int intEng = Integer.valueOf(scores[2]);
			int intMath = Integer.valueOf(scores[3]);
			try {
				intKor = Integer.valueOf(scores[1]);
				intEng = Integer.valueOf(scores[2]);
				intMath = Integer.valueOf(scores[3]);
			} catch (Exception e) {
				/*
				 * System.out.printf("%s번 학생의 점수 오류\f", strNum); break;
				 */
				throw new NumberFormatException(); // 어떤 exception이 발생했는지 구체적으로 호출한 곳에 알려줌
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setStrNum(strNum);
			scoreVO.setIntKor(intKor);
			scoreVO.setIntEng(intEng);
			scoreVO.setIntMath(intMath);

			scoreList.add(scoreVO);
		}
		buffer.close();
		fileReader.close();
	}
	
	@Override // 자바 1.5 이후엔 선택적으로 사용할 수 있다
	public void total() {
		for(ScoreVO vo : scoreList) {
			int intTotal = vo.getIntKor() + vo.getIntEng() + vo.getIntMath();
			vo.setIntTotal(intTotal);
			vo.setIntAvg(intTotal / 3);
		}
	}
	
	public void list() {
		System.out.println("성적표");
		System.out.println("================================================");
		System.out.print("학번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("------------------------------------------------");
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.printf("%d\t%d\t%d\t", vo.getIntKor(), vo.getIntEng(), vo.getIntMath());
			System.out.print(vo.getIntTotal() + "\t");
			System.out.print(vo.getIntAvg() + "\n");
		}
	}
}
