package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Team;

public class ReadTeam {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Team.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create a student object
			System.out.println("Creating new student object...");
			Team tempTeam= new Team("Oregon", "Ducks", 661);
						
			// find out the team's id: primary key
			System.out.println("Saved team. Generated id: " + tempTeam.getId());
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve team based on the id: primary key
			System.out.println("\nGetting team with id: " + tempTeam.getId());
			
			Team theTeam = session.get(Team.class, tempTeam.getId());
			
			System.out.println("Get complete: " + theTeam);
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





