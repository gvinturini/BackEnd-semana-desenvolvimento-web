package com.giovanni.virtus;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.giovanni.virtus.dao.EstadoDAO;
import com.giovanni.virtus.model.Estado;
import com.giovanni.virtus.services.IEstadoService;


@SpringBootTest
public class EstadoTests {
	
	@Autowired
	private IEstadoService estadoService;
	
	
	@Test
	public void estadoShouldExist() {
		Estado e = estadoService.getEstadoById(11);
		Assertions.assertNotEquals(e, null);
	}
	
	@Test
	public void shouldReturnTodosOsEstados() {
		List<Estado> estados;
		estados = estadoService.getAllEstados();
		Assertions.assertNotEquals(estados, null);
	}
	
//	@BeforeEach
//	public void setupBanco() {
//		Estado e = new Estado();
//		e.setId(11);
//		e.setNome("Rondonia");
//		e.setUf("RO");
//		System.out.println("GERANDO MEU BANCO FAKE!");
//		Mockito.when(estadoDao.findById(11)).thenReturn(Optional.of(e));
//	}
}
