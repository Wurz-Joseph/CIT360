package jUnit;

public class JUnitMain {

	public static void main(String[] args) {
		Ballplayer player = new Ballplayer("Texas", 200, 600);
		System.out.println(player.calculateAverage());
		System.out.println(player.aboveMendozaLine());
	}

}
