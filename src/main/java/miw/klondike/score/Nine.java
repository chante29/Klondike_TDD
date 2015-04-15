package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Nine extends Card{
	
	private final int score = 9;
	public Nine(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
