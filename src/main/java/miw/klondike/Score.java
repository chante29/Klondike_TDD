package miw.klondike;

import java.util.HashMap;
import java.util.Map;

public enum Score {
	AS(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), VALET(11), DAME(12), ROI(13);
	
	private Integer length;
	
	private static Map<Integer, Score> map = new HashMap<Integer, Score>();
	
	static {
	    for (Score scoreEnum : Score.values()) {
	        map.put(scoreEnum.length, scoreEnum);
	    }
	}

	private Score(Integer leng) { length = leng; }

	public static Score valueOf(Integer ordinal) {
	    return map.get(ordinal);
	}
}
