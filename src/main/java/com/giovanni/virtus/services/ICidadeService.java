package com.giovanni.virtus.services;

import java.util.List;

import com.giovanni.virtus.model.Cidade;
import com.giovanni.virtus.model.Estado;

public interface ICidadeService {
	public List<Cidade> getCidadeByEstado(Estado e);

	public Cidade getCidadeById(int id);
}
