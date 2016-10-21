package eugenioy.tennis.score.game;

import org.junit.Assert;
import org.junit.Test;


public class GameScoreTest {

	@Test
	public void testScoreStartsInZero() {
		GameScore score = new GameScore();
		Assert.assertEquals("0-0", score.getScoreAsString());
	}

	@Test
	public void testFourPointsWinGame() {
		GameScore score = new GameScore();
		
		score.pointWonBy(Player.PLAYER1);
		score.pointWonBy(Player.PLAYER1);
		score.pointWonBy(Player.PLAYER1);
		
		Assert.assertEquals("40-0", score.getScoreAsString());
		
		score.pointWonBy(Player.PLAYER1);
		
		Assert.assertEquals("0-0", score.getScoreAsString());
	}

	@Test
	public void testThreePointsEachGetsToDeuce() {
		GameScore score = new GameScore();
		
		score.pointWonBy(Player.PLAYER1);
		score.pointWonBy(Player.PLAYER1);
		score.pointWonBy(Player.PLAYER1);
		
		score.pointWonBy(Player.PLAYER2);
		score.pointWonBy(Player.PLAYER2);
		score.pointWonBy(Player.PLAYER2);
		
		Assert.assertEquals("Deuce", score.getScoreAsString());
	}

}
