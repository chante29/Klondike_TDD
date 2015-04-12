package miw.klondike;

public class Card {

	private boolean covered;
	
	public Card(boolean covered){
		this.covered = covered;
	}
	
	public boolean covered(){
		return covered;
	}

	public Card turn() {
		this.covered = !this.covered;
		return this;
	}
	
}
