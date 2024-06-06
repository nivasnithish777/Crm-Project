package com.dev.model;

import jakarta.persistence.*;

@Entity
@Table(name="SupportTicket")
public class SupportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(length=10,  nullable = true)
    private Long id;
    @Column(length=200,  nullable = true)
    private String description;
    @Column(length=200,  nullable = true)
    private String status;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    
	public SupportTicket(Long id, String description, String status, Customer customer) {
		this.id = id;
		this.description = description;
		this.status = status;
		this.customer = customer;
	}
	public Long getId() {
		return id;
	}
	public String getDescription() {
		return description;
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
	public void setDescription(String description) {
		this.description = description;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
    
    

}
