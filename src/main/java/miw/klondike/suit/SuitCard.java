package miw.klondike.suit;

import java.awt.Color;

import miw.klondike.enumeration.Suit;

public abstract class SuitCard {

	public abstract Color getColor();
	
	public abstract int getNumber();
	
	public abstract Suit getSuit();
	@Override
	public boolean equals(Object obj) {
		return getClass() == obj.getClass();
	}
	
}
