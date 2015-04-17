package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.suit.SuitCard;

public class Two extends Card{
	
	private final int score = 2;
	public Two(SuitCard suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
