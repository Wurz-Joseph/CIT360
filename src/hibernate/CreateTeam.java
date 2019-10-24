package hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Team;

public class CreateTeam {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Team.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			System.out.println("Creating new student object...");
			//arraylist to store the teams
			List<Team> teamsList = new ArrayList<>();
			
			//create teams objects and add them to arraylist
			teamsList.add(new Team("Michigan", "Wolverines", 958));
			teamsList.add(new Team("Ohio State", "Buckeyes", 917));
			teamsList.add(new Team("Texas", "Longhorns", 912));
			teamsList.add(new Team("Alabama", "Crimson Tide", 911));
			teamsList.add(new Team("Notre Dame", "Fighting Irish", 902));
			teamsList.add(new Team("Oklahoma", "Sooners", 902));
			teamsList.add(new Team("Nebraska", "Cornhuskers", 901));
			teamsList.add(new Team("Penn State", "Lions", 893));
			teamsList.add(new Team("Southern California", "Trojans", 842));
			teamsList.add(new Team("Tennessee", "Volunteers", 840));
			
			// start a transaction
			session.beginTransaction();
			
			// save the team objects
			System.out.println("Saving the student...");
			for(Team teams : teamsList) {
			    session.save(teams);
			}
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





