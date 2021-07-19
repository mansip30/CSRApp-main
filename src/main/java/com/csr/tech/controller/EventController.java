package com.csr.tech.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.csr.tech.model.Event;
import com.csr.tech.repository.EventRepository;
import com.csr.tech.service.EventService;
 
@Controller
public class EventController {
	
	 @Autowired
	    private EventService service;

	    @GetMapping("/events")
	    public String viewHomePage(Model model) {
	        List<Event> listevent = service.listAll();
	        model.addAttribute("listevent", listevent);
	        System.out.print("Get / ");	
	        return "events";
	    }

	    @GetMapping("/newevents")
	    public String add(Model model) {
	        model.addAttribute("event", new Event());
	        return "newevents";
	    }

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveEvent(@ModelAttribute("event") Event events) {
	        service.save(events);
	        return "redirect:/events";
	    }

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditEventPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("newevents");
	        Event events = service.get(id);
	        mav.addObject("event", events);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteevent(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/events";
	    }
}