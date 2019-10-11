package com.biz.lombok.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentVO sVO = new StudentVO();
		sVO.setS_num("001");
		sVO.setS_name("홍길동");
		sVO.setS_tel("010");
		sVO.toString();
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		// lombok build pattern
		stdList.add(StudentVO.builder().s_num("001").build());
		stdList.add(StudentVO.builder().s_num("001").s_name("홍길동").build());
		stdList.add(StudentVO.builder().s_num("001").s_name("홍길동").s_addr("우리집").build());
	}

}
