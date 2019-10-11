package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		StudentVO stdVO = new StudentVO();
		
		// setter를 이용한 값 넣기. Java Beans Pattern : 고전 패턴
		stdVO.setNum("001");
		stdVO.setName("홍길동");
		stdVO.setTel("010-111");
		stdVO.setAddr("서울특별시");
		stdVO.setGrade(3);
		stdList.add(stdVO);
		
		
		// 생성자를 이용하면 생성자의 순서를 알고 있어야한다
		
		stdVO = new StudentVO("003", "성춘향", "010-222", "남원시", 3, "005");
		// 변수 객체 생성자를 이용한 값 넣기
		stdList.add(stdVO);
		
		// 변수 객체를 만들지 않고 add에 직접 생성자를 작성해서 값 넣기
		stdList.add(new StudentVO("004", "임꺽정", "010-333", "남원시", 3, "005"));
		
		/* 생성자를 이용하는 객체생성
		 * 생성자 매개변수의 순서를 명확히 인지하고 있어야 오류가 없는 값을 추가할 수 있다
		 * 지금 당장 추가하지 않아도 될 필드값도, 의무적으로 추가해야한다 
		 */
	}

}
