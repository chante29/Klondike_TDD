package miw.klondike;

import java.util.Stack;

public class Game {

	private Deck deck;
	private Waste waste;
	
	public Game(Deck deck, Waste waste) {
		this.deck = deck;
		this.waste = waste;
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
