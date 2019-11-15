package jUnit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TestAssertThat {
	
	//assertThat method checks to see if the players average is 333. 
	@Test
	public void test() {
		Ballplayer player = new Ballplayer("Tigers", 200, 600);
		assertThat(player.calculateAverage(), is(333));
	}

}
