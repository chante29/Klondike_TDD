package miw.klondike;


public class MoveCardController {

	private Game game;
	 
	public MoveCardController(Game game) {
		this.game = game;
	}

	public boolean moveFromDeckToWaste(){
		switch(this.game.getDeck().getCards().size()){
		case 0:
			return false;
		case 1:
		case 2:
			int sizeDeck = this.game.getDeck().getCards().size();
			for (int numCard = 0; numCard < sizeDeck; numCard++) {
				Card card = this.game.getDeck().getCard();
				this.game.getWaste().getCards().add(card.turn());
			}
			return true;
		default:
			for (int numCard = 0; numCard < 3; numCard++) {
				Card card = this.game.getDeck().getCard();
				this.game.getWaste().getCards().add(card.turn());
			}
			return true;
		}
	}
	
	public boolean moveFromWasteToFoundation(Suit suitFoundation){
		Card firstCardWaste = this.getGame().getWaste().lookCard(this.getGame().getWaste().getCards().size() -1);
		Card firstCardFoundation = this.getGame().getFoundation(suitFoundation).lookLastCard();
		if(firstCardWaste != null && firstCardFoundation != null){
			if( firstCardWaste.getScore().ordinal() - 1 == firstCardFoundation.getScore().ordinal() && firstCardWaste.getSuit()== firstCardFoundation.getSuit()){
				return true;
			}else{
				return false;
			}
			
		}else if(firstCardWaste != null && firstCardWaste.getScore() == Score.AS && firstCardWaste.getSuit() == this.getGame().getFoundation(suitFoundation).getSuit()){
			return true;
		}
		return false;
	}
	
	public boolean moveFromWasteToFoundationTableau(int numFoundationTableau){
		return false;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	
}
