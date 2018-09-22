import com.sathya.hibernate.dao.OneToManyDAO;
import com.sathya.hibernate.dao.OneToManyDAOFactory;


public class Main {

	public static void main(String[] args) {
		
		OneToManyDAO dao = OneToManyDAOFactory.getInstance();
		//dao.saveCustomer();
		
		dao.selectCustomer();
		
	}

}
