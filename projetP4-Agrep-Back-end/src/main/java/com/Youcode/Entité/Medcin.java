
package com.Youcode.Entité;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
public class Medcin extends Praticien{
	
	 private String ref_med;

	 private boolean dispo;
	 
	 @ManyToOne
		@JoinColumn (name="spec_id",nullable = false)
		private Specialite spec;

	public String getRef_med() {
		return ref_med;
	}

	public void setRef_med(String ref_med) {
		this.ref_med = ref_med;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public Specialite getSpec() {
		return spec;
	}

	public void setSpec(Specialite spec) {
		this.spec = spec;
	}



	public Medcin() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Medcin(String ref_med, boolean dispo, Specialite spec) {
		super();
		this.ref_med = ref_med;
		this.dispo = dispo;
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "Medcin [ref_med=" + ref_med + ", dispo=" + dispo + ", spec=" + spec + "]";
	}

	

	 
}
