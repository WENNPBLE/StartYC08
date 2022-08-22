package com.recept.startyc08.model;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id; 
	
	
	private String naam;
	private String omschrijving; 
	private String ingredienten;
	private int bereidingtijd;
	private LocalDateTime aanmaakTijdstip;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	public String getIngredienten() {
		return ingredienten;
	}
	public void setIngredienten(String ingredienten) {
		this.ingredienten = ingredienten;
	}
	public int getBereidingtijd() {
		return bereidingtijd;
	}
	public void setBereidingtijd(int bereidingtijd) {
		this.bereidingtijd = bereidingtijd;
	}
	public LocalDateTime getAanmaakTijdstip() {
		return aanmaakTijdstip;
	}
	public void setAanmaakTijdstip(LocalDateTime aanmaakTijdstip) {
		this.aanmaakTijdstip = aanmaakTijdstip;
	}
	
	

}
