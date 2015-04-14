package miw.klondike;

public class Card {

	private boolean covered;
	private Score score;
	private Suit suit;
	
	public Card(Score score, Suit suit, boolean covered){
		this.covered = covered;
		this.score = score;
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

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

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
		if (score != other.score)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
	
	
	
}
