package com.csr.tech.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csr.tech.model.Event;
import com.csr.tech.repository.EventRepository;
import com.csr.tech.repository.*;

	
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;



	@Service
	public class EventService {
		
			@Autowired
			private EventRepository eventrepo;
			
			public List<Event> listAll(){
				return eventrepo.findAll();
			}
			
			public void save(Event events) {
				eventrepo.save(events);
			}
			
			public Event get(long id) {
				return eventrepo.findById(id).get();
			}
			
			public void delete(long id) {
				eventrepo.deleteById(id);
			}
		

	}
