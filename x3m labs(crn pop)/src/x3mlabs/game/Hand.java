package x3mlabs.game;

import java.util.ArrayList;

public class Hand {
	public ArrayList<Card> cards;

	public Hand() {
		cards = new ArrayList<Card>();
	}

	public void clear() {
		cards.clear();
	}

	public void add(Card card) {
		cards.add(card);
	}

	public String showHand() {
		String str = "";
		for (Card c : cards) {
			str += "\n" + c.toString() + "\n";

		}
		return str;
	}

	public boolean give(Card card, Hand secondHand) {
		if (!cards.contains(card)) {
			return false;
		} else {
			cards.remove(card);
			secondHand.add(card);
			return true;
		}
	}
}
