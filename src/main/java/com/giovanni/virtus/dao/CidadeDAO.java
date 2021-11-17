package com.giovanni.virtus.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.giovanni.virtus.model.Cidade;
import com.giovanni.virtus.model.Estado;

public interface CidadeDAO extends CrudRepository<Cidade, Integer>{
	public List<Cidade> findAllByEstado(Estado e);
}
