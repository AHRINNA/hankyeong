package com.biz.classes;

import com.biz.classes.student.StudentVO;

public class StudentExec_02 {
	public static void main(String[] args) {
		
		StudentVO stVO = new StudentVO();
		
		stVO.strNum = "001";
		stVO.strName = "홍길동";
		stVO.intBirth = 1994;
		stVO.strDept = "법학";
		
		// stVO.view();
		
		//view(연도)를 하면 연도에 따라 나이를 자동 계산해서 보여주면 좋겠다
		stVO.view(2020);
	}
}
