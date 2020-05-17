package com.Youcode.Entité;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity

public class Infermier extends User {
	
	

	private String f_name;

	private String l_name;

	private String ref_inf;

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getRef_inf() {
		return ref_inf;
	}

	public void setRef_inf(String ref_inf) {
		this.ref_inf = ref_inf;
	}



	public Infermier(int id, String username, String password, Role role, String f_name, String l_name,
			String ref_inf) {
		super(id, username, password, role);
		this.f_name = f_name;
		this.l_name = l_name;
		this.ref_inf = ref_inf;
	}

	public Infermier() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Infermier [f_name=" + f_name + ", l_name=" + l_name + ", ref_inf=" + ref_inf + "]";
	}

	

	
	 

}
