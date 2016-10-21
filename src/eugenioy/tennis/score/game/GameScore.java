package eugenioy.tennis.score.game;

import java.util.HashMap;
import java.util.Map;

import eugenioy.tennis.score.game.rules.GameScoreRule;
import eugenioy.tennis.score.game.rules.RegularScoreRule;

public class GameScore {

	private Map<Player, Point> playerScores;
	
	private GameScoreRule currentRule;
	
	public GameScore() {
		this.resetGame();
	}
	
	private void resetGame() {
		currentRule = new RegularScoreRule();
		playerScores = new HashMap<>();
		playerScores.put(Player.PLAYER1, Point.p0);
		playerScores.put(Player.PLAYER2, Point.p0);
	}
	
	public String getScoreAsString() {
		return currentRule.getScoreAsString(this);
	}

	public Point getScoreFor(Player player) {
		return playerScores.get(player);
	}

	public void pointWonBy(Player player) {
		currentRule.pointWonBy(player, this);
	}

	public void gameWonBy(Player player) {
		// TODO: implement set score
		resetGame();
	}

	public void setScoreRule(GameScoreRule scoreRule) {
		this.currentRule = scoreRule;
	}

	public void setPointTo(Player player, Point playerPoint) {
		playerScores.put(player, playerPoint);
	}
	
}
