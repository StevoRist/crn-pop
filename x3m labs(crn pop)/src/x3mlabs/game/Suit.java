package x3mlabs.game;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), DIAMONDS("Diamonds"), CLUBS("Clubs");

// private field
	private final String suitText;

// private constructor
	private Suit(String suitText) {
		this.suitText = suitText;
	}

// public method
	public String printSuit() {
		return suitText;
	}
}
