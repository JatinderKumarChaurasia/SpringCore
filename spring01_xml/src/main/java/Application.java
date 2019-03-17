import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring01.service.CustomerService;

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
		// CustomerService service = new CustomerServiceImpl();
		// Way to getBean
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Here customerService is a name in applicationContext bean of CustomerService
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		CustomerService servic2 = appContext.getBean("customerService", CustomerService.class);
		// Singleton which we define it in applicationContext prevent from multiple
		// Instances
		// Checking for Singleton isWorking
		System.out.println("Servic2:First Name:" + servic2);
		System.out.println("Service:First Name:" + service);

		/* When Using Singleton as a scope in applicationContext
		 * Result of Above Code Service:First Servic2:First
		 * Name:com.spring01.service.CustomerServiceImpl@59ec2012 Service:First
		 * Name:com.spring01.service.CustomerServiceImpl@59ec2012
		 */

		/*When Using Prototype as a scope in applicationContext
		 * Result of Above Code when using Prototype Service:First Servic2:First
		 * Name:com.spring01.service.CustomerServiceImpl@59ec2012 Service:First
		 * Name:com.spring01.service.CustomerServiceImpl@4cf777e8
		 */
		System.out.println("Servize:First Name:" + servic2.findAll().get(0).getFirstName());
		System.out.println("First Name:" + service.findAll().get(0).getFirstName());
		System.out.println("Last Name:" + service.findAll().get(0).getLastName());
		// TODO Auto-generated method stub

	}

}
