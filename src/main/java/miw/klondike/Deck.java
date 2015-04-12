package miw.klondike;

import java.util.Stack;

public class Deck {

	private Stack<Card> cards;
	
	public Deck(Stack<Card> cards) {
		this.cards = cards;
	}
	
	public Deck(int numCards){
		this.cards = this.setStackCardRandom(numCards, true);
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
	
	private Stack<Card> setStackCardRandom(int sizeDeck, boolean covered) {
		Stack<Card> cards = new Stack<Card>();
		for (int num = 0; num < sizeDeck; num++) {
			cards.add(new Card(covered));
		}
		return cards;
	}

}
