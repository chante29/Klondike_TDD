package miw.klondike;

import miw.klondike.score.As;
import miw.klondike.score.Dame;
import miw.klondike.score.Eight;
import miw.klondike.score.Five;
import miw.klondike.score.Four;
import miw.klondike.score.Nine;
import miw.klondike.score.Roi;
import miw.klondike.score.Seven;
import miw.klondike.score.Six;
import miw.klondike.score.Ten;
import miw.klondike.score.Three;
import miw.klondike.score.Two;
import miw.klondike.score.Valet;


public class CardFactory {
	
	public static Card getCard(Score score, Suit suit, boolean covered) {
		switch(score){
		case AS:
			return new As(suit, covered);
		case TWO:
			return new Two(suit, covered);
		case THREE:
			return new Three(suit, covered);
		case FOUR:
			return new Four(suit, covered);
		case FIVE:
			return new Five(suit, covered);
		case SIX:
			return new Six(suit, covered);
		case SEVEN:
			return new Seven(suit, covered);
		case EIGHT:
			return new Eight(suit, covered);
		case NINE:
			return new Nine(suit, covered);
		case TEN:
			return new Ten(suit, covered);
		case VALET:
			return new Valet(suit, covered);
		case DAME:
			return new Dame(suit, covered);
		case ROI:
			return new Roi(suit, covered);
		default:
			throw new IllegalArgumentException("Unexpected type card");
			
		}
	}
}
