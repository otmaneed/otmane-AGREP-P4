package com.Youcode.Entité;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Specialite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String S_name;
	

	private String refrence;
	
	
	@OneToMany(mappedBy="spec",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonIgnore
	private List <Medcin> medcin;





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getS_name() {
		return S_name;
	}


	public void setS_name(String s_name) {
		S_name = s_name;
	}


	public String getRefrence() {
		return refrence;
	}


	public void setRefrence(String refrence) {
		this.refrence = refrence;
	}


	public List<Medcin> getMedcin() {
		return medcin;
	}


	public void setMedcin(List<Medcin> medcin) {
		this.medcin = medcin;
	}




	public Specialite(int id, String s_name, String refrence, List<Medcin> medcin) {
		super();
		this.id = id;
		S_name = s_name;
		this.refrence = refrence;
		this.medcin = medcin;
	}


	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Specialite [id=" + id + ", S_name=" + S_name + ", refrence=" + refrence + ", medcin=" + medcin
				+ "]";
	}
	
	
	
}
