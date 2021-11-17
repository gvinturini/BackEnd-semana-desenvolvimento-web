package com.giovanni.virtus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.giovanni.virtus.dao.ParoquiaDAO;
import com.giovanni.virtus.model.Cidade;
import com.giovanni.virtus.model.Paroquia;

@Component
public class ParoquiaServiceImpl implements IParoquiaService{

	@Autowired
	private ParoquiaDAO dao;
	
	@Override
	public Page<Paroquia> getParoquiasPorCidade(Cidade c, int pagina) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pagina, 10);
		return dao.findAllByCidade(c, pageable);
	}

	@Override
	public Paroquia getParoquiasPeloId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public Paroquia adicionarParoquia(Paroquia novaParoquia) {
		// TODO Auto-generated method stub
		return dao.save(novaParoquia);
	}

	@Override
	public Paroquia atualizarParoquia(Paroquia paroquia) {
		// TODO Auto-generated method stub
		return dao.save(paroquia);
	}

}
