package blackjack.exec;

import java.io.IOException;

import blackjack.service.BlackJackServiceV1;
import blackjack.service.BlackjackService;

public class BlackJackExec_01 {

	public static void main(String[] args) {
		BlackjackService bj = new BlackJackServiceV1();
		try {
			bj.module();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}