package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.suit.SuitCard;

public class Three extends Card{
	
	private final int score = 3;
	public Three(SuitCard suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
