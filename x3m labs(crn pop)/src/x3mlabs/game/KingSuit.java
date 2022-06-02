package x3mlabs.game;

public enum KingSuit {
	CLUBS("CLUBS");

	private final String kingSuitText;

	private KingSuit(String kingSuitText) {
		this.kingSuitText = kingSuitText;
	}

	public String printKingSuit() {
		return kingSuitText;
	}

}
