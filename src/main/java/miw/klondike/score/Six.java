package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.suit.SuitCard;

public class Six extends Card{
	
	private final int score = 6;
	public Six(SuitCard suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
