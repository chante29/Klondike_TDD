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
		// Que no haya cartas en waste
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(21)));
		Stack<Card> cardsWaste = new Stack<Card>();
		this.moveCardController.getGame().setWaste(cardsWaste);
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(4, Suit.DIAMONDS));
		assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		
		//Que no haya cartas en el foundation y waste tenga el as del palo del foundation
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(21)));
		cardsWaste = new Stack<Card>();
		cardsWaste.add(new Card(Score.AS, Suit.DIAMONDS, true));
		this.moveCardController.getGame().setWaste(cardsWaste);
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(0, Suit.DIAMONDS));
		assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		
		//Que no haya cartas en el foundation y waste tenga el as de otro palo del foundation
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(21)));
		cardsWaste = new Stack<Card>();
		cardsWaste.add(new Card(Score.AS, Suit.HEARTS, true));
		this.moveCardController.getGame().setWaste(cardsWaste);
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(0, Suit.DIAMONDS));
		assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		
		//Que no haya cartas en el foundation y waste tenga una carta del palo del foundation que no sea el as
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(21)));
		cardsWaste = new Stack<Card>();
		cardsWaste.add(new Card(Score.ROI, Suit.DIAMONDS, true));
		this.moveCardController.getGame().setWaste(cardsWaste);
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(0, Suit.DIAMONDS));
		assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		
		//Que la carta del Waste no sea la consecutiva del palo del foundation
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(21)));
		cardsWaste = new Stack<Card>();
		cardsWaste.add(new Card(Score.ROI, Suit.DIAMONDS, true));
		this.moveCardController.getGame().setWaste(cardsWaste);
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(7, Suit.DIAMONDS));
		assertTrue(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		
		//Que se cumpla todo para que haya movimiento
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(21)));
		cardsWaste = new Stack<Card>();
		cardsWaste.add(new Card(Score.SIX, Suit.DIAMONDS, true));
		this.moveCardController.getGame().setWaste(cardsWaste);
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(5, Suit.DIAMONDS));
		assertTrue(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		
		
	}
	
	@Test
	public void moveFromWasteToFoundationTableauTest(){
		
	}
	
	
}
