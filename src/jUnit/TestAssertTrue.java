package jUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestAssertTrue {

	//Checks if true is returned. If it returns false the message will be displayed.
	@Test
	public void test() {
		Ballplayer player = new Ballplayer("Yankees", 120, 600);
		boolean result = player.aboveMendozaLine();
		assertTrue("Test did not return true", result);
		
	}
}
