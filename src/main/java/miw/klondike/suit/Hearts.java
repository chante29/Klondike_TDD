package miw.klondike.suit;

import java.awt.Color;

import miw.klondike.enumeration.Suit;

public class Hearts extends SuitCard{
	private final int NUMBER_SUIT = 0;

	@Override
	public Color getColor() {
		return Color.RED;
	}

	@Override
	public int getNumber() {
		return NUMBER_SUIT;
	}

	@Override
	public Suit getSuit() {
		return Suit.HEARTS;
	}

}
