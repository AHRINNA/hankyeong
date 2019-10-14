package com.biz.exam.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.exam.domain.BBsReadService;
import com.biz.exam.domain.BBsVO;
import com.biz.exam.domain.BBsViewService;
import com.biz.exam.service.BBsReadServiceV1;
import com.biz.exam.service.BBsViewServiceV1;

public class BbsEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bbsFile = "src/com/biz/exam/bbs.txt";
		List<BBsVO> bbsList;
		BBsReadService brs = new BBsReadServiceV1();
		BBsViewService bvs = new BBsViewServiceV1();
		Scanner s = new Scanner(System.in);
		try {
			brs.readBBS(bbsFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bbsList = brs.getBBsList(); // export
		bvs.setBBsList(bbsList); // import

		while (true) {
			System.out.println("================================");
			System.out.println("게시판 관리 시스템 v1");
			System.out.println("================================");
			System.out.println("1.전체\t2.제목\t3.날짜\t4.정렬해서보기\t0.종료");
			System.out.print("업무선택 >> ");
			String a = s.nextLine();
			int b = Integer.valueOf(a);
			if (b == 0)
				break;
			else if (b == 1)
				bvs.viewBBS();
			else if (b == 2) {
				String subject;
				System.out.print("검색할 게시물의 제목, 또는 제목 일부를 입력하세요\n입력 >> ");
				subject = s.nextLine();
				bvs.viewBBS(subject);
			} else if (b == 3) {
				int sDate, eDate;
				while (true) {
					System.out.print("검색할 시작날짜를 -없이 입력하세요 >> ");
					sDate = Integer.valueOf(s.nextLine());
					System.out.print("검색할 마지막날짜를 -없이 입력하세요 >> ");
					eDate = Integer.valueOf(s.nextLine());
					if (eDate > sDate)
						break;
					System.out.println("시작날짜는 마지막 날짜보다 빨라야합니다. 다시 입력하세요");
				}
				bvs.viewBBS(sDate, eDate);
			} else if (b == 4) {
				while (true) {
					System.out.println("조회수를 오름차순으로 정렬할까요? y/n(n은 내림차순정렬)");
					String r = s.nextLine();
					if (r.equalsIgnoreCase("y"))
					{
						bvs.viewBBS(true);
						break;
					}
					else if (r.equalsIgnoreCase("n"))
					{
						bvs.viewBBS(false);
						break;
					}
					else
						System.out.println("y랑 n중 정확하게 입력하세요");
				}
			}
		}
		System.out.println("게시판 관리 시스템 종료");
		s.close();
	}

}
