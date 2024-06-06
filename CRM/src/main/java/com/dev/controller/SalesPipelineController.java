package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dao.SalesPipelineRepository;
import com.dev.model.SalesPipeline;

@RestController
@RequestMapping("/api/sales-pipelines")
public class SalesPipelineController {
    @Autowired
    private SalesPipelineRepository salesPipelineRepository;

    @GetMapping
    public List<SalesPipeline> getAllSalesPipelines() {
        return salesPipelineRepository.findAll();
    }

    @PostMapping
    public SalesPipeline createSalesPipeline(@RequestBody SalesPipeline salesPipeline) {
        return salesPipelineRepository.save(salesPipeline);
    }
}