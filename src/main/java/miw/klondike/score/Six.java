package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Six extends Card{
	
	private final int score = 6;
	public Six(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
