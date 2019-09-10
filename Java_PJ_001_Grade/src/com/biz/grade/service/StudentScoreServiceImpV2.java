package com.biz.grade.service;

import java.util.Collections;
import java.util.Comparator;

import com.biz.grade.model.StudentScoreVO;

public class StudentScoreServiceImpV2 extends StudentScoreServiceImpV1 implements StudentScoreService {

	// method 내의 익명클래스를 이용한 보조연산. list를 sort시키면 비교할 기준을 찾지 못한다
	// sort(list, 어떠한 정수값) 정수값에 클래스를 이용해서 클래스값을 넘기고
	// 해당 클래스의 인스턴스를 이용해 return에 필요한 값을 집어넣는다
	// return이 1이면 a>b(ASC)로 정렬하고 -1이면 a<b(DESC)으로 정렬한다
	public void rank() {
		Collections.sort(studentScore, new Comparator<StudentScoreVO>() {

			@Override
			public int compare(StudentScoreVO o1, StudentScoreVO o2) {
				// TODO Auto-generated method stub
				return o2.getIntTotal() - o1.getIntTotal();
			}

		});
		int rank = 1;
		for (StudentScoreVO vo : studentScore) {
			vo.setIntRank(rank++);
		}

		Collections.sort(studentScore, new Comparator<StudentScoreVO>() {

			@Override
			public int compare(StudentScoreVO o1, StudentScoreVO o2) {
				// TODO Auto-generated method stub
				// return Integer.valueOf(o1.getStrNum()) - Integer.valueOf(o2.getStrNum());
				// 학번 String을 정수로 변경하여 return값을 날릴 경우
				return o1.getStrNum().compareTo(o2.getStrNum());
				// compareTo는 "a".compareTo("b")에서 문자열 a 값과 문자열 b값을 비교하여 정수를 return
				// D와 A가 비교되면 3, A와 F가 비교되면 -5
			}
		});
	}
}
