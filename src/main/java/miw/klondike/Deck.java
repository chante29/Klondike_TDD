package miw.klondike;

import java.util.Stack;

public class Deck {

	private Stack<Card> cards;
	
	public Deck(Stack<Card> cards) {
		this.cards = cards;
	}

	public int size() {
		return this.cards.size();
	}

	public Stack<Card> getCards() {
		return cards;
	}

	public void setCards(Stack<Card> cards) {
		this.cards = cards;
	}

	public Card getCard() {
		return cards.pop();
	}
	
	

}
