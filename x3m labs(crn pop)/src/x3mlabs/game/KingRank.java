package x3mlabs.game;

public enum KingRank {
	KING(14);

	private final int kingRankValue;

	private KingRank(int kingRankValue) {
		this.kingRankValue = kingRankValue;
	}

	public int getKingRank() {
		return kingRankValue;
	}

}
