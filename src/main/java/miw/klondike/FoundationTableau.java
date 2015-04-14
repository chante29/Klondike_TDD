package miw.klondike;

import java.util.Stack;

public class FoundationTableau {
	
	private Stack<Card> cards; 

	public FoundationTableau() {
		this.cards = new Stack<Card>();
	}

	public int size() {
		return cards.size();
	}
	
	public Card getFirstCard(){
		return cards.pop();
	}
	
	public Card lookCard(int index){
		return cards.elementAt(index);
	}

	public Stack<Card> getCards() {
		return cards;
	}

	public void setCards(Stack<Card> cards) {
		this.cards = cards;
	}
	
	public void addCard(Card card){
		this.cards.push(card);
	}

	public Card lookLastCard() {
		return this.cards.peek();
	}
	
	
}
