package x3mlabs.game;

public class Game {

	public static void main(String[] args) {
		Deck d1 = new Deck();
		d1.populate();
		System.out.println("The Deck has these cards: " + d1.showHand());
		d1.shuffle();
		System.out.println("The Deck looks like this after shuffle: " + d1.showHand());
// create hands for 4 players
		Hand h1, h2, h3, h4;
		h1 = new Hand();
		h2 = new Hand();
		h3 = new Hand();
		h4 = new Hand();
		Hand[] hands = { h1, h2, h3, h4 };

		// deal cards to hands(4 players * 12 cards
		// I didn't succeed to implement the 49th card(King of Clubs)
		// if I had done that, one of the players would have 13 cards :(
		d1.deal(hands, 12);
		// show the player hands
		System.out.println("The player's hands will be printed on the console" + "\n"
				+ "starting from the 1st to the 4th, separated by an empty line:");
		for (int i = 0; i < hands.length; i++)
			System.out.println(hands[i].showHand());
	}

}
