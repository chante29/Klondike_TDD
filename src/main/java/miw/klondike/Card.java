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
	
	
	
}
