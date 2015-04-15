package miw.klondike;

import java.util.Stack;

public class Deck extends StackCards {

	public Deck(Stack<Card> cards) {
		super(cards);
	}
	
	public Deck(int numCards){
		super(setStackCardRandom(numCards, true));
	}
	
	private static Stack<Card> setStackCardRandom(int sizeDeck, boolean covered) {
		Stack<Card> cards = new Stack<Card>();
		for (int num = 0; num < sizeDeck; num++) {
			cards.add(CardFactory.getCard(Score.AS, Suit.HEARTS, covered));
		}
		return cards;
	}
	
}
