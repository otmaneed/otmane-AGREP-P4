package com.Youcode.Entité;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Rendez_vous {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id_rdv;
	 
	private int N_ordre;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date jour;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date heure;
	private String Statut;
    
    
    @ManyToOne
	@JoinColumn (name="patient_id",nullable = false)
	private Patient patient;
    
    @ManyToOne
   	@JoinColumn (name="praticien_id",nullable = false)
   	private Praticien praticien;

	public int getId_rdv() {
		return id_rdv;
	}

	public void setId_rdv(int id_rdv) {
		this.id_rdv = id_rdv;
	}

	public int getN_ordre() {
		return N_ordre;
	}

	public void setN_ordre(int n_ordre) {
		N_ordre = n_ordre;
	}

	public Date getJour() {
		return jour;
	}

	public void setJour(Date jour) {
		this.jour = jour;
	}

	public Date getHeure() {
		return heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}

	public String getStatut() {
		return Statut;
	}

	public void setStatut(String statut) {
		Statut = statut;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}



	public Rendez_vous(int id_rdv, int n_ordre, Date jour, Date heure, String statut, Patient patient,
			Praticien praticien) {
		super();
		this.id_rdv = id_rdv;
		N_ordre = n_ordre;
		this.jour = jour;
		this.heure = heure;
		Statut = statut;
		this.patient = patient;
		this.praticien = praticien;
	}

	public Rendez_vous() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rendez_vous [id_rdv=" + id_rdv + ", N_ordre=" + N_ordre + ", jour=" + jour + ", heure=" + heure
				+ ", Statut=" + Statut + ", patient=" + patient + ", praticien=" + praticien + "]";
	}
    
    
}
