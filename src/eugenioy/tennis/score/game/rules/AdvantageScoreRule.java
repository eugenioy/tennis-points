package eugenioy.tennis.score.game.rules;

import eugenioy.tennis.score.game.GameScore;
import eugenioy.tennis.score.game.Player;

public class AdvantageScoreRule implements GameScoreRule {

	private Player advantagePlayer;
	
	public AdvantageScoreRule(Player advantagePlayer) {
		this.advantagePlayer = advantagePlayer;
	}

	@Override
	public String getScoreAsString(GameScore gameScore) {
		return "Advantage " + advantagePlayer.getRepresentation();
	}

	@Override
	public void pointWonBy(Player player, GameScore gameScore) {
		if (advantagePlayer.equals(player)) {
			gameScore.gameWonBy(advantagePlayer);
		} else {
			gameScore.setScoreRule(new EqualsScoreRule());
		}
	}

}
