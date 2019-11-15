package jUnit;

import java.util.ArrayList;



public class Ballplayer {
	private String team;
	private int hits;
	private int atBats;
	
	//default constructor
	Ballplayer(){
		
	}
	
	//Ballplayer constructor with team, hit, and atBats.
	Ballplayer(String team, int hits, int atBats) {
		this.team = team;
		this.hits = hits;
		this.atBats = atBats;
	}

	//Calculates the average and casts result to an int to make testing easier.
	public int calculateAverage() {
		int average = (int) (((double)hits / atBats) * 1000);
		return average;
	}

	//Checks if players batting average is 200 or higher and returns true or false.
	public boolean aboveMendozaLine() {
		boolean aboveLine;

		if (calculateAverage() > 199) {
			aboveLine = true;
		} else
			aboveLine = false;
		return aboveLine;
	}
	
	//accepts 5 Strings as input and returns an array of strings
	public String [] lastFiveAtBats(String AB1, String AB2, String AB3, String AB4, String AB5) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add(AB1);
		list1.add(AB2);
		list1.add(AB3);
		list1.add(AB4);
		list1.add(AB5);
		
		return list1.toArray(new String[list1.size()]);
	}
	
	//overloaded lastFiveAtBats method that takes in no arguments
	public String [] lastFiveAtBats() {
		ArrayList<String> list1 = new ArrayList<String>();
		
		
		return list1.toArray(new String[list1.size()]);
	}
	
	//Getters and Setters
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}


	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getAtBats() {
		return atBats;
	}

	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}

	
	
		

}
