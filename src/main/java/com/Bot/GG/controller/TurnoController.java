package com.Bot.GG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bot.GG.entity.Turno;
import com.Bot.GG.iService.ITurnoService;

@RestController
@RequestMapping("/turno")
@CrossOrigin(origins = "*") 
public class TurnoController {

	@Autowired
	private ITurnoService tService;
	
	@GetMapping
	    public List<Turno> getAllTurno() {
	        return tService.findAllTurno();
	    }

	@PostMapping
	    public Turno createTurno(@RequestBody Turno turno) {
	        return tService.saveTurno(turno);
	    }
	
	@DeleteMapping
    public ResponseEntity<Void> eliminarTurno(@RequestBody Turno turno) {
        tService.removeTurno(turno);
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}
