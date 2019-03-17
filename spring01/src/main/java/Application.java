import com.spring01.service.CustomerService;
import com.spring01.service.CustomerServiceImpl;

/**
 * 
 */

/**
 * @author Jatinder
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		System.out.println("First Name:" + service.findAll().get(0).getFirstName());
		System.out.println("Last Name:" + service.findAll().get(0).getLastName());
		// TODO Auto-generated method stub

	}

}
