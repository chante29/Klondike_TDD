package miw.klondike;


public class CardFactory {
	
	public static Card getCard(Score score, Suit suit, boolean covered) {
		switch(score){
		case AS:
			switch(suit){
			case HEARTS:
				return new Card(Score.AS, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.AS, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.AS, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.AS, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case TWO:
			switch(suit){
			case HEARTS:
				return new Card(Score.TWO, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.TWO, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.TWO, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.TWO, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case THREE:
			switch(suit){
			case HEARTS:
				return new Card(Score.THREE, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.THREE, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.THREE, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.THREE, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case FOUR:
			switch(suit){
			case HEARTS:
				return new Card(Score.FOUR, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.FOUR, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.FOUR, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.FOUR, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case FIVE:
			switch(suit){
			case HEARTS:
				return new Card(Score.FIVE, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.FIVE, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.FIVE, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.FIVE, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case SIX:
			switch(suit){
			case HEARTS:
				return new Card(Score.SIX, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.SIX, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.SIX, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.SIX, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case SEVEN:
			switch(suit){
			case HEARTS:
				return new Card(Score.SEVEN, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.SEVEN, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.SEVEN, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.SEVEN, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case EIGHT:
			switch(suit){
			case HEARTS:
				return new Card(Score.EIGHT, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.EIGHT, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.EIGHT, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.EIGHT, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case NINE:
			switch(suit){
			case HEARTS:
				return new Card(Score.NINE, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.NINE, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.NINE, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.NINE, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case TEN:
			switch(suit){
			case HEARTS:
				return new Card(Score.TEN, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.TEN, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.TEN, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.TEN, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case VALET:
			switch(suit){
			case HEARTS:
				return new Card(Score.VALET, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.VALET, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.VALET, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.VALET, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case DAME:
			switch(suit){
			case HEARTS:
				return new Card(Score.DAME, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.DAME, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.DAME, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.DAME, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
		case ROI:
			switch(suit){
			case HEARTS:
				return new Card(Score.ROI, Suit.HEARTS, covered);
			case DIAMONDS:
				return new Card(Score.ROI, Suit.DIAMONDS, covered);
			case CLUBS:
				return new Card(Score.ROI, Suit.CLUBS, covered);
			case SPADES:
				return new Card(Score.ROI, Suit.SPADES, covered);
				default:
					throw new IllegalArgumentException("Unexpected type card");
			}
				default:
					throw new IllegalArgumentException("Unexpected type card");
			
		}
	}
}
