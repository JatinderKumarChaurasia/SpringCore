package com.spring01.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.spring01.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.spring01.repository.CustomerRepository#findAll()
	 */
	@Value("${dbUserName}")
	private String dbUserName;
	/*
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
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
