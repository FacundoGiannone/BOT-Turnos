package com.Bot.GG.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bot.GG.entity.Turno;
import com.Bot.GG.iService.ITurnoService;
import com.Bot.GG.repository.TurnoRepository;


@Service
public class TurnoService implements ITurnoService{
	@Autowired
    private TurnoRepository tRepository;
	
	public List<Turno> findAllTurno(){
        return tRepository.findAll();
    };
    
    public Turno saveTurno(Turno turno){
        return tRepository.save(turno);
    };
    
    
    public void removeTurno(Turno turno){
        tRepository.delete(turno);
    };

}
