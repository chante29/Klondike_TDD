package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Seven extends Card{
	
	private final int score = 7;
	public Seven(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
