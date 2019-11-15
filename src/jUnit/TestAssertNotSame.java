package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertNotSame {

	//Checks that the two objects are different. Even thought they have the exact same values these are two separate objects
	@Test
	public void test() {
		Ballplayer player1 = new Ballplayer("Cubs", 168, 589);
		Ballplayer player2 = new Ballplayer("Cubs", 168, 589);
		
		assertNotSame(player1, player2);
	}

}
