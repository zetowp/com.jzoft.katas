package com.jzoft.katas.factoresprimos;

import java.util.ArrayList;
import java.util.List;

public class FactoresPrimos {

	public List<Integer> buscarFactoresPrimos(final int numero) {
		int aEvaluar = numero;
		final ArrayList<Integer> listaDeFactores = new ArrayList<Integer>();
		for (int primo = 2; primo <= aEvaluar;) {
			if (numero % primo == 0) {
				listaDeFactores.add(primo);
				aEvaluar = aEvaluar / primo;
			} else {
				primo++;
			}
		}
		return listaDeFactores;
	}

}
