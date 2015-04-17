package miw.klondike;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import miw.klondike.controller.MoveCardController;
import miw.klondike.enumeration.Score;
import miw.klondike.enumeration.Suit;
import miw.klondike.factory.CardFactory;

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
		for (int numFoundation = 0; numFoundation < 4; numFoundation++) {
	
			// Que no haya cartas en waste
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(0)));
			this.moveCardController.getGame().setFoundation(Suit.valueOf(numFoundation), new Foundation(4, Suit.valueOf(numFoundation)));
			assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.valueOf(numFoundation)));
			
			//Que no haya cartas en el foundation y waste tenga el as del palo del foundation
			Stack<Card> cardsWaste = new Stack<Card>();
			Card card = CardFactory.getCard(Score.AS, Suit.valueOf(numFoundation), false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			this.moveCardController.getGame().setFoundation(Suit.valueOf(numFoundation), new Foundation(0, Suit.valueOf(numFoundation)));
			assertTrue(this.moveCardController.moveFromWasteToFoundation(Suit.valueOf(numFoundation)));
			assertFalse(this.moveCardController.getGame().getFoundation(Suit.valueOf(numFoundation)).lookLastCard().covered());
			assertTrue(this.moveCardController.getGame().getFoundation(Suit.valueOf(numFoundation)).lookLastCard().equals(card));
			
			//Que no haya cartas en el foundation y waste tenga el as de otro palo del foundation
			cardsWaste = new Stack<Card>();
			int numDiferentSuit = numFoundation == 3 ? 2 : numFoundation + 1;
			card = CardFactory.getCard(Score.AS, Suit.valueOf(numDiferentSuit), false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			this.moveCardController.getGame().setFoundation(Suit.valueOf(numFoundation), new Foundation(0, Suit.valueOf(numFoundation)));
			assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.valueOf(numFoundation)));
			assertTrue(this.moveCardController.getGame().getFoundation(Suit.valueOf(numFoundation)).lookLastCard() == null);
			
			
			//Que no haya cartas en el foundation y waste tenga una carta del palo del foundation que no sea el as
			cardsWaste = new Stack<Card>();
			card = CardFactory.getCard(Score.ROI, Suit.valueOf(numFoundation), false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			this.moveCardController.getGame().setFoundation(Suit.valueOf(numFoundation), new Foundation(0, Suit.valueOf(numFoundation)));
			assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.valueOf(numFoundation)));
			assertTrue(this.moveCardController.getGame().getFoundation(Suit.valueOf(numFoundation)).lookLastCard() == null);
			
			
			//Que la carta del Waste no sea la consecutiva del palo del foundation
			cardsWaste = new Stack<Card>();
			card = CardFactory.getCard(Score.ROI, Suit.valueOf(numFoundation), false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			this.moveCardController.getGame().setFoundation(Suit.valueOf(numFoundation), new Foundation(7, Suit.valueOf(numFoundation)));
			assertFalse(this.moveCardController.moveFromWasteToFoundation(Suit.valueOf(numFoundation)));
			assertTrue(this.moveCardController.getGame().getFoundation(Suit.valueOf(numFoundation)).lookLastCard().equals(CardFactory.getCard(Score.SEVEN, Suit.valueOf(numFoundation), false) ));
			
			
			//Que se cumpla todo para que haya movimiento
			cardsWaste = new Stack<Card>();
			card = CardFactory.getCard(Score.SIX, Suit.valueOf(numFoundation), false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			this.moveCardController.getGame().setFoundation(Suit.valueOf(numFoundation), new Foundation(5, Suit.valueOf(numFoundation)));
			assertTrue(this.moveCardController.moveFromWasteToFoundation(Suit.valueOf(numFoundation)));
			assertFalse(this.moveCardController.getGame().getFoundation(Suit.valueOf(numFoundation)).lookLastCard().covered());
			assertTrue(this.moveCardController.getGame().getFoundation(Suit.valueOf(numFoundation)).lookLastCard().equals(card));
		}
		
	}
	
	@Test
	public void moveFromWasteToFoundationTableauTest(){
		for (int numFoundationTableau = 0; numFoundationTableau < 7; numFoundationTableau++) {
			
			//Que no haya cartas en waste
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(0)));
			this.moveCardController.getGame().setFoundationTableau(numFoundationTableau, new FoundationTableau());
			assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(numFoundationTableau));
			assertTrue(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard() == null);
			
			//Que no haya cartas en FoundationTableau y waste tenga un rey
			Stack<Card> cardsWaste = new Stack<Card>();
			Card card = CardFactory.getCard(Score.ROI, Suit.HEARTS, false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			this.moveCardController.getGame().setFoundationTableau(numFoundationTableau, new FoundationTableau());
			assertTrue(this.moveCardController.moveFromWasteToFoundationTableau(numFoundationTableau));
			assertFalse(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard().covered());
			assertTrue(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard().equals(card));
			
			//Que no haya cartas en FoundationTableau y waste no tenga un rey
			cardsWaste = new Stack<Card>();
			card = CardFactory.getCard(Score.AS, Suit.HEARTS, false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			this.moveCardController.getGame().setFoundationTableau(numFoundationTableau, new FoundationTableau());
			assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(numFoundationTableau));
			assertFalse(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard() != null 
					&& this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard().covered());
			assertTrue(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard() == null);
			
			//Que la carta de waste no sea una inferior, pero sí del mismo color de la de FoundationTableau
			cardsWaste = new Stack<Card>();
			card = CardFactory.getCard(Score.TWO, Suit.HEARTS, false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			FoundationTableau foundationTableau = new FoundationTableau();
			Card cardFoundationTableau = CardFactory.getCard(Score.ROI, Suit.HEARTS, false);
			foundationTableau.addCard(cardFoundationTableau);
			this.moveCardController.getGame().setFoundationTableau(numFoundationTableau, foundationTableau);
			assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(numFoundationTableau));
			assertFalse(card.covered());
			assertFalse(cardFoundationTableau.covered());
			assertTrue(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard().equals(cardFoundationTableau));
			
			//Que la carta de waste sea una inferior y del mismo color de la de FoundationTableau
			cardsWaste = new Stack<Card>();
			card = CardFactory.getCard(Score.TWO, Suit.HEARTS, false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			foundationTableau = new FoundationTableau();
			cardFoundationTableau = CardFactory.getCard(Score.THREE, Suit.DIAMONDS, false);
			foundationTableau.addCard(cardFoundationTableau);
			this.moveCardController.getGame().setFoundationTableau(numFoundationTableau, foundationTableau);
			assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(numFoundationTableau));
			assertFalse(card.covered());
			assertFalse(cardFoundationTableau.covered());
			assertTrue(this.moveCardController.getGame().getWaste().lookLastCard().equals(card));
			assertTrue(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard().equals(cardFoundationTableau));
			
			//Que la carta de waste sea una inferior y de distinto color de la de FoundationTableau
			cardsWaste = new Stack<Card>();
			card = CardFactory.getCard(Score.TWO, Suit.HEARTS, false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			foundationTableau = new FoundationTableau();
			cardFoundationTableau = CardFactory.getCard(Score.THREE, Suit.CLUBS, false);
			foundationTableau.addCard(cardFoundationTableau);
			this.moveCardController.getGame().setFoundationTableau(numFoundationTableau, foundationTableau);
			assertTrue(this.moveCardController.moveFromWasteToFoundationTableau(numFoundationTableau));
			assertFalse(this.moveCardController.getGame().getWaste().lookLastCard() != null 
					&& this.moveCardController.getGame().getWaste().lookLastCard().equals(card));
			assertFalse(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard().covered());
			assertTrue(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard().equals(card));
			
			//Que la carta de waste no sea una inferior pero sí de distinto color de la de FoundationTableau
			cardsWaste = new Stack<Card>();
			card = CardFactory.getCard(Score.FOUR, Suit.HEARTS, false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			foundationTableau = new FoundationTableau();
			cardFoundationTableau = CardFactory.getCard(Score.THREE, Suit.CLUBS, false);
			foundationTableau.addCard(cardFoundationTableau);
			this.moveCardController.getGame().setFoundationTableau(numFoundationTableau, foundationTableau);
			assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(numFoundationTableau));
			assertFalse(card.covered());
			assertFalse(cardFoundationTableau.covered());
			assertTrue(this.moveCardController.getGame().getWaste().lookLastCard().equals(card));
			assertTrue(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard().equals(cardFoundationTableau));
			
			//Que la carta de FoundationTableau sea un as
			cardsWaste = new Stack<Card>();
			card = CardFactory.getCard(Score.FOUR, Suit.HEARTS, false);
			cardsWaste.add(card);
			this.moveCardController = new MoveCardController(new Game(new Deck(3), new Waste(cardsWaste)));
			foundationTableau = new FoundationTableau();
			cardFoundationTableau = CardFactory.getCard(Score.AS, Suit.CLUBS, false);
			foundationTableau.addCard(cardFoundationTableau);
			this.moveCardController.getGame().setFoundationTableau(numFoundationTableau, foundationTableau);
			assertFalse(this.moveCardController.moveFromWasteToFoundationTableau(numFoundationTableau));
			assertFalse(card.covered());
			assertFalse(cardFoundationTableau.covered());
			assertTrue(this.moveCardController.getGame().getWaste().lookLastCard().equals(card));
			assertTrue(this.moveCardController.getGame().getFoundationTableau(numFoundationTableau).lookLastCard().equals(cardFoundationTableau));
		}
	}
	
	
}
