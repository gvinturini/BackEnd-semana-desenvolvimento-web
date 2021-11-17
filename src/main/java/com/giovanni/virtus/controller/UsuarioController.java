package com.giovanni.virtus.controller;

import javax.lang.model.element.ModuleElement.RequiresDirective;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.giovanni.virtus.model.Usuario;
import com.giovanni.virtus.security.VirtusToken;
import com.giovanni.virtus.security.VirtusTokenUtil;
import com.giovanni.virtus.services.IUsuarioService;

@RestController
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private IUsuarioService service;
	
	@PostMapping("/login")
	public ResponseEntity<VirtusToken> realizarLogin(@RequestBody Usuario dadosLogin) {
		Usuario res = service.recuperarPeloLoginOuEmial(dadosLogin.getLogin(), dadosLogin.getEmail());
		if (res != null) {
			if (res.getSenha().equals(dadosLogin.getSenha())) {
				VirtusToken virtusToken = new VirtusToken();
				virtusToken.setStrToken(VirtusTokenUtil.generateToken(res));
				return  ResponseEntity.ok(virtusToken);
			}
		}
		return ResponseEntity.status(403).build();
	}
}
