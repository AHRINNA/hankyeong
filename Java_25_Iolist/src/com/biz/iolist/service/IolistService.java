package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IolistService {
	protected List<String> proList;
	protected List<BuyVO> buyList;
	/*
	 * 상품정보.txt 파일을 읽어서 임의의 상품정보를 추출한 후(readProduct로) 상품매입정보를 생성
	 * 날짜 : 2019-09-26
	 * 단가 : 상품정보의 상품단가에서 부가세(상품단가 - 단가)를 제외한 금액
	 * 부가세 : 상품정보의 상품단가 - 단가
	 * 수량 : 10개부터 100개까지 임의의 수
	 * 합계 : 단가 * 수량
	 * 
	 * 생성된 상품매입정보 20개를 buyList에 추가
	 */
	
	public void buyMake() throws Exception {
		buyList = new ArrayList<BuyVO>();
		String proFileName = "src/com/biz/iolist/과자정보.txt";
		/*
		FileReader fr = new FileReader(proFileName);
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine(); 임의의 상품정보이므로 파일에서 읽어오는게 아니라
		readProduct를 먼저 선행하고 생성된 proList에서 끌어온다 */
		this.readProduct(proFileName);
		Collections.shuffle(proList); // 콜렉션 셔플을 사용해도 되고 random을 생성해도 된다
		// random을 사용하려면 proList.size() 범위 내에서 난수를 생성해야한다
		for(int i = 0; i < 20; i++) {
			String date = "2019-09-26";
			String s[] = proList.get(i).split(":");
			BuyVO bVO = new BuyVO();
			bVO.setProName(s[0]);
			bVO.setPrice((int)(Integer.valueOf(s[1]) / 1.1));
			bVO.setVat(Integer.valueOf(s[1]) - bVO.getPrice());
			bVO.setQty((int) (Math.random() * (100 - 10 + 1) + 10));
			bVO.setTotal(bVO.getQty() * bVO.getPrice());
			bVO.setDate(date);
			buyList.add(bVO);
		}
	}
	
	/*
	 * 과자정보.txt 파일을 읽어서 상품이름:가격 형식의 문자열을 리스트로 생성하는 메소드
	 * -> proList 상품이름:가격   
	 */
	public void readProduct(String proFileName) throws Exception {
		proList = new ArrayList<String>();
		FileReader fr = new FileReader(proFileName);
		BufferedReader br = new BufferedReader(fr);
		String reader = new String();
		while (true) {
			reader = br.readLine();
			if (reader == null)
				break;

			if (reader.length() < 1)
				continue;
			proList.add(reader);
		}
		br.close();
		fr.close();
	}
}
