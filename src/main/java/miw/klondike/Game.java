package miw.klondike;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Stack;

import miw.klondike.enumeration.Suit;
import miw.klondike.factory.SuitCardFactory;

public class Game {

	public static final int MAX_FOUNDATIONS_TABLEAU = 7;
	public static final int MAX_FOUNDATIONS = 4;
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
		this.foundations.set(SuitCardFactory.getSuitCard(suit).getNumber(), foundation);	
	}



	public void setFoundationTableau(int numFoundationTableau,
			FoundationTableau foundationsTableau) {
		this.foundationsTableau.set(numFoundationTableau, foundationsTableau);
	}



	public Foundation getFoundation(Suit suitFoundation) {
		return foundations.get(SuitCardFactory.getSuitCard(suitFoundation).getNumber());		
	}



	public FoundationTableau getFoundationTableau(int numFoundationTableau) {
		assertTrue(numFoundationTableau < MAX_FOUNDATIONS_TABLEAU);
		return this.foundationsTableau.get(numFoundationTableau);
	}



	public ArrayList<FoundationTableau> getFoundationsTableau() {
		return this.foundationsTableau;
	}
	
	



	

}
