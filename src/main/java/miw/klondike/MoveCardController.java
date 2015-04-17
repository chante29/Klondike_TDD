package miw.klondike;

import miw.klondike.score.As;


public class MoveCardController extends AbstractController{
	private final int MAXIMUM_CARDS_MOVE_DECK_TO_WASTE = 3;
	 
	public MoveCardController(Game game) {
		super(game);
	}

	public boolean moveFromDeckToWaste(){
		int numCardsMove = this.getGame().getDeck().getCards().size() < MAXIMUM_CARDS_MOVE_DECK_TO_WASTE ? this.getGame().getDeck().getCards().size() : MAXIMUM_CARDS_MOVE_DECK_TO_WASTE;
		for (int numCard = 0; numCard < numCardsMove; numCard++) {
			Card card = this.getGame().getDeck().getLastCard();
			this.getGame().getWaste().getCards().add(card.turn());
		}
		return numCardsMove != 0;
	}
	
	public boolean moveFromWasteToFoundation(Suit suitFoundation){
		if( wasteHasCards() && ((!foundationHasCards(suitFoundation) && wasteHasAsTheSameSuit(suitFoundation)) 
								||(foundationHasCards(suitFoundation) && isMovementWasteToFoundationValid(suitFoundation)))){

			this.getGame().getFoundation(suitFoundation).addCard(this.getGame().getWaste().getLastCard());
			return true;
		}	
		return false;
		
	}
	
	private boolean wasteHasAsTheSameSuit(Suit suitFoundation){
		return this.getGame().getWaste().lookLastCard().getClass().equals(As.class) && this.getGame().getWaste().lookLastCard().getSuit().equals(SuitCardFactory.getSuitCard(suitFoundation));
	}
	
	private boolean wasteHasCards(){
		return this.getGame().getWaste().lookLastCard() != null;
	}
	
	private boolean foundationHasCards(Suit suitFoundation){
		return this.getGame().getFoundation(suitFoundation).lookLastCard() != null;
	}
	
	
	private boolean isMovementWasteToFoundationValid(Suit suitFoundation){
		return this.getGame().getWaste().lookLastCard().isOnePointGreat(this.getGame().getFoundation(suitFoundation).lookLastCard()) 
				&& this.getGame().getWaste().lookLastCard().isTheSameColor(this.getGame().getFoundation(suitFoundation).lookLastCard());
	}
	
	public boolean moveFromWasteToFoundationTableau(int numFoundationTableau){
		if(this.getGame().getWaste().lookLastCard() != null){
			if(this.getGame().getFoundationTableau(numFoundationTableau).lookLastCard()!= null){
				Card lastCardWaste = this.getGame().getWaste().lookLastCard();
				Card lastCardFoundationTableau = this.getGame().getFoundationTableau(numFoundationTableau).lookLastCard();
				
				if(lastCardWaste.isOnePointLess(lastCardFoundationTableau) && !lastCardWaste.isTheSameColor(lastCardFoundationTableau) ){
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
