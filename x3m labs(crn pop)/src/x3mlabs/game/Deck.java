package x3mlabs.game;

import java.util.Random;

public class Deck extends Hand {
	public Random rnd = new Random();

	public void populate() {
		// nested loop, first loops through firs suit,gets the values, than through
		// ranks
		// and repeats with all kind of suits and values
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				// for(KingRank kingRank: KingRank.values()) {
				// for(KingSuit kingSuit: KingSuit.values()) {
				Card card = new Card(rank, suit);
				this.add(card);
			}
		}
	}

	// }
	// }
	public void shuffle() {
		for (int i = cards.size() - 1; i > 0; i--) {
			// swap a random card between beginning and the last card of the loop
			int pick = rnd.nextInt(i);
			Card rndCard = cards.get(pick);
			Card lastCard = cards.get(i);
			cards.set(i, rndCard);
			cards.set(pick, lastCard);
		}
	}

	public void deal(Hand[] hands, int perHand) {
		for (int i = 0; i < perHand; i++) {
			for (int j = 0; j < hands.length; j++) {
				this.give(cards.get(0), hands[j]);
			}
		}
	}

}
