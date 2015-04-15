package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class As extends Card{
	private final int score = 1;
	public As(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
