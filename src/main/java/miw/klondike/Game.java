package miw.klondike;

import java.util.Stack;

public class Game {

	private Deck deck;
	private Waste waste;
	
	public Game(int sizeDeck, int sizeWaste) {
		this.deck = new Deck(this.setStackCardRandom(sizeDeck, true));
		this.waste = new Waste(this.setStackCardRandom(sizeWaste, false));
	}
	
	
	private Stack<Card> setStackCardRandom(int sizeDeck, boolean covered) {
		Stack<Card> cards = new Stack<Card>();
		for (int num = 0; num < sizeDeck; num++) {
			cards.add(new Card(covered));
		}
		return cards;
	}
	public Deck getDeck() {
		return deck;
	}
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	public Waste getWaste() {
		return waste;
	}
	public void setWaste(Waste waste) {
		this.waste = waste;
	}

	

}
