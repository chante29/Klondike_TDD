package miw.klondike;

import static org.junit.Assert.assertFalse;


public class Foundation extends StackCards{
	private Suit suit;
	

	public Foundation(int numCards, Suit suit){
		super();
		assertFalse(numCards > 12);
		for (int numCard = 1; numCard <= numCards; numCard++) {
			this.addCard(CardFactory.getCard(Score.valueOf(numCard), suit, false));
		}
		this.suit = suit;
	}
	
	public Suit getSuit(){
		return this.suit;
	}
	
}
