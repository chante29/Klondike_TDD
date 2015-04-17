package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.suit.SuitCard;

public class As extends Card{
	private final int score = 1;
	public As(SuitCard suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
