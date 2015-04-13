package miw.klondike;


public class MoveCardController {

	private Game game;
	 
	public MoveCardController(Game game) {
		this.game = game;
	}

	public boolean moveFromDeckToWaste(Deck deck, Waste waste){
		switch(deck.getCards().size()){
		case 0:
			return false;
		case 1:
		case 2:
			int sizeDeck = deck.getCards().size();
			for (int numCard = 0; numCard < sizeDeck; numCard++) {
				Card card = deck.getCard();
				waste.getCards().add(card.turn());
			}
			return true;
		default:
			for (int numCard = 0; numCard < 3; numCard++) {
				Card card = deck.getCard();
				waste.getCards().add(card.turn());
			}
			return true;
		}
	}
	
	public boolean moveFromWasteToFoundation(Suit suitFoundation){
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
