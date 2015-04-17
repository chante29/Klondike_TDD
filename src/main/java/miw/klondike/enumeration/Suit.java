package miw.klondike.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum Suit {
	HEARTS(0), DIAMONDS(1), CLUBS(2), SPADES(3);

	private int length;
	
	private static Map<Integer, Suit> map = new HashMap<Integer, Suit>();
	
	static {
	    for (Suit suitEnum : Suit.values()) {
	        map.put(suitEnum.length, suitEnum);
	    }
	}

	private Suit(final int leng) { length = leng; }

	public static Suit valueOf(int legNo) {
	    return map.get(legNo);
	}
}
