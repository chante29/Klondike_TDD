package miw.klondike;

import java.util.Stack;

import miw.klondike.factory.GenerateRandomsCards;

public class Deck extends StackCards {

	public Deck(Stack<Card> cards) {
		super(cards);
	}
	
	public Deck(int numCards){
		super(GenerateRandomsCards.setStackCardRandom(numCards, true));
	}
}
