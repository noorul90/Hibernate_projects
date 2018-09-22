import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Book book = new Book();
		book.setBookId(1101);
		book.setBookName("JAVA");
		book.setPrice(600);
		Transaction tx = session.beginTransaction();
		session.save(book);
		tx.commit();
		session.close();
		factory.close();

	}

}
