package com.dev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
