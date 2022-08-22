package com.recept.startyc08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recept.startyc08.model.Recept;

@Service
public class ReceptService {
	
	@Autowired
	ReceptRepository receptRepository;
	
	public void ietsOpslaan() {
		System.out.println("ik sla iets op in de service");
		receptRepository.save(new Recept());
		receptRepository.findAll();
	}

	public void slaDitNieuweReceptOp(String geenidee4) {
		Recept mijnRecept = new Recept();
		mijnRecept.setNaam(geenidee4);
		receptRepository.save(mijnRecept);
		
	}

}
