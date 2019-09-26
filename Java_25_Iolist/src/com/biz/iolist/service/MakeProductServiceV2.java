package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MakeProductServiceV2 {
	protected List<String> proNameList;
	protected List<String> productList;

	/*
	 * 과자이름.txt 파일이름을 proFileName 변수로 받기 proFileName을 읽어서 과자이름
	 * List를 추출 임의의 숫자를 발생시켜서 과자가격을 부착하여 과자정보를 생성
	 * 다른곳에서 사용할 수 있도록 return 수행
	 */
	public List<String> getProductList(String proFileName) throws Exception {
		FileReader fr = new FileReader(proFileName);
		BufferedReader br = new BufferedReader(fr);
		String reader = new String();
		
		proNameList = new ArrayList<String>();
		productList = new ArrayList<String>();
		// 생성자가 아니라 메소드 안에서 초기화했음. getProductList 메소드를 불러올때마다 초기화된다는 점 빼곤 차이 없음
		
		while (true) {
			reader = br.readLine();
			if (reader == null)
				break; // if가 트루면 while 중단

			if (reader.length() < 1)
				continue; // if가 true면 이후 코드 무시하고 while 시작부분으로
			proNameList.add(reader);
		}
		br.close();
		fr.close();
		
		/*
		 * 파일을 읽기 위해 file, buffered를 오픈한 후
		 * while 내에서 한 줄씩 읽어서 여러가지 연산을 수행하는 과정에서
		 * 연산수행 시간이 오래 걸리거나
		 * 어떠한 exception이 발생할 확률이 조금이라도 있다면 읽고 있는 파일이 손상될 수 있기 때문에
		 * 읽어들인 문자열(reader)을
		 * List<String> type의 list로 생성을 하고 읽는 것을 close한 후 생성된 list를
		 * 사용하여 다른 연산을 수행하는 것이 바람직하다
		 */

		for (String pro : proNameList) {
			int price = (int) (Math.random() * (5000 - 800 + 1) + 800);
			// 상품가격에서 10원 이하 부분을 제거해보기
			
			// 원 단위 절삭하는 방법들
			// 1의 자리를 빼버리거나
			int one = price % 10;
			price = price - one;
			// int형의 소수점을 날려버리는 것을 이용하는 방법이 있다
			price = (int) (price / 10) * 10;
			
			// 상품가격에 원단위를 반올림하고 10원 단위까지 사용하기. 원단위 사사오입(절상)
			one = price % 10;
			if(one > 4) {
				price = price - one + 10;
			}
			else
				price = price - one;
			//
			price += 5;
			price = (int) ((price / 10) * 10);
			// 소수점 자리수 반올림도 float형과 int형의 형변환을 이용해서 구할 수 있다
			// price = (int)((((float)price) / 10 + 0.5) * 10);
			
			// Math는 수학연산과 관련된 여러 메소드를 가지고 있는 java의 클래스
			String product = String.format("%s:%d", pro, price);
			productList.add(product);
		}
		
		return productList;
	}
}
