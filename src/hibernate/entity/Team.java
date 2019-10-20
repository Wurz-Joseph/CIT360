package hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "location")
	private String location;

	@Column(name = "mascot")
	private String mascot;

	@Column(name = "wins")
	private int wins;

	public Team() {

	}

	public Team(String location, String mascot, int wins) {
		this.location = location;
		this.mascot = mascot;
		this.wins = wins;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Team [id=" + id + ", location=" + location + ", mascot=" + mascot + ", wins=" + wins + "]";
	}

}
