package com.giovanni.virtus.services;

import com.giovanni.virtus.model.Usuario;

public interface IUsuarioService {
	public Usuario recuperarPeloLoginOuEmial(String login, String email); 
}
