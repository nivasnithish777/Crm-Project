package com.dev.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.model.Customer;
import com.dev.service.CustomerServiceImple;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImple customerservice;
	
	@GetMapping("/AllCustomer")
	private List<Customer> getAllCustomers() {
		return customerservice.getAllCustomers();
	}
	
	@PostMapping("/CreateCustomer")
	private Customer createCustomer(@RequestBody Customer customer) {
		return customerservice.createCustomer(customer);
	}

	@PutMapping("/UpdateCustomer")
	private ResponseEntity<Customer> updateCustomer(@PathVariable long id,@RequestBody Customer customerDetails) {
		return customerservice.updateCustomer(id, customerDetails);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	private Map<String, Boolean> deleteCustomer(@PathVariable long id) {
		return customerservice.deleteCustomer(id);
	}
}
