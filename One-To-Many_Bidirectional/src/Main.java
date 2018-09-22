import com.sathya.hibernate.dao.OneToManyBidirectionalDAO;
import com.sathya.hibernate.dao.OneToManyBidirectionalDAOFactory;


public class Main {

	public static void main(String[] args) {
		
		OneToManyBidirectionalDAO dao = OneToManyBidirectionalDAOFactory.getIObject();
		dao.saveItem();

	}

}
