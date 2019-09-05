package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.IolistVO;

public class IolistServiceImp {
	List<IolistVO> iolist;

	public IolistServiceImp() {
		iolist = new ArrayList<IolistVO>();
	}

	public void input() {
		IolistVO iolistVO;
		iolistVO = new IolistVO("2019-09-05", "14:00:01", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		iolistVO = new IolistVO("2019-09-05", "14:00:02", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		iolistVO = new IolistVO("2019-09-05", "14:00:03", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		iolistVO = new IolistVO("2019-09-05", "14:00:04", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		iolistVO = new IolistVO("2019-09-05", "14:00:05", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		/*
		 * iolistVO.setStrDate("2019-09-05"); iolistVO.setStrTime("14:00:01");
		 * iolistVO.setStrProductName("CJ 햇반"); iolistVO.setIntPrice(1500);
		 */
	}

	public void input(int count) {

		IolistVO iolistVO;
		Random rnd = new Random();

		for (int i = 0; i < count; i++) {
			int intH = rnd.nextInt(5) + 1;
			String strTime = String.format("14:00:%02d", i);
			String strPName = String.format("일반미 %d호", intH);

			int intQty = rnd.nextInt(30) + 10;

			iolistVO = new IolistVO("2019-09-05", strTime, strPName, 1000 * intH, intQty);
			iolist.add(iolistVO);
		}

	}

	
	public void total() {
		/*
		 * 확장for에서 setter가 제대로 되지 않는다면 for를 사용해야한다
		 */
		for(IolistVO vo : iolist) {
			int total = vo.getIntPrice() * vo.getIntQuantity();
			vo.setTotal(total);
		}
	}
	public void list() {
		System.out.println("거래내역");
		System.out.println("----------------------");
		System.out.println("일자\t시각\t상품명\t단가\t수량\t합계");
		for (IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrTime() + "\t");
			System.out.print(vo.getStrProductName() + "\t");
			System.out.print(vo.getIntPrice() + "\t");
			System.out.print(vo.getIntQuantity() + "\t");
			System.out.println(vo.getTotal());
		}
		System.out.println("----------------------");
		System.out.println("내역종료");
	}
}
