package com.spring01.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring01.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.spring01.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Shivani");
		customer.setLastName("Sharma");
		customers.add(customer);
		return customers;
	}
}
