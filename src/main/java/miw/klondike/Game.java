package miw.klondike;

import java.util.ArrayList;
import java.util.Stack;
import static org.junit.Assert.*;

public class Game {

	private Deck deck;
	private Waste waste;
	private ArrayList<Foundation> foundations;
	private ArrayList<FoundationTableau> foundationsTableau;
	
	
	public Game(Deck deck, Waste waste) {
		this.deck = deck;
		this.waste = waste;
		this.initializeFoundations();
		this.initializeFoundationsTableau();
	}
	
	

	private void initializeFoundationsTableau() {
		this.foundationsTableau = new ArrayList<FoundationTableau>();
		for (int numFoundationTableau = 0; numFoundationTableau < 7; numFoundationTableau++) {
			this.foundationsTableau.add(new FoundationTableau());
		}
		
	}



	private void initializeFoundations() {
		this.foundations = new ArrayList<Foundation>();
		for (int numFoundation = 0; numFoundation < 4; numFoundation++) {
			this.foundations.add(new Foundation(numFoundation, Suit.valueOf(numFoundation)));
		}
		
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



	public void setWaste(Stack<Card> cardsWaste) {
		this.waste = new Waste(cardsWaste);
	}



	public void setFoundation(Suit suit, Foundation foundation) {
		switch(suit){
		case HEARTS:
			this.foundations.set(0, foundation);
			break;
		case DIAMONDS:
			this.foundations.set(1, foundation);
			break;
		case CLUBS:
			this.foundations.set(2, foundation);
			break;
		case SPADES:
			this.foundations.set(3, foundation);
			break;
		default:
			assert false;
		}
		
	}



	public void setFoundationTableau(int numFoundationTableau,
			FoundationTableau foundationsTableau) {
		this.foundationsTableau.set(numFoundationTableau, foundationsTableau);
	}



	public Foundation getFoundation(Suit suitFoundation) {
		return this.foundations.get(suitFoundation.ordinal());
		
	}



	public FoundationTableau getFoundationTableau(int numFoundationTableau) {
		assertTrue(numFoundationTableau < 6);
		return this.foundationsTableau.get(numFoundationTableau);
	}
	
	



	

}
