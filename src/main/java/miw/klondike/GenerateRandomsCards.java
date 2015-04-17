package miw.klondike;

import java.util.Stack;

public class GenerateRandomsCards {
	
	public static Stack<Card> setStackCardRandom(int sizeDeck, boolean covered) {
		Stack<Card> cards = new Stack<Card>();
		for (int num = 0; num < sizeDeck; num++) {
			cards.add(CardFactory.getCard(Score.AS, Suit.HEARTS, covered));
		}
		return cards;
	}
}
