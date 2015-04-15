package miw.klondike;

public abstract class Card {

	private boolean covered;
	private Suit suit;
	
	public Card(Suit suit, boolean covered){
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

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
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
		if (suit != other.suit)
			return false;
		return true;
	}
	
	
	
}
