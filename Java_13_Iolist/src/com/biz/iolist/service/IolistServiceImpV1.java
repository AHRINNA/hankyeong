package com.biz.iolist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.iolist.model.IolistVO;

public class IolistServiceImpV1 implements IolistService {

	// List<IolistVO> iolist; // 입력데이터를 저장할 보관소
	// public List<IolistVO> iolist; // public 제한자 : 누구나 접근가능
	// private List<IolistVO> iolist; // private : 현재 클래스만 접근가능
	protected List<IolistVO> iolist; // protected : 

	public IolistServiceImpV1() { // 필요한 인스턴스나 필드를 초기화
		iolist = new ArrayList<IolistVO>();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		IolistVO iolistVO = new IolistVO();
		Random rand = new Random();

		int intH = rand.nextInt(5)+1;
		String str = String.format("일반미 %d호", intH);
		str = String.format("청정미 %d호", intH);
		
		int intHour = rand.nextInt(24) + 1;
		int intMin = rand.nextInt(60);
		int intSec = rand.nextInt(60);
		String strT = String.format("%02d:%02d:%02d", intHour, intMin, intSec);
		
		int intQty = rand.nextInt(30) + 10;

		iolistVO.setStrDate("2019-09-06");
		iolistVO.setStrTime(strT);
		iolistVO.setStrPname(str);
		iolistVO.setIntPrice(intH * 1000);
		iolistVO.setIntQty(intQty);
		
		iolist.add(iolistVO);
	}

	@Override
	public void input(int count) {
		// TODO Auto-generated method stub
		for(int i = 0; i < count; i++) {
			this.input();
		}
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("======================");
		System.out.println("판매리스트");
		System.out.println("---------------------");
		System.out.println("거래일자\t거래시각\t상품명\t단가\t수량");
		System.out.println("---------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrTime() + "\t");
			System.out.print(vo.getStrPname() + "\t");
			System.out.printf("%5d\t" , vo.getIntPrice());
			System.out.printf("%5d\t", vo.getIntQty());
			System.out.printf("%5d\n", vo.getIntTotal());
		}

	}

	/* @Override
	public void view() {
		// TODO Auto-generated method stub

	} */
	// iolist에 저장된 VO들의 total값 계산
	@Override
	public void total() {
		// TODO Auto-generated method stub
		for(int i = 0; i < iolist.size(); i++) {
		// for(IolistVO vo : iolist) {
			// IolistVO vo = iolist.get;
			IolistVO vo = iolist.get(i);
			int total = vo.getIntPrice() * vo.getIntQty();
			vo.setIntTotal(total);
		}
		
		for(IolistVO vo : iolist) {
			int total = vo.getIntPrice() * vo.getIntQty();
			vo.setIntTotal(total);
		} // vo는 iolist 개수만큼 자동 반복. 순서대로 iolistVO를 하나씩 리스트에서 꺼내 주소를 vo에 담아준다
	}

}
