package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		
		String[] teams = { "Michigan Wolverines", "BYU Cougars", "Texas Longhorns", "LSU Tigers"};
		
		//cannot add to a standard array
		//teams.add("Georgia Bulldogs");
		System.out.println("This is a standard array: " + teams);
		
		//populate list with teams in array
		List<String> teamsList = new ArrayList<String>(Arrays.asList(teams));
		System.out.println("This is a list: " + teamsList);
		teamsList.add("Michigan Wolverines");
		teamsList.add("BYU Cougars");
		System.out.println("List after adding elements: " + teamsList);
		
		//unordered set
		HashSet teamsSet = new HashSet(teamsList);
		System.out.println("This is an unordered Set: " + teamsSet);
		
		//ordered set
		TreeSet teamsTree = new TreeSet(teamsList);
		System.out.println("This is an ordered Set: " + teamsTree);
		teamsList.add("BYU Cougars");
	}
}
