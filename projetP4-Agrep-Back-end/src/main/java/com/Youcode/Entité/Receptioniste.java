package com.Youcode.Entité;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
public class Receptioniste extends User {
	
	private String f_name;
	private String l_name;

	private String matricule ;

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

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}



	public Receptioniste() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Receptioniste(int id, String username, String password, Role role, String f_name, String l_name,
			String matricule) {
		super(id, username, password, role);
		this.f_name = f_name;
		this.l_name = l_name;
		this.matricule = matricule;
	}

	@Override
	public String toString() {
		return "Receptioniste [f_name=" + f_name + ", l_name=" + l_name + ", matricule=" + matricule + "]";
	}

	


}
