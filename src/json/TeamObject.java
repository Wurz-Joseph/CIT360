package json;

public class TeamObject {
	private String location;
	private String mascot;
	private int wins;

	public TeamObject(String location, String mascot, int wins) {
		this.location = location;
		this.mascot = mascot;
		this.wins = wins;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMascot() {
		return mascot;
	}

	public void setMascot(String mascot) {
		this.mascot = mascot;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	@Override
	public String toString() {
		return "TeamObject [location=" + location + ", mascot=" + mascot + ", wins=" + wins + "]";
	}

}
