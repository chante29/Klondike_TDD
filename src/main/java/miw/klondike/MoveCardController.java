package miw.klondike;


public class MoveCardController {

	private Game game;
	 
	public MoveCardController(Game game) {
		this.game = game;
	}

	public boolean moveFromDeckToWaste(Deck deck, Waste waste){
		return false;
	}
	
	public boolean moveFromWasteToFoundation(Waste waste, Foundation foundation){
		return false;
	}
	
	public boolean moveFromWasteToFoundationTableau(Waste waste, FoundationTableau foundationTableau){
		return false;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	
}
