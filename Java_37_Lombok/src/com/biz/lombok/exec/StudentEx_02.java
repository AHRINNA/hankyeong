package com.biz.lombok.exec;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceABS;
import com.biz.lombok.service.StudentViewServiceV1;
/*
 * 학생정보.txt를 읽어서 리스트를 콘솔에 보이기
 * 이름을 입력받아 해당하는 학생 리스트를 콘솔에
 * 학년을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 학년 범위를 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 */
public class StudentEx_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		String fileName = "src/com/biz/lombok/학생정보.txt";
		try {
			sRead.readStudent(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 경로지정이 잘못되었습니다");
		}
		List<StudentVO> svo;
		svo = sRead.getStdList();
		StudentViewServiceABS sView = new StudentViewServiceV1();
		sView.setStdList(svo);
		
		while(true) {
			System.out.println("1.학생리스트\t2.이름으로검색\t3.학년검색\t4.학년범위로검색\t0.종료");
			System.out.print("작업입력 >> ");
			String strM = s.nextLine();
			int intM = Integer.valueOf(strM);
			if(intM == 1)
				sView.view();
			if(intM == 2)
			{
				System.out.print("검색할 이름을 입력하세요 >> ");
				String name = s.nextLine();
				sView.view(name);
			}
			if(intM == 3)
			{
				System.out.print("검색할 학년을 입력하세요 >> ");
				String e = s.nextLine();
				int grade = Integer.valueOf(e);
				sView.view(grade);
			}
			if(intM == 4)
			{
				System.out.print("검색할 시작 학년 입력 >> ");
				String e = s.nextLine();
				int grGrade = Integer.valueOf(e);
				System.out.print("검색할 최종 학년 입력 >> ");
				String r = s.nextLine();
				int lessGrade = Integer.valueOf(r);
				sView.view(grGrade, lessGrade);
			}
			if(intM == 0)
				break;
		}
		System.out.println("학생리스트 보기를 종료합니다");		
		s.close();
		
	}

}
