package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Team;

public class DeleteTeam {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Team.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {								
//			int teamId = 1002;
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
//			System.out.println("\nGetting team with id: " + teamId);
//			
//			Team theTeam = session.get(Team.class, teamId);
			
			// delete the student
			// System.out.println("Deleting team: " + myStudent);
			// session.delete(myStudent);
			
			// delete student id=2
			System.out.println("Deleting team with id=1002");
			
			session.createQuery("delete from Team where id=1002").executeUpdate();
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





