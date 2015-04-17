package miw.klondike;

import java.util.Stack;

import miw.klondike.factory.GenerateRandomsCards;

public class Waste extends StackCards {
	
	public Waste(Stack<Card> cards) {
		super(cards);
	}
	
	public Waste(int numCards) {
		super(GenerateRandomsCards.setStackCardRandom(numCards, false));
	}	
}
