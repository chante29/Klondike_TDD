package miw.klondike.score;

import miw.klondike.Card;
import miw.klondike.Suit;

public class Valet extends Card{
	
	private final int score = 11;
	public Valet(Suit suit, boolean covered) {
		super(suit, covered);
	}

	@Override
	public int getScore() {
		return score;
	}

}
