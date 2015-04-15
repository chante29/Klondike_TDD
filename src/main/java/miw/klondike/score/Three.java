package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Three extends Card{
	
	private final int score = 3;
	public Three(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
