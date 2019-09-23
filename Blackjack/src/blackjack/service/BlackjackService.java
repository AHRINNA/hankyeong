package blackjack.service;

import java.io.IOException;
import java.util.List;

import blackjack.model.DeckVO;

// 블랙잭 내부 모듈
public interface BlackjackService {
	public void initDraw() throws IOException;
	public void draw();
	public void storeResult();
	public void module() throws IOException;
	public void makeDeck(String[] pattern, String[] nums);
	public int cal(List<DeckVO> listname);
	public int change(List<DeckVO> listname);
	public void dealerDraw();
	
}
