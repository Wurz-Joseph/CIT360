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
			System.out.println("Creating new team object...");
			Team theTeam = new Team("Oregon", "Ducks", 661);
						
			// start a transaction
			session.beginTransaction();
			
			// save the team object
			System.out.println("Saving the new team...");
			System.out.println(theTeam);
			session.save(theTeam);
			
			// commit the transaction
			session.getTransaction().commit();
			
			//new code here
			
			//find out the primary key of team
			System.out.println("Saved team generated id of: " + theTeam.getId());
			
			// now get new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on ID: primary key
			System.out.println("\nGetting team with id: " + theTeam.getId());
			
			Team myTeam = session.get(Team.class, theTeam.getId());
			
			System.out.println("Get complete: " + myTeam);
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





