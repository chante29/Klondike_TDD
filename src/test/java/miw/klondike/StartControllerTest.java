package miw.klondike;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class StartControllerTest {
	
	private StartController startController;
    
    @Before
    public void before(){
        startController = new StartController();
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
    	for (FoundationTableau foundationTableau : foundationsTableau) {
			assertEquals(0, foundationTableau.size());
		}
    }
    
    
}
