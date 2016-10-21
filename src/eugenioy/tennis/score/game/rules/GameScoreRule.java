package eugenioy.tennis.score.game.rules;

import eugenioy.tennis.score.game.GameScore;
import eugenioy.tennis.score.game.Player;

public interface GameScoreRule {

	String getScoreAsString(GameScore gameScore);

	void pointWonBy(Player player, GameScore gameScore);
	
}
