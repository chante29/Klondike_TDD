package miw.klondike;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class StartControllerTest {
	
	private StartController startController;
    
    @Before
    public void before(){
        startController = new StartController(new Game(new Deck(24), new Waste(0)));
    }
    
    @Test
    public void getSizeDeckTest() {
    	assertEquals(24, startController.getSizeDeck());
    }
    
    
    @Test
    public void getSizeWasteTest() {
    	assertEquals(0, startController.getSizeWaste());
    }
    
    
    @Test
    public void getFoundationsTest() {
    	ArrayList<Foundation> foundations = startController.getFoundations();
    	assertEquals(4, foundations.size());
    	for (Foundation foundation : foundations) {
			assertEquals(0, foundation.size());
		}
    }
    
    
    @Test
    public void getFoundationsTableauTest() {
    	ArrayList<FoundationTableau> foundationsTableau = startController.getFoundationsTableau();
    	assertEquals(7, foundationsTableau.size());
    	for (int numFoundationTableau = 0; numFoundationTableau < foundationsTableau.size(); numFoundationTableau++) {
			assertEquals(numFoundationTableau + 1, foundationsTableau.get(numFoundationTableau).size());
			Stack<Card> cards = foundationsTableau.get(numFoundationTableau).getCards();
			for (int card = 0; card < cards.size(); card++) {
				if(card != cards.size() - 1){
					assertTrue(foundationsTableau.get(numFoundationTableau).lookCard(card).covered());
				}else {
					assertFalse(foundationsTableau.get(numFoundationTableau).lookCard(card).covered());
				}
			}
		}
    }
    
    
}
