package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dao.SalesPipelineRepository;
import com.dev.dao.SupportTicketRepository;
import com.dev.model.SalesPipeline;
import com.dev.model.SupportTicket;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @Autowired
    private SalesPipelineRepository salesPipelineRepository;
    @Autowired
    private SupportTicketRepository supportTicketRepository;

    @GetMapping("/sales")
    public List<SalesPipeline> getSalesReport() {
        return salesPipelineRepository.findAll();
    }

    @GetMapping("/support")
    public List<SupportTicket> getSupportReport() {
        return supportTicketRepository.findAll();
    }
}