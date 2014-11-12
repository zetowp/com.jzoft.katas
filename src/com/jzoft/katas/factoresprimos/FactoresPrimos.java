package com.jzoft.katas.factoresprimos;

import java.util.ArrayList;
import java.util.List;

public class FactoresPrimos {

	private static final int PRIMER_FACTOR_PRIMO = 2;

	public List<Integer> buscarFactoresPrimos(final int numero) {
		final ArrayList<Integer> listaDeFactores = new ArrayList<Integer>();
		siguientesFatoresPrimos(listaDeFactores, PRIMER_FACTOR_PRIMO, numero);
		return listaDeFactores;
	}

	private void siguientesFatoresPrimos(final ArrayList<Integer> listaDeFactores, final int primo, final int numero) {
		if (primo <= numero) {
			evaluaFactorPrimo(listaDeFactores, primo, numero);
		}
	}

	private void evaluaFactorPrimo(final ArrayList<Integer> listaDeFactores, final int primo, final int numero) {
		if (numero % primo == 0) {
			listaDeFactores.add(primo);
			siguientesFatoresPrimos(listaDeFactores, primo, numero / primo);
		} else {
			siguientesFatoresPrimos(listaDeFactores, primo + 1, numero);
		}
	}

}
