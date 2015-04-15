package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Dame extends Card{
	private final int score = 11;
	public Dame(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
