package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.suit.SuitCard;

public class Roi extends Card{
	
	private final int score = 13;
	public Roi(SuitCard suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
