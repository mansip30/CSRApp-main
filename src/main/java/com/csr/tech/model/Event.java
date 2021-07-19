package com.csr.tech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String eventname;
	private String eventdescription;
	private String date_of_event;
	private String capacity;
	private String place;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(Long id, String eventname, String eventdescription, String date_of_event, String capacity,
			String place) {
		super();
		this.id = id;
		this.eventname = eventname;
		this.eventdescription = eventdescription;
		this.date_of_event = date_of_event;
		this.capacity = capacity;
		this.place = place;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getEventdescription() {
		return eventdescription;
	}
	public void setEventdescription(String eventdescription) {
		this.eventdescription = eventdescription;
	}
	public String getDate_of_event() {
		return date_of_event;
	}
	public void setDate_of_event(String date_of_event) {
		this.date_of_event = date_of_event;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", eventname=" + eventname + ", eventdescription=" + eventdescription
				+ ", date_of_event=" + date_of_event + ", capacity=" + capacity + ", place=" + place + "]";
	}
	
	

}
