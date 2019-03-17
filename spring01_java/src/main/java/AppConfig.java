import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({ "com.spring01" })
@PropertySource("app.properties")
public class AppConfig {
	
	//Return Instance of app.properties
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	// Autowiring Way
	/*
	 * @Bean("customerService") public CustomerService getCustomerService() {
	 * System.out.println("In Customer Service Using Autowiring  Way");
	 * CustomerServiceImpl service = new CustomerServiceImpl(); //
	 * service.setCustomerRepositoryl(getCustomerRepository()); return service; }
	 * 
	 * /* // Constructor Injection Way
	 * 
	 * @Bean("customerService") public CustomerService getCustomerService() {
	 * System.out.println("In Customer Service Using Constructor Injection Way");
	 * CustomerServiceImpl service = new
	 * CustomerServiceImpl(getCustomerRepository()); return service; }
	 */
	/*
	 * @Bean("customerService") public CustomerService getCustomerService() {
	 * CustomerServiceImpl service = new CustomerServiceImpl();
	 * System.out.println("In Customer Service"); //Using Setter Injection Way
	 * service.setCustomerRepositoryl(getCustomerRepository()); return service; }
	 */
	/*
	 * @Bean("customerRepository") public CustomerRepository getCustomerRepository()
	 * { System.out.println("In Getting Customer Repository"); return new
	 * HibernateCustomerRepositoryImpl(); }
	 */
}
