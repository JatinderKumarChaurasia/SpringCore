import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring01.service.CustomerService;

/**
 * @author Jatinder
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println("First Name:" + service.findAll().get(0).getFirstName());
		System.out.println("Last Name:" + service.findAll().get(0).getLastName());
		// TODO Auto-generated method stub

	}

}
