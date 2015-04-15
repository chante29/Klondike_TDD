package miw.klondike;


public class MoveCardController extends AbstractController{

	 
	public MoveCardController(Game game) {
		super(game);
	}

	public boolean moveFromDeckToWaste(){
		switch(this.getGame().getDeck().getCards().size()){
		case 0:
			return false;
		case 1:
		case 2:
			int sizeDeck = this.getGame().getDeck().getCards().size();
			for (int numCard = 0; numCard < sizeDeck; numCard++) {
				Card card = this.getGame().getDeck().getLastCard();
				this.getGame().getWaste().getCards().add(card.turn());
			}
			return true;
		default:
			for (int numCard = 0; numCard < 3; numCard++) {
				Card card = this.getGame().getDeck().getLastCard();
				this.getGame().getWaste().getCards().add(card.turn());
			}
			return true;
		}
	}
	
	public boolean moveFromWasteToFoundation(Suit suitFoundation){
		Card firstCardWaste = this.getGame().getWaste().lookLastCard();
		Card firstCardFoundation = this.getGame().getFoundation(suitFoundation).lookLastCard();
		if(firstCardWaste != null && firstCardFoundation != null){
			if( firstCardWaste.getScore().ordinal() - 1 == firstCardFoundation.getScore().ordinal() && firstCardWaste.getSuit()== firstCardFoundation.getSuit()){
				this.getGame().getFoundation(suitFoundation).addCard(this.getGame().getWaste().getLastCard());
				return true;
			}else{
				return false;
			}
			
		}else if(firstCardWaste != null && firstCardWaste.getScore() == Score.AS && firstCardWaste.getSuit() == this.getGame().getFoundation(suitFoundation).getSuit()){
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
				
				if(lastCardFoundationTableau.getScore().ordinal() - 1 == lastCardWaste.getScore().ordinal()){
					switch(lastCardFoundationTableau.getSuit()){
					case HEARTS:
					case DIAMONDS:
						if(lastCardWaste.getSuit() == Suit.CLUBS || lastCardWaste.getSuit() == Suit.CLUBS){
							this.getGame().getFoundationTableau(numFoundationTableau).addCard(this.getGame().getWaste().getLastCard());
							return true;
						}else{
							return false;
						}
					case CLUBS:
					case SPADES:
						if(lastCardWaste.getSuit() == Suit.HEARTS || lastCardWaste.getSuit() == Suit.DIAMONDS){
							this.getGame().getFoundationTableau(numFoundationTableau).addCard(this.getGame().getWaste().getLastCard());
							return true;
						}else{
							return false;
						}
					}
				}else{
					return false;
				}
			}else {
				if(this.getGame().getWaste().lookLastCard().getScore() == Score.ROI){
					this.getGame().getFoundationTableau(numFoundationTableau).addCard(this.getGame().getWaste().getLastCard());
					return true;
				}
				return false;
			}
		}
		return false;
	}

	
}
