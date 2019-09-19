package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.StudentVO;
import com.biz.grade.util.StudentIDX;

/*
 * List : 순서대로 add, get(index)로 찾음. 순서대로 처리시 강점
 * ArrayList, LinkedList, Vector
 * Map : 순서가 없고, put으로 입력, get(key값)으로 찾음. 무작위로 처리시 강점
 * key, value로 저장하고 key로 임의의 데이터를 읽기 쉽도록 되어있다
 * HashMap, TreeMap으로 생성
 * TreeMap은 자동으로 정렬
 */
public class StudentServiceV1 {
	Map<String, StudentVO> stdList;

	public StudentServiceV1() {
		stdList = new TreeMap<String, StudentVO>();
	}
	
	public Map<String, StudentVO> getStdList(){
		return this.stdList;
	}

	// student.txt 파일을 읽어서 stdList에 데이터 가져오기
	public void read(String stdFileName) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;
		fileReader = new FileReader(stdFileName);
		buffer = new BufferedReader(fileReader);
		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] stds = reader.split(":");
			/*
			 * stds[0] : 학번
			 * stds[1] : 이름
			 * stds[2] : 전화번호
			 * stds[3] : 주소
			 */
			StudentVO stdVO = new StudentVO();
			stdVO.setNum(stds[StudentIDX.NUM]);
			stdVO.setName(stds[StudentIDX.NAME]);
			stdVO.setTel(stds[StudentIDX.TEL]);
			stdVO.setAddr(stds[StudentIDX.ADDR]);
			
			// key는 학번, value는 stdVO로
			stdList.put(stds[StudentIDX.NUM], stdVO);
		}
		buffer.close();
		fileReader.close();
	}
	
	public void list() {
		// map의 key만 추출해서 볼 수 있도록 변환. Map에서 Key만 추출해서 Set으로 자료변환
		Set<String> stdNums = stdList.keySet();
		System.out.println("학생명부");
		System.out.println("=================================");
		System.out.print("학번\t이름\t전화번호\t주소\n");
		System.out.println("---------------------------------");
		
		for(String key : stdNums) {
			// stdList는 StudentVO형 value가 저장되어 있으므로 stdList.get하면 StudentVO형이 return
			StudentVO stdVO = stdList.get(key);
			System.out.print(stdVO.getNum() + "\t");
			System.out.print(stdVO.getName() + "\t");
			System.out.print(stdVO.getTel() + "\t");
			System.out.print(stdVO.getAddr() + "\n");
		}
	}
	
	public StudentVO getStudent(String strNum) {
		return stdList.get(strNum);
	}
}
