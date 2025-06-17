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

import com.Bot.GG.entity.Usuario;
import com.Bot.GG.iService.IUsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
    private IUsuarioService uService;

    @GetMapping
    public List<Usuario> getAllUsuario() {
        return uService.findAllUsuario();
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return uService.saveUsuario(usuario);
    }
    
    @DeleteMapping
    public ResponseEntity<Void> eliminarUsuario(@RequestBody Usuario usuario) {
        uService.removeUsuario(usuario);
        return ResponseEntity.noContent().build(); // 204 No Content
    }

}