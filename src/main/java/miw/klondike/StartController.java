package miw.klondike;

import java.util.ArrayList;

public class StartController {
	private ArrayList<FoundationTableau> foundationsTableau;
	public StartController(){
		startFoundationsTableau();
	}
	
	private void startFoundationsTableau() {
		foundationsTableau = new ArrayList<FoundationTableau>();
		for (int i = 0; i < 7; i++) {
			FoundationTableau foundationTableau = new FoundationTableau();
			foundationsTableau.add(foundationTableau);
			for (int j = 0; j <= i; j++) {
				if(j== i){
					foundationTableau.addCard(new Card(Score.AS, Suit.HEARTS, false));
				}else{
					foundationTableau.addCard(new Card(Score.AS, Suit.HEARTS, true));
				}
			}
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
		return foundationsTableau;
	}
}
