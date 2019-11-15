package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertNull {

	//Checks if the player's team is null
	@Test
	public void test() {
		Ballplayer player = new Ballplayer();
		assertNull(player.getTeam());
		
	}

}
