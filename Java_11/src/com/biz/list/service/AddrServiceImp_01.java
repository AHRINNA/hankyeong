package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrServiceImp_01 implements AddrService{

	private List<AddrVO> addrList;
	
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		
		addrList = new ArrayList<AddrVO>();
		
		AddrVO aVO = new AddrVO();
		aVO.setStrName("홍길동");
		aVO.setStrTel("02-123-4567");
		aVO.setStrAddr("서울특별시");
		aVO.setStrEmail("a@a.com");
		aVO.setStrHP("010-3417-7477");
		
		addrList.add(aVO);
		
		aVO = new AddrVO();
		aVO.setStrName("이몽룡");
		aVO.setStrTel("063-2123-4567");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("a@b.com");
		aVO.setStrHP("010-3407-7477");
		
		addrList.add(aVO);
		
		aVO = new AddrVO();
		aVO.setStrName("성춘향");
		aVO.setStrTel("063-2133-4567");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("a@c.com");
		aVO.setStrHP("010-3437-7477");
		
		addrList.add(aVO);
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("\t\t주소록");
		System.out.println("이름\t전화\t\t주소\tEMail\t핸드폰");
		System.out.println("----------------------------------------------------");
		
		// 일반 for문
		/* int nSize = addrList.size();
		for(int i = 0; i < nSize; i++) {
			System.out.printf("%s\t", addrList.get(i).getStrName());
			System.out.printf("%s\t", addrList.get(i).getStrTel());
			System.out.printf("%s\t", addrList.get(i).getStrAddr());
			System.out.printf("%s\t", addrList.get(i).getStrEmail());
			System.out.printf("%s\n", addrList.get(i).getStrHP());
			*/
		
		// 확장 for
		for(AddrVO vo : addrList) {
			System.out.printf("%s\t", vo.getStrName());
			System.out.printf("%s\t", vo.getStrTel());
			System.out.printf("%s\t", vo.getStrAddr());
			System.out.printf("%s\t", vo.getStrEmail());
			System.out.printf("%s\n", vo.getStrHP());
			
		}
	}

	@Override
	public void view(int num) {
		if(num > addrList.size() -1) {
			System.out.println("데이터 없음");
			return ; // view() 강제종료
		}
		// TODO Auto-generated method stub
		AddrVO aVO = addrList.get(num);
		System.out.printf("이름 : \n", aVO.getStrName());
		System.out.printf("전화 : \n", aVO.getStrTel());
		System.out.printf("주소 : \n", aVO.getStrAddr());
		System.out.printf("메일 : \n", aVO.getStrEmail());
		System.out.printf("폰 : \n", aVO.getStrHP());
	}
	
}
