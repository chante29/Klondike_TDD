package miw.klondike;

import java.util.Stack;

public class StackCards {
	private Stack<Card> cards;

	public StackCards(){
		super();
		this.cards = new Stack<Card>();
	}
	public StackCards(Stack<Card> cards) {
		super();
		this.cards = cards;
	}

	public Stack<Card> getCards() {
		return cards;
	}

	public void setCards(Stack<Card> cards) {
		this.cards = cards;
	}
	
	public Card lookLastCard() {
		return isEmpty() ? null : this.cards.peek();
	}
	
	
	private boolean isEmpty(){
		return this.cards.size() == 0;
	}

	public Card getLastCard() {
		return isEmpty() ? null : this.cards.pop();
	}
	
	public void addCard(Card card){
		this.cards.push(card);
	}

	public int size() {
		return this.cards.size();
	}
}
