package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Ten extends Card{
	
	private final int score = 10;
	public Ten(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
