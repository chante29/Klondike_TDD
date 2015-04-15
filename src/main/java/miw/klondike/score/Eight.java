package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Eight extends Card{
	
	private final int score = 8;
	public Eight(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}
}
