package com.csr.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csr.tech.model.Event;
import com.csr.tech.model.User;

import org.springframework.stereotype.Repository;



@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
	
    public Event findByEventname(String eventname);

}
