package com.Bot.GG.iService;

import java.util.List;

import com.Bot.GG.entity.Usuario;


public interface IUsuarioService {
	public List<Usuario> findAllUsuario();
    public Usuario saveUsuario(Usuario usuario);
    public void removeUsuario(Usuario usuario);
    
}
