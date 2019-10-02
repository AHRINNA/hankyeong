package com.biz.jack.service;

import java.util.List;
import java.util.Scanner;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.utils.BlackjackUtils;

public class GameServiceV1 {
	DeckServiceV1 ds;
	List<DeckVO> deckList;
	Scanner s;

	public GameServiceV1() {
		// TODO Auto-generated constructor stub
		ds = new DeckServiceV1();
		ds.makeDeck();
		deckList = ds.getDeckList();
		// 게임을 시작하기 위한 1벌의 카드를 만들고 리스트에 저장

		s = new Scanner(System.in);
	}

	public boolean gameStart(String playerName) {
		System.out.println(BlackjackUtils.getStringLong("=", 70));
		System.out.println("Game Start!");
		System.out.println(BlackjackUtils.getStringLong("=", 70));

		PlayerServiceV1 딜러 = new PlayerServiceV1(deckList);
		PlayerServiceV1 선수 = new PlayerServiceV1(deckList, playerName);

		for (int i = 0; i < 2; i++) {
			딜러.hit();
			선수.hit();
		}

		// 딜러의 점수가 16점 이하면 의무적으로 히트
		딜러.hit();

		while (true) {

			if(선수.sumValue() > 21) {
				System.out.println("딜러 승리!");
				
			}
			if(딜러.sumValue() > 21) {
				System.out.println(playerName + " 승리!");
			}
			if(선수.sumValue() > 21 || 딜러.sumValue() > 21) {
				System.out.println("Press Any Key");
				s.nextLine();
				return true;
			}
			// if (선수.sumValue() > 21)
			// break;
			System.out.println(BlackjackUtils.getStringLong("-", 30));
			System.out.println("1.Hit 2.Stand 3.게임종료");
			System.out.println(BlackjackUtils.getStringLong("-", 30));
			System.out.print("선택 >> ");
			String strM = s.nextLine();
			int intM = Integer.valueOf(strM);

			if (intM == 1) {
				선수.hit();
				딜러.hit();
			} else {
				if (선수.sumValue() == 딜러.sumValue()) {
					System.out.println("동점으로 딜러 승리!");
				} else if (선수.sumValue() > 딜러.sumValue()) {
					System.out.println(playerName + " 승리!");
				} else {
					System.out.println("딜러 승리!");
				}
				System.out.println(BlackjackUtils.getStringLong("*", 100));
				System.out.println("딜러 점수 : " + 딜러.sumValue());
				System.out.println(playerName + " 점수 : " + 선수.sumValue());
				System.out.println(BlackjackUtils.getStringLong("*", 100));
				if(intM == 2) return true;
				else if(intM == 3) return false;
			}
		}
	}
}
