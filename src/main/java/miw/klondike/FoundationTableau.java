package miw.klondike;

import java.util.Stack;

public class FoundationTableau {
	
	private Stack<Card> cards; 

	public FoundationTableau() {
		
	}

	public int size() {
		return 0;
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
	
	
}
