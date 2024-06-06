package com.dev.model;

import jakarta.persistence.*;


@Entity
@Table(name="SalesPipeline")
public class SalesPipeline {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(length=50,  nullable = true)
    private Long id;
    @Column(length=100,  nullable = true)
    private String stage;
    @Column(length=200,  nullable = true)
    private String description;
    @ManyToOne
    @JoinColumn(name = "lead_id")
    private Lead lead;
    
    
	public SalesPipeline(Long id, String stage, String description, Lead lead) {

		this.id = id;
		this.stage = stage;
		this.description = description;
		this.lead = lead;
	}
	public Long getId() {
		return id;
	}
	public String getStage() {
		return stage;
	}
	public String getDescription() {
		return description;
	}
	public Lead getLead() {
		return lead;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setLead(Lead lead) {
		this.lead = lead;
	}
    
    

}
