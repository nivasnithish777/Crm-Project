package com.dev.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Lead")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(length=10,  nullable = true)
    private Long id;
    @Column(length=50,  nullable = true)
    private String name;
    @Column(length=200,  nullable = true)
    private String status;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    
    
	public Lead(Long id, String name, String status, Customer customer) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.customer = customer;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getStatus() {
		return status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
    
    
}