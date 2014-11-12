package com.jzoft.katas.factoresprimos;

import java.util.ArrayList;
import java.util.List;

public class FactoresPrimos {

	public List<Integer> buscarFactoresPrimos(int numero) {
		ArrayList<Integer> listaDeFactores = new ArrayList<Integer>();
		if (numero > 1) {
			listaDeFactores.add(2);
		}
		return listaDeFactores;
	}

}
