package com.biz.grade;

import com.biz.grade.domain.StudentVO;
import com.biz.grade.service.StudentServiceV1;

public class StudentEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentServiceV1 ss = new StudentServiceV1();
		String stdFileName = "src/com/biz/grade/학생명부.txt";
		try {
			ss.read(stdFileName);
			StudentVO stdVO = ss.getStudent("A001");
			if(stdVO != null) {
				System.out.println(stdVO.toString());
			}
			// ss 인스턴스의 getStudent() 메소드를 실행한 결과(stdVO)에 toString()을 실행
			// 클래스의 chaining 코딩
			System.out.println(ss.getStudent("A002").toString());
			System.out.println(ss.getStudent("A010").toString());
			// stdVO = ss.getStudent("A010"); stdVO.toString();을 한줄로 chaining
			
			stdVO = ss.getStudent("A020");
			
			// 해당 key값에 data가 없으면 null값이 입력되어
			// exception이 발생할 수 있기 때문에 미리 검사하여 예외처리
			if(stdVO != null) {
				System.out.println(stdVO.toString());
			}
			else {
				System.out.println("A020은 없음");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ss.list();
	}
}