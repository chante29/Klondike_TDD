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
		Game game = new Game(24, 0);
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(21, this.moveCardController.getGame().getDeck().size());
		assertEquals(3, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		game = new Game(0, 24);
		this.moveCardController = new MoveCardController(game);
		assertFalse(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		game = new Game(1, 23);
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		game = new Game(2, 22);
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		game = new Game(12, 12);
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(9, this.moveCardController.getGame().getDeck().size());
		assertEquals(15, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		game = new Game(3, 21);
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
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
