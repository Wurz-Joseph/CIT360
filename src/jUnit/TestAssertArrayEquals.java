package jUnit;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;


public class TestAssertArrayEquals {

	//Tests if the arrays are equal in number and order of elements.
	@Test
	public void test() {
		Ballplayer player = new Ballplayer();
		String [] result = player.lastFiveAtBats("2B", "FC", "BB", "HR", "FO");
		String [] expected = {"2B", "FC", "BB", "HR", "FO"};
		assertArrayEquals(expected, result);
		
	}

}
