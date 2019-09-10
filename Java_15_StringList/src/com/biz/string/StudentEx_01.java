package com.biz.string;

import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceImpV1;

public class StudentEx_01 {

	public static void main(String[] args) {
		StringService stSV = new StudentServiceImpV1();
		stSV.input();
		stSV.list();
		((StudentServiceImpV1)stSV).search("00001"); // 위에 선언된 인터페이스에 정의되지 않은 search()메소드를 쓰기 위해
		// 일시적 클래스 형변환
	}

}
