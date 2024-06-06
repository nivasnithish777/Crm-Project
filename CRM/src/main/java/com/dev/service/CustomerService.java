package com.dev.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.dev.model.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomers();
	
	Customer createCustomer(Customer customer);
	
	ResponseEntity<Customer> updateCustomer(long id,Customer customerDetails);
	
	Map<String, Boolean> deleteCustomer(Long id);

}
