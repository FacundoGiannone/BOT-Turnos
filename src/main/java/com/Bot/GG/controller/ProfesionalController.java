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

import com.Bot.GG.entity.Profesional;
import com.Bot.GG.iService.IProfesionalService;


@RestController
@RequestMapping("/profesional")
@CrossOrigin(origins = "*") 
public class ProfesionalController {
	
	@Autowired
    private IProfesionalService pService;

    @GetMapping
    public List<Profesional> getAllProfesional() {
        return pService.findAllProfesional();
    }

    @PostMapping
    public Profesional createProfesional(@RequestBody Profesional profesional) {
        return pService.saveProfesional(profesional);
    }
    
    @DeleteMapping
    public ResponseEntity<Void> eliminarProfesional(@RequestBody Profesional profesional) {
        pService.removeProfesional(profesional);
        return ResponseEntity.noContent().build(); // 204 No Content
    }


}
