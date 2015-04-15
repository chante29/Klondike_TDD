package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Five extends Card{
	
	private final int score = 5;
	public Five(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
