package miw.klondike;

import static org.junit.Assert.assertFalse;
import miw.klondike.suit.SuitCard;


public class Foundation extends StackCards{
	private SuitCard suitCard;
	

	public Foundation(int numCards, Suit suit){
		super();
		assertFalse(numCards > Card.MAX_SCORE);
		for (int numCard = 1; numCard <= numCards; numCard++) {
			this.addCard(CardFactory.getCard(Score.valueOf(numCard), suit, false));			
		}
		this.suitCard = SuitCardFactory.getSuitCard(suit);
	}
	
	public SuitCard getSuit(){
		return this.suitCard;
	}
	
}
