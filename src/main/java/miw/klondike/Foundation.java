package miw.klondike;

import static org.junit.Assert.assertFalse;

import java.util.Stack;

public class Foundation {
	private Stack<Card> cards;
	

	public Foundation(int numCards, Suit suit){
		assertFalse(numCards > 12);
		this.cards = new Stack<Card>();
		for (int numCard = 0; numCard < numCards; numCard++) {
			this.cards.add(new Card(Score.valueOf(numCard), suit, false));
		}
		
	}
	
	public int size() {
		return 0;
	}
}
