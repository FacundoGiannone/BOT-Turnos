package com.Bot.GG.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bot.GG.entity.Usuario;
import com.Bot.GG.iService.IUsuarioService;
import com.Bot.GG.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{
	@Autowired
    private UsuarioRepository uRepository;
	
	public List<Usuario> findAllUsuario(){
        return uRepository.findAll();
    };
    
    public Usuario saveUsuario(Usuario usuario){
        return uRepository.save(usuario);
    };
    
    
    public void removeUsuario(Usuario usuario){
        uRepository.delete(usuario);
    };

}
