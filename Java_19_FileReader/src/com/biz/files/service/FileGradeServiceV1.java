package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.domain.ScoreVO;

public class FileGradeServiceV1 implements FileGradeService {
	List<ScoreVO> scoreList;

	public FileGradeServiceV1() {
		scoreList = new ArrayList<ScoreVO>();
	}

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
				System.out.printf("%s번 학생의 점수 오류\f", strNum);
				break;
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

	@Override
	public void list() {
		System.out.println("성적일람표");
		System.out.println("==============================");
		System.out.printf("학번\t국어\t영어\t수학\n");
		System.out.println("------------------------------");
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getIntKor() + "\t");
			System.out.print(vo.getIntEng() + "\t");
			System.out.print(vo.getIntMath() + "\n");
		}
	}

	@Override
	public void total() {

	}
}
