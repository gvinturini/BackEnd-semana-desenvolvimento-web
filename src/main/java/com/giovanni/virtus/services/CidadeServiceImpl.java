package com.giovanni.virtus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.giovanni.virtus.dao.CidadeDAO;
import com.giovanni.virtus.model.Cidade;
import com.giovanni.virtus.model.Estado;

@Component
public class CidadeServiceImpl implements ICidadeService{
	
	@Autowired
	private CidadeDAO dao;
	
	@Override
	public List<Cidade> getCidadeByEstado(Estado e) {
		// TODO Auto-generated method stub
		return dao.findAllByEstado(e);
	}

	@Override
	public Cidade getCidadeById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}
	
	

}
