package com.biz.jack.exec;

import java.util.List;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.service.DeckServiceV1;

public class JackEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckServiceV1 ds = new DeckServiceV1();
		ds.makeDeck();
		ds.getDeckList();
		List<DeckVO> deckList = ds.getDeckList();
		for(DeckVO v : deckList)
			System.out.println(v);
	}

}
