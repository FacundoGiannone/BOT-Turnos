package com.Bot.GG.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bot.GG.entity.Servicio;
import com.Bot.GG.iService.IServicioService;
import com.Bot.GG.repository.ServicioRepository;

@Service
public class ServicioService implements IServicioService {
	@Autowired
	private ServicioRepository sRepository;
	
	public List<Servicio> findAllServicio(){
	    return sRepository.findAll();
	};

	public Servicio saveServicio(Servicio servicio){
	    return sRepository.save(servicio);
	};


	public void removeServicio(Servicio servicio){
	    sRepository.delete(servicio);
	};


}
