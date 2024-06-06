package com.dev.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dev.dao.CustomerRepository;
import com.dev.model.Customer;

@Service
public class CustomerServiceImple implements CustomerService {

	@Autowired
    private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		 return customerRepository.save(customer);
	}



	@Override
	public Map<String, Boolean> deleteCustomer(Long id) {
		Customer customer = customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customer);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
	}

	public ResponseEntity<Customer> updateCustomer(long id, Customer customerDetails) {
		 Customer customer = customerRepository.findById(id).orElseThrow();
	        customer.setName(customerDetails.getName());
	        customer.setEmail(customerDetails.getEmail());
	        customer.setPhone(customerDetails.getPhone());
	        final Customer updatedCustomer = customerRepository.save(customer);
	        return ResponseEntity.ok(updatedCustomer);
	}

	

}
