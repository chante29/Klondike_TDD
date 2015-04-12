package miw.klondike;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class MoveCardControllerTest {
	
	private MoveCardController moveCardController;

	@Before
	public void before(){
		
	}
	
	@Test
	public void moveFromDeckToWasteTest(){
		this.moveCardController = new MoveCardController(new Game(new Deck(24), new Waste(0)));
		assertTrue(this.moveCardController.moveFromDeckToWaste(this.moveCardController.getGame().getDeck(), this.moveCardController.getGame().getWaste()));
		assertEquals(21, this.moveCardController.getGame().getDeck().size());
		assertEquals(3, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(0), new Waste(24)));
		assertFalse(this.moveCardController.moveFromDeckToWaste(this.moveCardController.getGame().getDeck(), this.moveCardController.getGame().getWaste()));
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(1), new Waste(23)));
		assertTrue(this.moveCardController.moveFromDeckToWaste(this.moveCardController.getGame().getDeck(), this.moveCardController.getGame().getWaste()));
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(2), new Waste(22)));
		assertTrue(this.moveCardController.moveFromDeckToWaste(this.moveCardController.getGame().getDeck(), this.moveCardController.getGame().getWaste()));
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(12), new Waste(12)));
		assertTrue(this.moveCardController.moveFromDeckToWaste(this.moveCardController.getGame().getDeck(), this.moveCardController.getGame().getWaste()));
		assertEquals(9, this.moveCardController.getGame().getDeck().size());
		assertEquals(15, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(21)));
		assertTrue(this.moveCardController.moveFromDeckToWaste(this.moveCardController.getGame().getDeck(), this.moveCardController.getGame().getWaste()));
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
	
	}
	
	@Test
	public void moveFromWasteToFoundationTest(){
		
	}
	
	@Test
	public void moveFromWasteToFoundationTableauTest(){
		
	}
	
	
}
