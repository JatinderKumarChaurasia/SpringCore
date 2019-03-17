package com.spring01.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.spring01.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUserName}")
	private String dbUserName;

	/* (non-Javadoc)
	 * @see com.spring01.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		System.out.println(dbUserName);
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Shivani");
		customer.setLastName("Sharma");
		customers.add(customer);
		return customers;
	}
}
