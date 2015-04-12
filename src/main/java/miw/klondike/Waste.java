package miw.klondike;

import java.util.Stack;

public class Waste {

	private Stack<Card> cards;
	
	public int size() {
		return this.cards.size();
	}
	
	public Stack<Card> getCards() {
		return cards;
	}

	public void setCards(Stack<Card> cards) {
		this.cards = cards;
	}

}
