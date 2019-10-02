package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

// 1명의 급여액에 대한 화폐매수 계산하고 결과를 리스트에 할당
public class PaperMakeServiceV1 {

	List<PaperVO> paperList;
	
	// paperList를 날려주는 메소드
	public List<PaperVO> getPaperList(){
		return paperList;
	}

	// 외부에서 매개변수로 급여액을 받고 화폐매수를 계산한 다음 리스트에 할당
	public void make(int pay) {
		paperList = new ArrayList<PaperVO>();
		int paper = 50000; // 대한민국 화폐 중 가장 큰 단위
		int sw = 1;
		// 화폐매수계산을 수행
		while (true) {
			if(pay < 5) break;
			int paperCount = (int) (pay / paper); // 화폐단위에 대한 화폐 매수
			// paperCount = (int) (pay / paper);

			PaperVO pVO = new PaperVO(); // PaperVO에 값 담기
			pVO.setCount(paperCount);
			pVO.setPaper(paper + ""); // String형 PaperVO에 있는 Paper에 넣기 위해 문자열로 형변환
			paperList.add(pVO); // paperList에 값 넣기
			pay -= (paperCount * paper);
			
			// 5만, 1만, 5천, 1천 ..... 순으로 화폐단위를 계산하고 액면가에 대한 매수를 계산해야
			// 하므로 5 -> 1이 되도록 계산 수행
			if(sw > 0) paper /= 5;
			else paper /= 2;
			sw *= (-1);
		}
	}
}
