package miw.klondike;

import java.awt.Color;

import miw.klondike.suit.SuitCard;

public abstract class Card {
	public final static int MAX_SCORE = 13;
	
	private boolean covered;
	private SuitCard suit;
	
	public Card(SuitCard suit, boolean covered){
		this.covered = covered;
		this.suit = suit;
	}
	
	public boolean covered(){
		return covered;
	}

	public Card turn() {
		this.covered = !this.covered;
		return this;
	}

	public boolean isCovered() {
		return covered;
	}

	public void setCovered(boolean covered) {
		this.covered = covered;
	}

	public abstract int getScore();

	public SuitCard getSuit() {
		return suit;
	}

	public void setSuit(SuitCard suit) {
		this.suit = suit;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (covered != other.covered)
			return false;
		if (!suit.equals(other.suit))
			return false;
		return true;
	}
	
	public Color getColor(){
		return this.getSuit().getColor();
	}
	
	public boolean isOnePointGreat(Card card){
		return this.getScore() -1 == card.getScore();
	}
	
	public boolean isOnePointLess(Card card){
		return this.getScore() + 1 == card.getScore();
	}
	
	public boolean isTheSameColor(Card card){
		return this.getColor() == card.getColor();
	}
	
	public boolean isTheSameSuit(Card card){
		return this.getSuit().equals(card.getSuit());
	}
	
	
}
