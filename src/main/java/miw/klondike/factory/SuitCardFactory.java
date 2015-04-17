package miw.klondike.factory;

import miw.klondike.enumeration.Suit;
import miw.klondike.suit.Clubs;
import miw.klondike.suit.Diamonds;
import miw.klondike.suit.Hearts;
import miw.klondike.suit.Spades;
import miw.klondike.suit.SuitCard;

public class SuitCardFactory {

	public static SuitCard getSuitCard(Suit suit) {
		switch(suit){
		case HEARTS:
			return new Hearts();
		case DIAMONDS:
			return new Diamonds();
		case CLUBS:
			return new Clubs();
		case SPADES:
			return new Spades();
			default:
				throw new IllegalArgumentException("Unexpected type card");
		}
		
	}
}
