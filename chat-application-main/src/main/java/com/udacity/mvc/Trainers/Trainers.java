package com.udacity.mvc.Trainers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainers {
	
		@Id
	   private String id;
	   private String name;	   

	public Trainers(String id, String name) {
		this.id = id;
		this.name = name;
	}	
	
	public Trainers() {
		
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	   
	   
}
