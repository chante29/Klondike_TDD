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
		assertTrue(this.moveCardController.moveFromDeckToWaste());
		assertEquals(21, this.moveCardController.getGame().getDeck().size());
		assertEquals(3, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(0), new Waste(24)));
		assertFalse(this.moveCardController.moveFromDeckToWaste());
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(1), new Waste(23)));
		assertTrue(this.moveCardController.moveFromDeckToWaste());
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(2), new Waste(22)));
		assertTrue(this.moveCardController.moveFromDeckToWaste());
		assertEquals(0, this.moveCardController.getGame().getDeck().size());
		assertEquals(24, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(12), new Waste(12)));
		assertTrue(this.moveCardController.moveFromDeckToWaste());
		assertEquals(9, this.moveCardController.getGame().getDeck().size());
		assertEquals(15, this.moveCardController.getGame().getWaste().size());
		for (Card card : this.moveCardController.getGame().getDeck().getCards()) {
			assertTrue(card.covered());
		}
		for (Card card : this.moveCardController.getGame().getWaste().getCards()) {
			assertFalse(card.covered());
		}
		
		
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(21)));
		assertTrue(this.moveCardController.moveFromDeckToWaste());
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
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(0)));
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(4, Suit.DIAMONDS));
		assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		
		//Que no haya cartas en el foundation y waste tenga el as del palo del foundation
		Stack<Card> cardsWaste = new Stack<Card>();
		Card card = new Card(Score.AS, Suit.DIAMONDS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(0, Suit.DIAMONDS));
		assertTrue(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		assertFalse(this.moveCardController.getGame().getFoundation(Suit.DIAMONDS).lookLastCard().covered());
		assertTrue(this.moveCardController.getGame().getFoundation(Suit.DIAMONDS).lookLastCard().equals(card));
		
		//Que no haya cartas en el foundation y waste tenga el as de otro palo del foundation
		cardsWaste = new Stack<Card>();
		card = new Card(Score.AS, Suit.HEARTS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(0, Suit.DIAMONDS));
		assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		assertTrue(this.moveCardController.getGame().getFoundation(Suit.DIAMONDS).lookLastCard() == null);
		
		
		//Que no haya cartas en el foundation y waste tenga una carta del palo del foundation que no sea el as
		cardsWaste = new Stack<Card>();
		card = new Card(Score.ROI, Suit.DIAMONDS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(0, Suit.DIAMONDS));
		assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		assertTrue(this.moveCardController.getGame().getFoundation(Suit.DIAMONDS).lookLastCard() == null);
		
		
		//Que la carta del Waste no sea la consecutiva del palo del foundation
		cardsWaste = new Stack<Card>();
		card = new Card(Score.ROI, Suit.DIAMONDS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(7, Suit.DIAMONDS));
		assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		assertTrue(this.moveCardController.getGame().getFoundation(Suit.DIAMONDS).lookLastCard().equals(new Card(Score.SEVEN, Suit.DIAMONDS, false) ));
		
		
		//Que se cumpla todo para que haya movimiento
		cardsWaste = new Stack<Card>();
		card = new Card(Score.SIX, Suit.DIAMONDS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		this.moveCardController.getGame().setFoundation(Suit.DIAMONDS, new Foundation(5, Suit.DIAMONDS));
		assertTrue(this.moveCardController.moveFromWasteToFoundation(Suit.DIAMONDS));
		assertFalse(this.moveCardController.getGame().getFoundation(Suit.DIAMONDS).lookLastCard().covered());
		assertTrue(this.moveCardController.getGame().getFoundation(Suit.DIAMONDS).lookLastCard().equals(card));
		
		
	}
	
	@Test
	public void moveFromWasteToFoundationTableauTest(){
		//Que no haya cartas en waste
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(0)));
		this.moveCardController.getGame().setFoundationTableau(0, new FoundationTableau());
		assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(0));
		assertTrue(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard() == null);
		
		//Que no haya cartas en FoundationTableau y waste tenga un rey
		Stack<Card> cardsWaste = new Stack<Card>();
		Card card = new Card(Score.ROI, Suit.HEARTS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		this.moveCardController.getGame().setFoundationTableau(0, new FoundationTableau());
		assertTrue(this.moveCardController.moveFromWasteToFoundationTableau(0));
		assertFalse(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard().covered());
		assertTrue(!this.moveCardController.getGame().getFoundationTableau(0).lookLastCard().equals(card));
		
		//Que no haya cartas en FoundationTableau y waste no tenga un rey
		cardsWaste = new Stack<Card>();
		card = new Card(Score.AS, Suit.HEARTS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		this.moveCardController.getGame().setFoundationTableau(0, new FoundationTableau());
		assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(0));
		assertFalse(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard().covered());
		assertTrue(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard() == null);
		
		//Que la carta de waste no sea una inferior, pero sí del mismo color de la de FoundationTableau
		cardsWaste = new Stack<Card>();
		card = new Card(Score.TWO, Suit.HEARTS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		FoundationTableau foundationTableau = new FoundationTableau();
		Card cardFoundationTableau = new Card(Score.ROI, Suit.HEARTS, false);
		foundationTableau.addCard(cardFoundationTableau);
		this.moveCardController.getGame().setFoundationTableau(0, foundationTableau);
		assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(0));
		assertFalse(card.covered());
		assertFalse(cardFoundationTableau.covered());
		assertTrue(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard().equals(cardFoundationTableau));
		
		//Que la carta de waste sea una inferior y del mismo color de la de FoundationTableau
		cardsWaste = new Stack<Card>();
		card = new Card(Score.TWO, Suit.HEARTS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		foundationTableau = new FoundationTableau();
		cardFoundationTableau = new Card(Score.THREE, Suit.DIAMONDS, false);
		foundationTableau.addCard(cardFoundationTableau);
		this.moveCardController.getGame().setFoundationTableau(0, foundationTableau);
		assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(0));
		assertFalse(card.covered());
		assertFalse(cardFoundationTableau.covered());
		assertTrue(this.moveCardController.getGame().getWaste().lookCard(0).equals(card));
		assertTrue(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard().equals(cardFoundationTableau));
		
		//Que la carta de waste sea una inferior y de distinto color de la de FoundationTableau
		cardsWaste = new Stack<Card>();
		card = new Card(Score.TWO, Suit.HEARTS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		foundationTableau = new FoundationTableau();
		cardFoundationTableau = new Card(Score.THREE, Suit.CLUBS, false);
		foundationTableau.addCard(cardFoundationTableau);
		this.moveCardController.getGame().setFoundationTableau(0, foundationTableau);
		assertTrue(this.moveCardController.moveFromWasteToFoundationTableau(0));
		assertFalse(this.moveCardController.getGame().getWaste().lookCard(0) != null && this.moveCardController.getGame().getWaste().lookCard(0).equals(card));
		assertFalse(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard().covered());
		assertTrue(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard().equals(card));
		
		//Que la carta de waste no sea una inferior pero sí de distinto color de la de FoundationTableau
		cardsWaste = new Stack<Card>();
		card = new Card(Score.FOUR, Suit.HEARTS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		foundationTableau = new FoundationTableau();
		cardFoundationTableau = new Card(Score.THREE, Suit.CLUBS, false);
		foundationTableau.addCard(cardFoundationTableau);
		this.moveCardController.getGame().setFoundationTableau(0, foundationTableau);
		assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(0));
		assertFalse(card.covered());
		assertFalse(cardFoundationTableau.covered());
		assertTrue(this.moveCardController.getGame().getWaste().lookCard(0).equals(card));
		assertTrue(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard().equals(cardFoundationTableau));
		
		//Que la carta de FoundationTableau sea un as
		cardsWaste = new Stack<Card>();
		card = new Card(Score.FOUR, Suit.HEARTS, false);
		cardsWaste.add(card);
		this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
		foundationTableau = new FoundationTableau();
		cardFoundationTableau = new Card(Score.AS, Suit.CLUBS, false);
		foundationTableau.addCard(cardFoundationTableau);
		this.moveCardController.getGame().setFoundationTableau(0, foundationTableau);
		assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(0));
		assertFalse(card.covered());
		assertFalse(cardFoundationTableau.covered());
		assertTrue(this.moveCardController.getGame().getWaste().lookCard(0).equals(card));
		assertTrue(this.moveCardController.getGame().getFoundationTableau(0).lookLastCard().equals(cardFoundationTableau));
	}
	
	
}
