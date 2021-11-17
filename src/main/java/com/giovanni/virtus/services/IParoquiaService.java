package com.giovanni.virtus.services;

import org.springframework.data.domain.Page;

import com.giovanni.virtus.model.Cidade;
import com.giovanni.virtus.model.Paroquia;

public interface IParoquiaService {

	public Page<Paroquia> getParoquiasPorCidade(Cidade c, int pagina);

	public Paroquia getParoquiasPeloId(int i);
	
	public Paroquia adicionarParoquia(Paroquia novaParoquia);
	public Paroquia atualizarParoquia(Paroquia paroquia);

}
