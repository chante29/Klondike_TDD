package miw.klondike;

import java.util.Stack;

public class Waste extends StackCards {
	
	public Waste(Stack<Card> cards) {
		super(cards);
	}
	
	public Waste(int numCards) {
		super(setStackCardRandom(numCards, false));
	}
	
	private static Stack<Card> setStackCardRandom(int sizeDeck, boolean covered) {
		Stack<Card> cards = new Stack<Card>();
		for (int num = 0; num < sizeDeck; num++) {
			cards.add(new Card(Score.AS, Suit.HEARTS, covered));
		}
		return cards;
	}
	
}
