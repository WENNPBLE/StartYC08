package com.recept.startyc08.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.recept.startyc08.model.Recept;

@Component
public interface ReceptRepository extends CrudRepository<Recept, Long> {

}
