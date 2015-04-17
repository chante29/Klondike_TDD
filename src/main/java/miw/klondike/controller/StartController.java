package miw.klondike.controller;

import java.util.ArrayList;

import miw.klondike.Foundation;
import miw.klondike.FoundationTableau;
import miw.klondike.Game;
import miw.klondike.enumeration.Score;
import miw.klondike.enumeration.Suit;
import miw.klondike.factory.CardFactory;

public class StartController extends AbstractController{
	
	public StartController(Game game){
		super(game);
		startFoundationsTableau();
	}
	
	private void startFoundationsTableau() {
		for (int numFoundationTableau = 0; numFoundationTableau < Game.MAX_FOUNDATIONS_TABLEAU; numFoundationTableau++) {
			FoundationTableau foundationTableau = new FoundationTableau();
			for (int j = 0; j <= numFoundationTableau; j++) {
				if(j== numFoundationTableau){
					foundationTableau.addCard(CardFactory.getCard(Score.AS, Suit.HEARTS, false));
				}else{
					foundationTableau.addCard(CardFactory.getCard(Score.AS, Suit.HEARTS, true));
				}
			}
			this.getGame().setFoundationTableau(numFoundationTableau, foundationTableau);
		}

		
	}

	public int getSizeDeck(){
		return this.getGame().getDeck().size();
	}
	
	public int getSizeWaste(){
		return this.getGame().getWaste().size();
	}
	
	public ArrayList<Foundation> getFoundations(){
		ArrayList<Foundation> foundations = new ArrayList<Foundation>();
		for (int i = 0; i < Game.MAX_FOUNDATIONS; i++) {
			foundations.add(new Foundation(0, Suit.HEARTS));
		}
		return foundations;
	}

	public ArrayList<FoundationTableau> getFoundationsTableau() {
		return this.getGame().getFoundationsTableau();
	}
}
