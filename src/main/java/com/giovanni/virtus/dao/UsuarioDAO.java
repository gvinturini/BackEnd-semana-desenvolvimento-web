package com.giovanni.virtus.dao;

import org.springframework.data.repository.CrudRepository;

import com.giovanni.virtus.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	public Usuario findByLoginOrEmail(String login, String email);
}
