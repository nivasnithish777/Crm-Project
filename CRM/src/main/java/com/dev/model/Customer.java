package com.dev.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	@Column(length=10, nullable = true)
	private long id;
	@Column(length=50,  nullable = true)
	private String name;
	@Column(length=50,  nullable = true)
	private String email;
	@Column(length=10,  nullable = true)
	private long phone;
	
	public Customer() {
	}
	
	
	
	public Customer(long id, String name, String email, long phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getPhone() {
		return phone;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	

}
