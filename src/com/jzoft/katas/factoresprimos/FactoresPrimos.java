package com.jzoft.katas.factoresprimos;

import java.util.ArrayList;
import java.util.List;

public class FactoresPrimos {

	public List<Integer> buscarFactoresPrimos(int numero) {
		ArrayList<Integer> listaDeFactores = new ArrayList<Integer>();
		for (int primo = 2; primo <= numero; primo++) {
			aniadirPrimo(listaDeFactores, primo, numero);
		}
		return listaDeFactores;
	}

	private void aniadirPrimo(ArrayList<Integer> listaDeFactores, int primo, int numero) {
		if (numero % primo == 0) {
			listaDeFactores.add(primo);
		}
	}

}
