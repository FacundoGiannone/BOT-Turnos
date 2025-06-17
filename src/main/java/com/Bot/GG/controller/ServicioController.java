package com.Bot.GG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bot.GG.entity.Servicio;
import com.Bot.GG.iService.IServicioService;



@RestController
@RequestMapping("/servicio")
public class ServicioController {
	@Autowired
	private IServicioService sService;
	
	@GetMapping
	    public List<Servicio> getAllServicio() {
	        return sService.findAllServicio();
	    }

	@PostMapping
	    public Servicio createServicio(@RequestBody Servicio servicio) {
	        return sService.saveServicio(servicio);
	    }
	
	@DeleteMapping
    public ResponseEntity<Void> eliminarServicio(@RequestBody Servicio servicio) {
        sService.removeServicio(servicio);
        return ResponseEntity.noContent().build(); // 204 No Content
    }

}
