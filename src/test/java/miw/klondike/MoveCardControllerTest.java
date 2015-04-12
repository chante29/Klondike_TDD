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
		Stack<Card> cardsDeck = new Stack<Card>();
		cardsDeck = createStackRandom(24);
		Stack<Card> cardsWaste = new Stack<Card>();
		cardsWaste = createStackRandom(0);
		Game game = new Game(new Deck(cardsDeck), new Waste(cardsWaste));
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(21, this.moveCardController.getDeck().size());
		assertEquals(3, this.moveCardController.getWaste().size());
		for (Card card : cardsDeck) {
			assertTrue(card.covered());
		}
		for (Card card : cardsWaste) {
			assertFalse(card.covered());
		}
		
		
		Stack<Card> cardsDeck = new Stack<Card>();
		cardsDeck = createStackRandom(0);
		Stack<Card> cardsWaste = new Stack<Card>();
		cardsWaste = createStackRandom(24);
		Game game = new Game(new Deck(cardsDeck), new Waste(cardsWaste));
		this.moveCardController = new MoveCardController(game);
		assertFalse(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(0, this.moveCardController.getDeck().size());
		assertEquals(24, this.moveCardController.getWaste().size());
		for (Card card : cardsDeck) {
			assertTrue(card.covered());
		}
		for (Card card : cardsWaste) {
			assertFalse(card.covered());
		}
		
		Stack<Card> cardsDeck = new Stack<Card>();
		cardsDeck = createStackRandom(1);
		Stack<Card> cardsWaste = new Stack<Card>();
		cardsWaste = createStackRandom(23);
		Game game = new Game(new Deck(cardsDeck), new Waste(cardsWaste));
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(0, this.moveCardController.getDeck().size());
		assertEquals(24, this.moveCardController.getWaste().size());
		for (Card card : cardsDeck) {
			assertTrue(card.covered());
		}
		for (Card card : cardsWaste) {
			assertFalse(card.covered());
		}
		
		
		Stack<Card> cardsDeck = new Stack<Card>();
		cardsDeck = createStackRandom(2);
		Stack<Card> cardsWaste = new Stack<Card>();
		cardsWaste = createStackRandom(22);
		Game game = new Game(new Deck(cardsDeck), new Waste(cardsWaste));
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(0, this.moveCardController.getDeck().size());
		assertEquals(24, this.moveCardController.getWaste().size());
		for (Card card : cardsDeck) {
			assertTrue(card.covered());
		}
		for (Card card : cardsWaste) {
			assertFalse(card.covered());
		}
		
		Stack<Card> cardsDeck = new Stack<Card>();
		cardsDeck = createStackRandom(12);
		Stack<Card> cardsWaste = new Stack<Card>();
		cardsWaste = createStackRandom(12);
		Game game = new Game(new Deck(cardsDeck), new Waste(cardsWaste));
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(9, this.moveCardController.getDeck().size());
		assertEquals(15, this.moveCardController.getWaste().size());
		for (Card card : cardsDeck) {
			assertTrue(card.covered());
		}
		for (Card card : cardsWaste) {
			assertFalse(card.covered());
		}
		
		Stack<Card> cardsDeck = new Stack<Card>();
		cardsDeck = createStackRandom(3);
		Stack<Card> cardsWaste = new Stack<Card>();
		cardsWaste = createStackRandom(21);
		Game game = new Game(new Deck(cardsDeck), new Waste(cardsWaste));
		this.moveCardController = new MoveCardController(game);
		assertTrue(this.moveCardController.moveFromDeckToWaste(game.getDeck(), game.getWaste()));
		assertEquals(0, this.moveCardController.getDeck().size());
		assertEquals(24, this.moveCardController.getWaste().size());
		for (Card card : cardsDeck) {
			assertTrue(card.covered());
		}
		for (Card card : cardsWaste) {
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
