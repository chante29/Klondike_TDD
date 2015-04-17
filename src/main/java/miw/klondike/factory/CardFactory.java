package miw.klondike.factory;

import miw.klondike.Card;
import miw.klondike.enumeration.Score;
import miw.klondike.enumeration.Suit;
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
import miw.klondike.suit.Clubs;
import miw.klondike.suit.Diamonds;
import miw.klondike.suit.Hearts;
import miw.klondike.suit.Spades;

public class CardFactory {

	public static Card getCard(Score score, Suit suit, boolean covered) {
		switch(score){
		case AS:
			switch(suit){
			case HEARTS:
				return new As(new Hearts(), covered);
			case DIAMONDS:
				return new As(new Diamonds(), covered);
			case CLUBS:
				return new As(new Clubs(), covered);
			case SPADES:
				return new As(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case TWO:
			switch(suit){
			case HEARTS:
				return new Two(new Hearts(), covered);
			case DIAMONDS:
				return new Two(new Diamonds(), covered);
			case CLUBS:
				return new Two(new Clubs(), covered);
			case SPADES:
				return new Two(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case THREE:
			switch(suit){
			case HEARTS:
				return new Three(new Hearts(), covered);
			case DIAMONDS:
				return new Three(new Diamonds(), covered);
			case CLUBS:
				return new Three(new Clubs(), covered);
			case SPADES:
				return new Three(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case FOUR:
			switch(suit){
			case HEARTS:
				return new Four(new Hearts(), covered);
			case DIAMONDS:
				return new Four(new Diamonds(), covered);
			case CLUBS:
				return new Four(new Clubs(), covered);
			case SPADES:
				return new Four(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case FIVE:
			switch(suit){
			case HEARTS:
				return new Five(new Hearts(), covered);
			case DIAMONDS:
				return new Five(new Diamonds(), covered);
			case CLUBS:
				return new Five(new Clubs(), covered);
			case SPADES:
				return new Five(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case SIX:
			switch(suit){
			case HEARTS:
				return new Six(new Hearts(), covered);
			case DIAMONDS:
				return new Six(new Diamonds(), covered);
			case CLUBS:
				return new Six(new Clubs(), covered);
			case SPADES:
				return new Six(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case SEVEN:
			switch(suit){
			case HEARTS:
				return new Seven(new Hearts(), covered);
			case DIAMONDS:
				return new Seven(new Diamonds(), covered);
			case CLUBS:
				return new Seven(new Clubs(), covered);
			case SPADES:
				return new Seven(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case EIGHT:
			switch(suit){
			case HEARTS:
				return new Eight(new Hearts(), covered);
			case DIAMONDS:
				return new Eight(new Diamonds(), covered);
			case CLUBS:
				return new Eight(new Clubs(), covered);
			case SPADES:
				return new Eight(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case NINE:
			switch(suit){
			case HEARTS:
				return new Nine(new Hearts(), covered);
			case DIAMONDS:
				return new Nine(new Diamonds(), covered);
			case CLUBS:
				return new Nine(new Clubs(), covered);
			case SPADES:
				return new Nine(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case TEN:
			switch(suit){
			case HEARTS:
				return new Ten(new Hearts(), covered);
			case DIAMONDS:
				return new Ten(new Diamonds(), covered);
			case CLUBS:
				return new Ten(new Clubs(), covered);
			case SPADES:
				return new Ten(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case VALET:
			switch(suit){
			case HEARTS:
				return new Valet(new Hearts(), covered);
			case DIAMONDS:
				return new Valet(new Diamonds(), covered);
			case CLUBS:
				return new Valet(new Clubs(), covered);
			case SPADES:
				return new Valet(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case DAME:
			switch(suit){
			case HEARTS:
				return new Dame(new Hearts(), covered);
			case DIAMONDS:
				return new Dame(new Diamonds(), covered);
			case CLUBS:
				return new Dame(new Clubs(), covered);
			case SPADES:
				return new Dame(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case ROI:
			switch(suit){
			case HEARTS:
				return new Roi(new Hearts(), covered);
			case DIAMONDS:
				return new Roi(new Diamonds(), covered);
			case CLUBS:
				return new Roi(new Clubs(), covered);
			case SPADES:
				return new Roi(new Spades(), covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
				default:
					throw new IllegalArgumentException("Unexpected type card");
			
		}
	}
}
