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

	private void assertNumeroGeneraFactoresPrimos(final int numeroAEvaluar, final int... valores) {
		final List<Integer> factores = factorador.buscarFactoresPrimos(numeroAEvaluar);
		assertEquals(valores.length, factores.size());
		for (int i = 0; i < valores.length; i++) {
			assertEquals(valores[i], factores.get(i).byteValue());
		}
	}

	@Test
	public void dadoNumero_regresaSusFacotresPrimos() throws Exception {
		assertNumeroGeneraFactoresPrimos(1);
		assertNumeroGeneraFactoresPrimos(2, 2);
		assertNumeroGeneraFactoresPrimos(3, 3);
		assertNumeroGeneraFactoresPrimos(4, 2, 2);
		assertNumeroGeneraFactoresPrimos(5, 5);
		assertNumeroGeneraFactoresPrimos(6, 2, 3);
	}

}
