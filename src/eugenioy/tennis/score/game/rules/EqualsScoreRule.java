package eugenioy.tennis.score.game.rules;

import eugenioy.tennis.score.game.GameScore;
import eugenioy.tennis.score.game.Player;

public class EqualsScoreRule implements GameScoreRule {

	@Override
	public String getScoreAsString(GameScore gameScore) {
		return "Deuce";
	}

	@Override
	public void pointWonBy(Player player, GameScore gameScore) {
		gameScore.setScoreRule(new AdvantageScoreRule(player));
	}

}
