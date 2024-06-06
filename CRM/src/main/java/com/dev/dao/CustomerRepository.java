package com.dev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	

}
