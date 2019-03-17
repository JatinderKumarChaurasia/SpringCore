package com.spring01.service;

import java.util.List;

import com.spring01.model.Customer;
import com.spring01.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	// private CustomerRepository customerRepository = new
	// HibernateCustomerRepositoryImpl;
	private CustomerRepository customerRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring01.service.CustomerService#findAll()
	 */
	public CustomerServiceImpl() {
	}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	/**
	 * @param customerRepository the customerRepository to set ---Setter Injection
	 *                           [to Use Bean]
	 */
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}

/*
 * two way to use bean in our classes Using Constructor Injector using Setter
 * Injector (Same as Getter and Setter)
 */