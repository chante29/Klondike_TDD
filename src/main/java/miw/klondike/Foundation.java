package miw.klondike;

import static org.junit.Assert.assertFalse;


public class Foundation extends StackCards{
	private Suit suit;
	

	public Foundation(int numCards, Suit suit){
		super();
		assertFalse(numCards > 12);
		for (int numCard = 1; numCard <= numCards; numCard++) {
			switch(numCard){
			case 1:
				this.addCard(CardFactory.getCard(Score.AS, suit, false));
				break;
			case 2:
				this.addCard(CardFactory.getCard(Score.TWO, suit, false));
				break;
			case 3:
				this.addCard(CardFactory.getCard(Score.THREE, suit, false));
				break;
			case 4:
				this.addCard(CardFactory.getCard(Score.FOUR, suit, false));
				break;
			case 5:
				this.addCard(CardFactory.getCard(Score.FIVE, suit, false));
				break;
			case 6:
				this.addCard(CardFactory.getCard(Score.SIX, suit, false));
				break;
			case 7:
				this.addCard(CardFactory.getCard(Score.SEVEN, suit, false));
				break;
			case 8:
				this.addCard(CardFactory.getCard(Score.EIGHT, suit, false));
				break;
			case 9:
				this.addCard(CardFactory.getCard(Score.NINE, suit, false));
				break;
			case 10:
				this.addCard(CardFactory.getCard(Score.TEN, suit, false));
				break;
			case 11:
				this.addCard(CardFactory.getCard(Score.VALET, suit, false));
				break;
			case 12:
				this.addCard(CardFactory.getCard(Score.DAME, suit, false));
				break;
			case 13:
				this.addCard(CardFactory.getCard(Score.ROI, suit, false));
				break;
			}
			
		}
		this.suit = suit;
	}
	
	public Suit getSuit(){
		return this.suit;
	}
	
}
