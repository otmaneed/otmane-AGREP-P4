package com.Youcode.Entité;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
public class Autre_resource extends Praticien{
	

	private String service;
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	

	public Autre_resource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autre_resource(String service) {
		super();
		this.service = service;
	}

	@Override
	public String toString() {
		return "Autre_resource [service=" + service + "]";
	}


	
}
