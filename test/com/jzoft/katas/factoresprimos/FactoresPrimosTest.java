package com.jzoft.katas.factoresprimos;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FactoresPrimosTest {
	
	@Test
	public void setUp() throws Exception {
		FactoresPrimos factorador = new FactoresPrimos();
		assertNotNull(factorador);
	}
	
	@Test
	public void dadoUno_regresaVacio() throws Exception {
		FactoresPrimos factorador = new FactoresPrimos();
		List<Integer> factores = factorador.buscarFactoresPrimos(1);
		assertEquals(0, factores.size());
	}

}
