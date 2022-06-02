package x3mlabs.game;

public class Card {
	private Suit suit;
	private Rank rank;
	//private KingSuit kingSuit;
	//private KingRank kingRank;

	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
		// this.kingSuit = kingSuit;
		// this.kingRank = kingRank;
	}

	public String getSuit() {
		return suit.printSuit();
	}

	// public String getKingSuit() {
	// return kingSuit.printKingSuit();
	// }

	public int getRank() {
		return rank.getRank();
	}

	// public int getKingRank() {
	// return kingRank.getKingRank();
	// }

	public String toString() {
		String str = "";
		str += rank.getRank() + " of " + suit.printSuit();

	//	str += kingRank.getKingRank() + "of" + kingSuit.printKingSuit();
		return str;
	}

}
