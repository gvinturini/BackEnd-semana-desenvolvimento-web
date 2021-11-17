package com.giovanni.virtus.services;

import java.util.List;

import com.giovanni.virtus.model.Estado;

public interface IEstadoService {
	public Estado getEstadoById(int id);

	public List<Estado> getAllEstados();
}
