package com.cognizant.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Customer;
import com.cognizant.repository.CustomerRepository;

@Service(value="customerService")
public class CustomerServicesImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.cognizant.services.CustomerService#save(com.cognizant.model.Customer)
	 */
	@Override
	@Transactional
	public Customer save(Customer customer){
		return customerRepository.save(customer);
	}
	
}
