import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Address addr = new Address();
		addr.setHno("2-131");
		addr.setStreet("Ameerpet");
		addr.setCity("HYD");
		
		Employee emp = new Employee();
		emp.setEmployeeId(18156);
		emp.setEmployeeName("RAAJ");
		emp.setAddr(addr);
		
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
	//	factory.close();

	}

}
