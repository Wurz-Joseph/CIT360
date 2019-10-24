package hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Team;

public class QueryTeam {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Team.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			// query all teams
//			List<Team> theTeams = session.createQuery("from Team").list();
//			
//			// display the teams
//			displayTeams(theTeams);
			
			// query teams with > 900 wins
			List<Team> topTeams = session.createQuery("from Team t where t.wins > 900").list();
			
			// display the teams
			System.out.println("\n\nTeams who have more than 900 wins");
			displayTeams(topTeams);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayTeams(List<Team> theTeams) {
		for (Team tempTeam : theTeams) {
			System.out.println(tempTeam);
		}
	}

}





