package miw.klondike.factory;

import java.util.Stack;

import miw.klondike.Card;
import miw.klondike.enumeration.Score;
import miw.klondike.enumeration.Suit;

public class GenerateRandomsCards {
	
	public static Stack<Card> setStackCardRandom(int sizeDeck, boolean covered) {
		Stack<Card> cards = new Stack<Card>();
		for (int num = 0; num < sizeDeck; num++) {
			cards.add(CardFactory.getCard(Score.AS, Suit.HEARTS, covered));
		}
		return cards;
	}
}
