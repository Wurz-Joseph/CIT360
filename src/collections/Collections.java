package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {

		String[] teams = { "Michigan Wolverines", "BYU Cougars", "Texas Longhorns", "LSU Tigers" };

		// cannot add to a standard array
		//teams.add("Georgia Bulldogs");
		System.out.println("This is a standard array: " + teams + "\n");

		//populate list with teams in array
		List<String> teamsList = new ArrayList<String>(Arrays.asList(teams));
		
		//print list
		System.out.println("This is a List: " + teamsList + "\n");
		teamsList.add("Michigan Wolverines");
		teamsList.add("BYU Cougars");
		
		//print list with added elements
		System.out.println("List after adding elements: " + teamsList + "\n");
		
		//populate set with list elements. HashSet is an unordered set 
		Set<String> teamsSet = new HashSet<String>(teamsList);
		System.out.println("This is an unsorted Set: " + teamsSet + "\n");
		
		//sorted set
		TreeSet<String> teamsTree = new TreeSet<String>(teamsList);
		System.out.println("This is a sorted Set: " + teamsTree + "\n");
		teamsList.add("BYU Cougars");
		
		//key/value unsorted
		Map<String, Integer> teamHashWins = new HashMap<>();
		teamHashWins.put( "Michigan Wolverines", 956);
		teamHashWins.put( "BYU Cougars", 577);
		teamHashWins.put( "Texas Longhorns", 911);
		teamHashWins.put( "TCU Horned Frogs", 653);
		teamHashWins.put( "Notre Dame Fighting Irish", 900);
		System.out.println("This is an unsorted Map " + teamHashWins + "\n");
		//key/value sorted
		Map<String, Integer> teamTreeWins = new TreeMap<>();
		teamTreeWins.put( "Michigan Wolverines", 956);
		teamTreeWins.put( "BYU Cougars", 577);
		teamTreeWins.put( "Texas Longhorns", 911);
		teamTreeWins.put( "TCU Horned Frogs", 653);
		teamTreeWins.put( "Notre Dame Fighting Irish", 900);
		//no duplicates
		teamTreeWins.put( "Michigan Wolverines", 940);
		
		System.out.println(teamTreeWins);
		//queue
		Queue<Integer> q = new LinkedList<>();
	    for (int i=0; i<10; i++) 
	     q.add(i);

	    // Display contents of the queue. 
	    System.out.println("Elements of queue: "+q); 
	  
	    // Removes first element of queue. 
	    int remove = q.remove(); 
	    System.out.println("removed element: " + remove); 
	  
	    System.out.println(q); 
	
	    int size = q.size(); 
	    System.out.println("Size of queue: " + size); 
		
	}

}
