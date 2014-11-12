package com.jzoft.katas.factoresprimos;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FactoresPrimosTest {
	
	private FactoresPrimos factorador;

	@Test
	public void setUp() throws Exception {
		this.factorador = new FactoresPrimos();
	}
	
	@Test
	public void dadoUno_regresaVacio() throws Exception {
		List<Integer> factores = factorador.buscarFactoresPrimos(1);
		assertEquals(0, factores.size());
	}

}
