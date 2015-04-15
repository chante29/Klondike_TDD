package miw.klondike;

import java.util.ArrayList;

public class StartController extends AbstractController{
	
	public StartController(Game game){
		super(game);
		startFoundationsTableau();
	}
	
	private void startFoundationsTableau() {
		for (int numFoundationTableau = 0; numFoundationTableau < 7; numFoundationTableau++) {
			FoundationTableau foundationTableau = new FoundationTableau();
			for (int j = 0; j <= numFoundationTableau; j++) {
				if(j== numFoundationTableau){
					foundationTableau.addCard(new Card(Score.AS, Suit.HEARTS, false));
				}else{
					foundationTableau.addCard(new Card(Score.AS, Suit.HEARTS, true));
				}
			}
			this.getGame().setFoundationTableau(numFoundationTableau, foundationTableau);
		}

		
	}

	public int getSizeDeck(){
		return 24;
	}
	
	public int getSizeWaste(){
		return 0;
	}
	
	public ArrayList<Foundation> getFoundations(){
		ArrayList<Foundation> foundations = new ArrayList<Foundation>();
		for (int i = 0; i < 4; i++) {
			foundations.add(new Foundation(0, Suit.HEARTS));
		}
		return foundations;
	}

	public ArrayList<FoundationTableau> getFoundationsTableau() {
		return this.getGame().getFoundationsTableau();
	}
}
