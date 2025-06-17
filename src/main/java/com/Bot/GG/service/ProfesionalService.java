package com.Bot.GG.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Bot.GG.entity.Profesional;
import com.Bot.GG.iService.IProfesionalService;
import com.Bot.GG.repository.ProfesionalRepository;

@Service
public class ProfesionalService implements IProfesionalService {
	@Autowired
	private ProfesionalRepository pRepository;
	
	public List<Profesional> findAllProfesional(){
	    return pRepository.findAll();
	};

	public Profesional saveProfesional(Profesional profesional){
	    return pRepository.save(profesional);
	};


	public void removeProfesional(Profesional profesional){
	    pRepository.delete(profesional);
	};


};