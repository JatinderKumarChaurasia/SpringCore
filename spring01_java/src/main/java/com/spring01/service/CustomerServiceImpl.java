package com.spring01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.spring01.model.Customer;
import com.spring01.repository.CustomerRepository;

@Service("customerService")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope("prototype")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {
	
	//Component Autowired
	//@Autowired
	
	private CustomerRepository customerRepositoryl;
	
	
	/**
	 * 
	 */
	public CustomerServiceImpl() {
		super();
	}


	/**
	 * @param customerRepositoryl
	 */
	
	public CustomerServiceImpl(CustomerRepository customerRepositoryl) {
		super();
		System.out.println("Inside CustomerServiceImpl constructor --> Using Constructor Injection");
		this.customerRepositoryl = customerRepositoryl;
	}


	/**
	 * @param customerRepositoryl the customerRepositoryl to set
	 */
	//For Setter Injector
	@Autowired
	public void setCustomerRepositoryl(CustomerRepository customerRepositoryl) {
		System.out.println("Inside CustomerServiceImpl setter --> Using Setter Injection and autowired");
		this.customerRepositoryl = customerRepositoryl;
	}


	/* (non-Javadoc)
	 * @see com.spring01.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepositoryl.findAll();
	}
}
