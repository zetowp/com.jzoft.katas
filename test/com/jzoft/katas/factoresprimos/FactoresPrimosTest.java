package com.jzoft.katas.factoresprimos;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FactoresPrimosTest {

	private FactoresPrimos factorador;

	@Before
	public void setUp() throws Exception {
		this.factorador = new FactoresPrimos();
	}

	@Test
	public void dadoUno_regresaVacio() throws Exception {
		List<Integer> factores = factorador.buscarFactoresPrimos(1);
		assertEquals(0, factores.size());
	}

	@Test
	public void dadoDos_regresaListaConSoloDos() throws Exception {
		List<Integer> factores = factorador.buscarFactoresPrimos(2);
		assertEquals(1, factores.size());
		assertEquals(2, factores.get(0).byteValue());
	}

	@Test
	public void dadoTres_regresaListaConSoloTres() throws Exception {
		List<Integer> factores = factorador.buscarFactoresPrimos(3);
		assertEquals(1, factores.size());
		assertEquals(3, factores.get(0).byteValue());

	}

}
