package com.giovanni.virtus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.giovanni.virtus.dao.UsuarioDAO;
import com.giovanni.virtus.model.Usuario;

@Component
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private UsuarioDAO dao;
	
	@Override
	public Usuario recuperarPeloLoginOuEmial(String login, String email) {
		// TODO Auto-generated method stub
		Usuario resUsuario =  dao.findByLoginOrEmail(login, email);
		return resUsuario;
	}

}
