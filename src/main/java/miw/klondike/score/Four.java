package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Four extends Card{
	
	private final int score = 4;
	public Four(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}
}
