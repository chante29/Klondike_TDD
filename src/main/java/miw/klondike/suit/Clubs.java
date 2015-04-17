package miw.klondike.suit;

import java.awt.Color;

import miw.klondike.enumeration.Suit;

public class Clubs extends SuitCard{
	private final int NUMBER_SUIT = 2;

	@Override
	public Color getColor() {
		return Color.BLACK;
	}

	@Override
	public int getNumber() {
		return NUMBER_SUIT;
	}

	@Override
	public Suit getSuit() {
		return Suit.CLUBS;
	}

}
