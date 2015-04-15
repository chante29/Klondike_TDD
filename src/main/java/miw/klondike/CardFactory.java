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
			switch(suit){
			case HEARTS:
				return new As(Suit.HEARTS, covered);
			case DIAMONDS:
				return new As(Suit.DIAMONDS, covered);
			case CLUBS:
				return new As(Suit.CLUBS, covered);
			case SPADES:
				return new As(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case TWO:
			switch(suit){
			case HEARTS:
				return new Two(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Two(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Two(Suit.CLUBS, covered);
			case SPADES:
				return new Two(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case THREE:
			switch(suit){
			case HEARTS:
				return new Three(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Three(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Three(Suit.CLUBS, covered);
			case SPADES:
				return new Three(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case FOUR:
			switch(suit){
			case HEARTS:
				return new Four(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Four(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Four(Suit.CLUBS, covered);
			case SPADES:
				return new Four(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case FIVE:
			switch(suit){
			case HEARTS:
				return new Five(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Five(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Five(Suit.CLUBS, covered);
			case SPADES:
				return new Five(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case SIX:
			switch(suit){
			case HEARTS:
				return new Six(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Six(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Six(Suit.CLUBS, covered);
			case SPADES:
				return new Six(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case SEVEN:
			switch(suit){
			case HEARTS:
				return new Seven(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Seven(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Seven(Suit.CLUBS, covered);
			case SPADES:
				return new Seven(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case EIGHT:
			switch(suit){
			case HEARTS:
				return new Eight(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Eight(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Eight(Suit.CLUBS, covered);
			case SPADES:
				return new Eight(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case NINE:
			switch(suit){
			case HEARTS:
				return new Nine(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Nine(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Nine(Suit.CLUBS, covered);
			case SPADES:
				return new Nine(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case TEN:
			switch(suit){
			case HEARTS:
				return new Ten(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Ten(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Ten(Suit.CLUBS, covered);
			case SPADES:
				return new Ten(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case VALET:
			switch(suit){
			case HEARTS:
				return new Valet(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Valet(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Valet(Suit.CLUBS, covered);
			case SPADES:
				return new Valet(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case DAME:
			switch(suit){
			case HEARTS:
				return new Dame(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Dame(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Dame(Suit.CLUBS, covered);
			case SPADES:
				return new Dame(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case ROI:
			switch(suit){
			case HEARTS:
				return new Roi(Suit.HEARTS, covered);
			case DIAMONDS:
				return new Roi(Suit.DIAMONDS, covered);
			case CLUBS:
				return new Roi(Suit.CLUBS, covered);
			case SPADES:
				return new Roi(Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
				default:
					throw new IllegalArgumentException("Unexpected type card");
			
		}
	}
}
