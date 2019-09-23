package blackjack.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import blackjack.model.DeckVO;

// 딜러는 컴퓨터, 플레이어는 플레이어로서 게임 참여
// 추가할만한 사항으로는 플레이어 수를 게임 시작시에 사용자로부터 입력받고(max 8, min 2),
// 플레이어 수만큼 카드를 분배, 게임. AI 플레이어의 hit 여부 알고리즘 만들기,
// 사용자도 딜러를 할 수 있는 모드(혹은 랜덤으로)
// 원래 룰대로 딜러의 카드 한장은 숨기기
// 로그 저장
public class BlackJackServiceV1 implements BlackjackService {

	List<DeckVO> card; // 두 개의 값(문양, A~K까지의 카드 숫자)로 카드 한장을 만드는 리스트
	BufferedReader br;
	List<DeckVO> dealer;
	List<DeckVO> player;
	protected final int INITDRAW = 2;
	private int sum;

	public BlackJackServiceV1() {
		card = new ArrayList<DeckVO>();
		dealer = new ArrayList<DeckVO>();
		player = new ArrayList<DeckVO>();
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public void initDraw() throws IOException {
		// TODO Auto-generated method stub
		String initPattern = "DqHqCqS";
		String initNums = "Aq2q3q4q5q6q7q8q9q10qJqQqKq";
		String[] pattern = initPattern.split("q");
		String[] nums = initNums.split("q");
		this.makeDeck(pattern, nums);
		/*
		 * for(deckVO dVO : card) { card 리스트 안에 들어가있는 모양, 숫자 확인
		 * System.out.printf("%s %s\n", dVO.getPattern(), dVO.getNums()); }
		 */
		Collections.shuffle(card);
		for (int i = 0; i < INITDRAW; i++) {
			// 딜러 2장, 플레이어 2장 분배하고 리스트에서 분배한 카드 삭제
			dealer.add(card.get(0));
			card.remove(0);
			player.add(card.get(0));
			card.remove(0);
		}
		for (DeckVO dVO : dealer) {
			System.out.printf("딜러의 카드는 %s문양 %s입니다\n", dVO.getPattern(), dVO.getNums());
		}
		for (DeckVO pVO : player) {
			System.out.printf("당신의 카드는 %s문양 %s입니다\n", pVO.getPattern(), pVO.getNums());
		}
		if (this.cal(player) == 21) {
			System.out.println("블랙잭입니다! 이겼습니다!");
			this.module();
		} else if (this.cal(dealer) == 21) {
			System.out.println("딜러가 블랙잭입니다. 패배하였습니다");
			this.module();
		}
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if (this.cal(player) < 21) {
			System.out.println(card.get(0).getPattern() + card.get(0).getNums());
			player.add(card.get(0));
			card.remove(0);
		}
		if (this.cal(player) < 0) {
			System.out.println("21점을 초과하여 패배하였습니다");
			try {
				this.module();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void dealerDraw() {
		if(this.cal(dealer) <= 16) {
			System.out.println("딜러의 점수가 16점 이하이므로 드로우를 합니다");
			System.out.println(card.get(0).getPattern() + card.get(0).getNums());
			dealer.add(card.get(0));
			card.remove(0);
		}
		
		if (this.cal(dealer) < 0) {
			System.out.println("딜러가 21점을 초과하여 당신이 승리하였습니다");
			try {
				this.module();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public int change(List<DeckVO> listname) {
		DeckVO dVO = listname.get(0);
		int rt = 0;
		if (dVO.getNums().equalsIgnoreCase("A"))
			rt = 11;
		else if (dVO.getNums().equals("2"))
			rt = 2;
		else if (dVO.getNums().equals("3"))
			rt = 3;
		else if (dVO.getNums().equals("4"))
			rt = 4;
		else if (dVO.getNums().equals("5"))
			rt = 5;
		else if (dVO.getNums().equals("6"))
			rt = 6;
		else if (dVO.getNums().equals("7"))
			rt = 7;
		else if (dVO.getNums().equals("8"))
			rt = 8;
		else if (dVO.getNums().equals("9"))
			rt = 9;
		else if (dVO.getNums().equals("10"))
			rt = 10;
		else if (dVO.getNums().equalsIgnoreCase("J"))
			rt = 10;
		else if (dVO.getNums().equalsIgnoreCase("Q"))
			rt = 10;
		else if (dVO.getNums().equalsIgnoreCase("K"))
			rt = 10;
		System.out.println(rt);
		return rt;
	}

	@Override
	public int cal(List<DeckVO> listname) { // 점수 뽑는게 잘못되었음. 위에 change에서 오류
		sum = 0;
		for (int i = 0; i < listname.size(); i++) {
			sum += change(listname);
		}
		if (sum > 21) {
			DeckVO dVO;
			for (int i = 0; i < listname.size(); i++) {
				dVO = listname.get(i);
				if (dVO.getNums().equalsIgnoreCase("A")) {
					sum -= 10;
				} else
					sum = -1;
			}
		}
		return sum;
	}

	@Override
	public void makeDeck(String[] pattern, String[] nums) { // 덱 52장을 만드는 메소드
		// TODO Auto-generated method stub
		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				DeckVO dVO = new DeckVO(pattern[i], nums[j]);
				card.add(dVO);
			}
		}
	}

	@Override
	public void storeResult() {
		// TODO Auto-generated method stub
	}

	@Override
	public void module() throws IOException {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("==============================");
			System.out.println("1.게임시작\n" + "If you want to EXIT, Press Anykey");
			boolean boolMenu = false;
			String strMenu;
			strMenu = br.readLine();
			if (strMenu.equals("1"))
				boolMenu = true;

			if (!boolMenu) {
				System.out.println("블랙잭을 종료합니다");
				break;
			}
			System.out.println("덱을 만들어 카드를 분배합니다");
			this.initDraw();
			System.out.println("1.추가드로우 2.추가드로우 안함");
			String strDraw;
			strDraw = br.readLine();
			if (strDraw.equals("1")) {
				this.draw();
			} else if (strDraw.equals("2")) {
			}
			this.dealerDraw();
			if ((this.cal(player) - 21) > (this.cal(dealer) - 21)) {
				System.out.println("당신의 점수 : " + this.cal(player));
				System.out.println("딜러의 점수 : " + this.cal(dealer));
				System.out.println("딜러가 당신보다 21에 가까우므로 승리했습니다");
			} else {
				System.out.println("당신의 점수 : " + this.cal(player));
				System.out.println("딜러의 점수 : " + this.cal(dealer));
				System.out.println("당신이 딜러보다 21에 가까우므로 승리했습니다");
			}
		}
	}
}