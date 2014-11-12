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

	private void assertFactoresPrimos(int numeroAEvaluar) {
		List<Integer> factores = factorador.buscarFactoresPrimos(numeroAEvaluar);
		assertEquals(1, factores.size());
		assertEquals(numeroAEvaluar, factores.get(0).byteValue());
	}

	@Test
	public void dadoUno_regresaVacio() throws Exception {
		List<Integer> factores = factorador.buscarFactoresPrimos(1);
		assertEquals(0, factores.size());
	}

	@Test
	public void dadoDos_regresaListaConSoloDos() throws Exception {
		assertFactoresPrimos(2);
	}

	@Test
	public void dadoTres_regresaListaConSoloTres() throws Exception {
		assertFactoresPrimos(3);
	}

}
