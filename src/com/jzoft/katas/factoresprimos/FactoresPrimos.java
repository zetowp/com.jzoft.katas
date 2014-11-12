package com.jzoft.katas.factoresprimos;

import java.util.ArrayList;
import java.util.List;

public class FactoresPrimos {

	public List<Integer> buscarFactoresPrimos(int numero) {
		ArrayList<Integer> listaDeFactores = new ArrayList<Integer>();
		if (numero % 2 == 0) {
			listaDeFactores.add(2);
		} else if (numero % 3 == 0) {
			listaDeFactores.add(3);
		}
		return listaDeFactores;
	}

}
