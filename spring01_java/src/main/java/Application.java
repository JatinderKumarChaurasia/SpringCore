import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = context.getBean("customerService", CustomerService.class);
		CustomerService service2 = context.getBean("customerService", CustomerService.class);

		System.out.println("Service  Instance Memory Address:" + service);
		System.out.println("Service 2 Instance Memory Address:" + service2);
		/*
		 * While using SCOPE_SINGLETON
		 * in @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) In CustomerServiceImpl
		 * Result of Above Code Service Instance Memory
		 * Address:com.spring01.service.CustomerServiceImpl@1c72da34 Service 2 Instance
		 * Memory Address:com.spring01.service.CustomerServiceImpl@1c72da34
		 */
		/*
		 * While using SCOPE_PROTOTYPE
		 * in @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) In CustomerServiceImpl
		 * Result of Above Code Service Instance Memory
		 * Address:com.spring01.service.CustomerServiceImpl@1c72da34 Service 2 Instance
		 * Memory Address:com.spring01.service.CustomerServiceImpl@6b0c2d26
		 */
		System.out.println("First Name:" + service.findAll().get(0).getFirstName());
		System.out.println("First Name:" + service2.findAll().get(0).getFirstName());
		System.out.println("Last Name:" + service.findAll().get(0).getLastName());
		// TODO Auto-generated method stub

	}

}
