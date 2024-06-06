	package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dao.SupportTicketRepository;
import com.dev.model.SupportTicket;

@RestController
	@RequestMapping("/api/support-tickets")
	public class SupportTicketController {
	    @Autowired
	    private SupportTicketRepository supportTicketRepository;

	    @GetMapping
	    public List<SupportTicket> getAllSupportTickets() {
	        return supportTicketRepository.findAll();
	    }

	    @PostMapping
	    public SupportTicket createSupportTicket(@RequestBody SupportTicket supportTicket) {
	        return supportTicketRepository.save(supportTicket);
	    }
	}