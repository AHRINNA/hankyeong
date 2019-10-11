package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.Getter;

@Getter

public class StudentReadServiceV1 {
	private List<StudentVO> stdList = new ArrayList<StudentVO>();
	/*
	public List<StudentVO> getStdList() {
		return stdList;
	}
	*/
	/*
	 * 파일로부터 학생정보를 읽어서 stdList에 저장
	 */
	public void readStudent(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		while(true) {
			String strs = br.readLine();
			if(strs == null) break;
			String[] str = strs.split(":");
			/* System.out.printf("학번:%s\t이름:%s\t전화번호:%s\t주소:%s\t학년:%3d\t학과:%s",
					str[0], str[1], str[2], str[3], str[4], str[5]);*/
			stdList.add(StudentVO.builder().s_num(str[0]).s_name(str[1]).s_tel(str[2]).s_addr(str[4]).s_grade(Integer.valueOf(str[3])).build());
		}
		br.close();
	}
	
	public List<StudentVO> getStdList() {
		return this.stdList;
	}	
}
