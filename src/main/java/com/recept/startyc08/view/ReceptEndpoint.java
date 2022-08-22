package com.recept.startyc08.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recept.startyc08.controller.ReceptService;
import com.recept.startyc08.model.Recept;

@RestController
public class ReceptEndpoint {
	@Autowired
	ReceptService receptService;

	@GetMapping("/uitproberen")
	public String daarGaanWe() {
		System.out.println("Hij doet het");
		receptService.ietsOpslaan();
		return "zie je dit <input>";
	}

	@GetMapping("/uitproberen2")
	public Recept irrelevant() {
		System.out.println("Hij doet het");
		Recept r = new Recept();
		r.setNaam("Macaroni");
		return r;
	}

	@GetMapping("/ietsmeegeven/{mijninput}")
	public String ietsMeegeven(@PathVariable("mijninput") String mijninput) {
		System.out.println("Hij doet het");
		return "Dit is het recept van: " + mijninput;
	}

	@PostMapping("/uitproberen")
	public String andereNaam() {
		System.out.println("hij doet het in de post ");
		return "Dit is de return van mijn post";
	}

	@GetMapping("/geenidee/{geenidee2}")
	public String geenidee3(@PathVariable("geenidee2") String geenidee4) {
		System.out.println("Hij doet het");
		receptService.slaDitNieuweReceptOp(geenidee4);
		return "Dit is het recept van: ";

	}
}