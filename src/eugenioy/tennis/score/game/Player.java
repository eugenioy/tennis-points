package eugenioy.tennis.score.game;

public enum Player {

	PLAYER1("Player 1"), PLAYER2("Player 2");

	private Player opponent;
	private String representation;
	
	static {
		PLAYER1.opponent = PLAYER2;
		PLAYER2.opponent = PLAYER1;
	}
	
	private Player(String representation) {
		this.representation = representation;
	}
	
	public Player getOponent() {
		return opponent;
	}

	public String getRepresentation() {
		return representation;
	}
	
}
