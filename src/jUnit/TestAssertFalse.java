package jUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestAssertFalse {

	//Checks if the aboveMendozaLine methods returns false.
	@Test
	public void test() {
		Ballplayer player = new Ballplayer("Rangers", 119, 600);
		boolean result = player.aboveMendozaLine();
		assertFalse("Test did not return false", result);
		
	}

}
