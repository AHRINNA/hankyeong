package com.biz.jack.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

/*
 * 게임에서 사용할 1벌의 게임카드를 생성
 */
public class DeckServiceV1 {
	// 생성된 1벌의 카드를 리스트에 저장
	List<DeckVO> deckList;
	String suit = "다이아몬드◆:하트♥:스페이드♠:클로버♣"; // 분해해서 쓰거나
	String[] arrSuit = new String[] { "다이아몬드◆", "하트♥", "스페이드♠", "클로버♣" };
	// 배열로 쓰거나
	String denomination = "A234567890JQK";

	public DeckServiceV1() {
		deckList = new LinkedList<DeckVO>();
	}

	public List<DeckVO> getDeckList() {
		for (DeckVO vo : deckList) {
			Collections.shuffle(deckList);
		}

		int nSize = deckList.size();
		for (int i = 0; i < nSize; i++) {
			Collections.shuffle(deckList);
		}
		return deckList;
	}

	public void makeDeck() {
		String[] denoms = denomination.split("");
		for (String suit : arrSuit) {
			for (String denom : denoms) {
				// 각 카드가 가지게 될 value 값을 생성. 기준은 denoms
				// 2~9는 그대로, A는 1, JQK는 10
				int intValue = 0;
				try { // 숫자 2~9, 0까지는 정상적으로 int로 변환되지만 AJQK는 exception 발생
						// exception이 발생하면 catch가 실행될텐데 catch를 이용해 변환
					intValue = Integer.valueOf(denom);
					if (intValue == 0)
						intValue = 10;
				} catch (Exception e) {
					// TODO: handle exception
					if (denom.equals("A"))
						intValue = 1;
					else
						intValue = 10;
				}
				DeckVO dVO = new DeckVO();
				dVO.setSuit(suit);
				dVO.setDenomination(denom);
				dVO.setValue(intValue);
				deckList.add(dVO);
			}
		}
	}
}
