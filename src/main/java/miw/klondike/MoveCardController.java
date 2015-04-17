package miw.klondike;


public class MoveCardController extends AbstractController{
	private final int MAXIMUM_CARDS_MOVE_DECK_TO_WASTE = 3;
	 
	public MoveCardController(Game game) {
		super(game);
	}

	public boolean moveFromDeckToWaste(){
		int numCardsMove = this.getGame().getDeck().getCards().size() == MAXIMUM_CARDS_MOVE_DECK_TO_WASTE ? MAXIMUM_CARDS_MOVE_DECK_TO_WASTE : this.getGame().getDeck().getCards().size();
		for (int numCard = 0; numCard < numCardsMove; numCard++) {
			Card card = this.getGame().getDeck().getLastCard();
			this.getGame().getWaste().getCards().add(card.turn());
		}
		return true;
	}
	
	public boolean moveFromWasteToFoundation(Suit suitFoundation){
		Card firstCardWaste = this.getGame().getWaste().lookLastCard();
		Card firstCardFoundation = this.getGame().getFoundation(suitFoundation).lookLastCard();
		if(firstCardWaste != null && firstCardFoundation != null){
			if( firstCardWaste.getScore() - 1 == firstCardFoundation.getScore() && firstCardWaste.getSuit().getColor() == firstCardFoundation.getSuit().getColor()){
				this.getGame().getFoundation(suitFoundation).addCard(this.getGame().getWaste().getLastCard());
				return true;
			}else{
				return false;
			}
			
		}else if(firstCardWaste != null && firstCardWaste.getScore() == 1 && firstCardWaste.getSuit().equals(this.getGame().getFoundation(suitFoundation).getSuit())){
			this.getGame().getFoundation(suitFoundation).addCard(this.getGame().getWaste().getLastCard());
			return true;
		}
		return false;
	}
	
	public boolean moveFromWasteToFoundationTableau(int numFoundationTableau){
		if(this.getGame().getWaste().lookLastCard() != null){
			if(this.getGame().getFoundationTableau(numFoundationTableau).lookLastCard()!= null){
				Card lastCardWaste = this.getGame().getWaste().lookLastCard();
				Card lastCardFoundationTableau = this.getGame().getFoundationTableau(numFoundationTableau).lookLastCard();
				
				if(lastCardFoundationTableau.getScore() - 1 == lastCardWaste.getScore() && lastCardWaste.getColor() != lastCardFoundationTableau.getColor() ){
							this.getGame().getFoundationTableau(numFoundationTableau).addCard(this.getGame().getWaste().getLastCard());
							return true;		
				}else{
					return false;
				}
			}else {
				if(this.getGame().getWaste().lookLastCard().getScore() == Card.MAX_SCORE){
					this.getGame().getFoundationTableau(numFoundationTableau).addCard(this.getGame().getWaste().getLastCard());
					return true;
				}
			}
		}
		return false;
	}

	
}
