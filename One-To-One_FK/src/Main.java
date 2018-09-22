import com.sathya.hibernate.dao.OneToOneDAO;
import com.sathya.hibernate.dao.OneToOneDAOFactory;


public class Main {

	public static void main(String[] args) {
		
		OneToOneDAO  dao = OneToOneDAOFactory.getInstance();
		dao.savePassport();

	}

}
