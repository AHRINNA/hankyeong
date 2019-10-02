package com.biz.jack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

public class PlayerServiceV1 {

	List<DeckVO> myDeckList;// 각 플레이어(딜러 포함)가 받은 카드를 저장할 리스트
	List<DeckVO> publicDeckList;// deck에서 한장씩 플레이어에게 전달할 카드
	String playerName;
	
	public PlayerServiceV1(List<DeckVO> deckList) {
		this(deckList, "딜러");
	}// 플레이어 이름을 인자로 전달받지 않으면 딜러 생성
	
	public PlayerServiceV1(List<DeckVO> deckList, String playerName) {
		publicDeckList = deckList;
		myDeckList = new ArrayList<DeckVO>();
		this.playerName = playerName;
	}
	
	// 자신이 받은 카드의 점수를 계산
	public int sumValue() {
		int sumValue = 0;
		for(DeckVO v : myDeckList) {
			sumValue += v.getValue();
		}
		return sumValue;
	}
	
	// 각 player들이 hit했을 때 수행
	public void hit() {
		
		if(playerName.equals("딜러") && this.sumValue() > 16) {
			System.out.println("딜러점수:" + this.sumValue());
			System.out.println("딜러 Hit 금지");
		} else {
			myDeckList.add(publicDeckList.get(0));
			publicDeckList.remove(0);
		}

		System.out.println("================");
		System.out.println(playerName);
		System.out.println("----------------");
		for(DeckVO vo : myDeckList) {
			System.out.println(vo); // 현재 보유중인 카드리스트를 보여주기
		}
		System.out.println("----------------");
		System.out.println("현재 점수 : " + this.sumValue());
	}
}
