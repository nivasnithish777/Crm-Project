package com.dev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.SalesPipeline;

public interface SalesPipelineRepository extends JpaRepository<SalesPipeline, Long> {

}
