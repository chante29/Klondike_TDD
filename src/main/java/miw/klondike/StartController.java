package miw.klondike;

import java.util.ArrayList;

public class StartController {

	public StartController(){
		
	}
	
	public int getSizeDeck(){
		return 24;
	}
	
	public int getSizeWaste(){
		return 0;
	}
	
	public ArrayList<Foundation> getFoundations(){
		ArrayList<Foundation> foundations = new ArrayList<Foundation>();
		for (int i = 0; i < 7; i++) {
			foundations.add(new Foundation());
		}
		return foundations;
	}
	
	public ArrayList<FoundationTableau> getFoundationsTableau() {
		ArrayList<FoundationTableau> foundationsTableau = new ArrayList<FoundationTableau>();
		for (int i = 0; i < 7; i++) {
			foundationsTableau.add(new FoundationTableau());
		}
		return foundationsTableau;
	}
}
