package x3mlabs.game;

public enum Rank {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), 
	SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
	ACE(11), JACK(12),QUEEN(13);

	// private field
	private final int rankValue;

	// private constructor
	private Rank(int rankValue) {
		this.rankValue = rankValue;
	}
	// public methods

	public int getRank() {
		return rankValue;

	}
}
