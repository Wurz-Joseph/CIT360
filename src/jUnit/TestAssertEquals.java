package jUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestAssertEquals {

	@Test
	public void test() {
		Ballplayer player = new Ballplayer("Red Sox", 165, 550);
		
		int result = player.calculateAverage();
		
		assertEquals(300, result);
		
	}

}
