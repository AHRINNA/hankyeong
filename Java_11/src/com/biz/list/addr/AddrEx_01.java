package com.biz.list.addr;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<AddrVO> addrList = new ArrayList<AddrVO>();
		
		
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

}
