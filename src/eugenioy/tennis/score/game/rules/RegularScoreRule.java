package eugenioy.tennis.score.game.rules;

import eugenioy.tennis.score.game.GameScore;
import eugenioy.tennis.score.game.Player;
import eugenioy.tennis.score.game.Point;

public class RegularScoreRule implements GameScoreRule {

	@Override
	public String getScoreAsString(GameScore score) {
		String score1Str = score.getScoreFor(Player.PLAYER1).getRepresentation();
		String score2Str = score.getScoreFor(Player.PLAYER2).getRepresentation();
		return score1Str + "-" + score2Str;
	}

	@Override
	public void pointWonBy(Player player, GameScore gameScore) {
		// game point + point = game won
		if (gameScore.getScoreFor(player).isGamePoint()) {
			gameScore.gameWonBy(player);
			return;
		}
		Point nextPlayerPoint = gameScore.getScoreFor(player).getNext();
		Point currentOponentPoint = gameScore.getScoreFor(player.getOponent());
		// are both in game point? then we no longer handle this
		if (nextPlayerPoint.isGamePoint() && currentOponentPoint.isGamePoint()) {
			gameScore.setScoreRule(new EqualsScoreRule());
			return;
		}
		gameScore.setPointTo(player, nextPlayerPoint);
	}

}
