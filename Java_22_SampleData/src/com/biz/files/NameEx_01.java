package com.biz.files;

import com.biz.files.domain.NameService;
import com.biz.files.service.NameServiceV1;

public class NameEx_01 {

	public static void main(String[] args) {
		/*
		 * 이름리스트.txt, 성씨리스트.txt 파일을 읽어서 리스트를 만들고
		 * 두 리스트의 값들을 임의로 조합하여 세 글자의 사람이름을 생성하고 한국인이름.txt파일로 저장
		 * 
		 * 성씨 한자는 제외하고 한글 1자만 사용
		 * 한국인이름 리스트는 100개를 작성
		 * 
		 * 이름리스트.txt에 나오는 번호와 성씨리스트.txt 번호가 같지 않게
		 * 
		 * Service class를 작성하여 과제를 수행
		 */
		String nameFile = "src/com/biz/files/이름리스트.txt";
		String famFile = "src/com/biz/files/성씨리스트.txt";
		NameService ja = new NameServiceV1();
		try {
			ja.readName(nameFile);
			ja.readFamily(famFile);
			ja.writeNameFile("src/com/biz/files/한국인이름.txt", 50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}