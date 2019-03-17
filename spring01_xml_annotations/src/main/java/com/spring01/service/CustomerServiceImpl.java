package com.spring01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring01.model.Customer;
import com.spring01.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// Member Level Annotation Injection
	// @Autowired
	private CustomerRepository customerRepository;

	/**
	 * @param customerRepository
	 */
	//Constructor Level Annotation Injection 
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("Constructor Injection Way");
		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring01.service.CustomerService#findAll()
	 */

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	/**
	 * @param customerRepository the customerRepository to set
	 */
	// Setter Level Annotation Injection
	// @Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter Injection Way");
		this.customerRepository = customerRepository;
	}
}
