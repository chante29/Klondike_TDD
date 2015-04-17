package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.suit.SuitCard;

public class Dame extends Card{
	private final int score = 11;
	public Dame(SuitCard suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
