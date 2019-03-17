package com.spring01.repository;

import java.util.List;

import com.spring01.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}