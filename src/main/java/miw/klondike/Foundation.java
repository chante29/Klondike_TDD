package miw.klondike;

import static org.junit.Assert.assertFalse;

import java.util.Stack;

public class Foundation {
	private Stack<Card> cards;
	private Suit suit;
	

	public Foundation(int numCards, Suit suit){
		assertFalse(numCards > 12);
		this.cards = new Stack<Card>();
		for (int numCard = 1; numCard <= numCards; numCard++) {
			this.cards.add(new Card(Score.valueOf(numCard), suit, false));
		}
		this.suit = suit;
	}
	
	public int size() {
		return 0;
	}
	
	public Card lookLastCard() {
		return this.isEmpty() ? null : cards.peek();
	}
	
	private boolean isEmpty(){
		return this.cards.size() == 0;
	}
	
	public Suit getSuit(){
		return this.suit;
	}
}
