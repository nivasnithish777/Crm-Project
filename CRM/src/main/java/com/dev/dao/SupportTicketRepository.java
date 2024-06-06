package com.dev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.SupportTicket;

public interface SupportTicketRepository extends JpaRepository<SupportTicket, Long>{

}
