package com.biz.iolist.service;

import com.biz.iolist.model.IolistVO;

/*
 * V2에서 V1을 상속받았다
 */
public class IolistServiceImpV2 extends IolistServiceImpV1 {

	/*
	 * V1에 이미 작성된 list method를 Override(재정의)하였다
	 */
	@Override
	public void list() {
		// TODO Auto-generated method stub
		// super.list();
		System.out.println("======================");
		System.out.println("판매리스트");
		System.out.println("----------------------");
		System.out.println("상품\t단가\t수량\t공급가액\t부가세\t공급대가");
		// 부가세 = 10 / 상품가격. 상품가액 = 가격+부가세
		// VAT 별도금액 = 공급가액
		// VAT = 세액
		// 공급가액+세액 = 공급대가
		for (IolistVO vo : iolist) { // private로 V1에서 선언되면 iolist를 사용할 수 없고
			// public으로 놔두면 외부에서 접근한다. 상속한 클래스에서 사용할 수 있게 protected를 접근제한자로 쓴다
			System.out.print(vo.getStrPname() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%5d\t", vo.getIntQty());

			// 가격에서 1.1로 나눈 값 = 부가세 별도 가격
			int amt = (int) (vo.getIntTotal() / 1.1);
			// 가격 - 부가세 별도 가격 = 부가가치세
			int vat = vo.getIntTotal() - amt;

			System.out.printf("%5d\t", amt);
			System.out.printf("%5d\t", vat);
			System.out.printf("%5d\n", vo.getIntTotal());
		}

	}

}
