import javax.swing.JOptionPane;

import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Client1 {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Student s = (Student)session.get(Student.class, 101, LockOptions.UPGRADE);
		String str = JOptionPane.showInputDialog("Enter name of user1");
		s.setStudentName(str);
		tx.commit();
		session.close();
		factory.close();

	}

}
