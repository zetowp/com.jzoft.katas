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

	private void assertFactoresPrimos(final int numeroAEvaluar, final int... valores) {
		final List<Integer> factores = factorador.buscarFactoresPrimos(numeroAEvaluar);
		assertEquals(valores.length, factores.size());
		for (int i = 0; i < valores.length; i++) {
			assertEquals(valores[i], factores.get(i).byteValue());
		}
	}

	@Test
	public void dadoUno_regresaVacio() throws Exception {
		assertFactoresPrimos(1);
	}

	@Test
	public void dadoDos_regresaListaConSoloDos() throws Exception {
		assertFactoresPrimos(2, 2);
	}

	@Test
	public void dadoTres_regresaListaConSoloTres() throws Exception {
		assertFactoresPrimos(3, 3);
	}

	@Test
	public void dadoCuatro_regresaDosYDos() throws Exception {
		assertFactoresPrimos(4, 2, 2);
	}

}
