package com.gabrielfeitosa.composite;

import java.util.ArrayList;
import java.util.List;

import com.gabrielfeitosa.interfaces.Trecho;

public class Caminho implements Trecho{

	private List<Trecho> trechos;
	
	public Caminho() {
		this.trechos = new ArrayList<Trecho>();
	}
	
	public void adicionaTrecho(Trecho trecho){
		this.trechos.add(trecho);
	}
	
	public void removeTrecho(Trecho trecho){
		this.trechos.remove(trecho);
	}
	
	@Override
	public void imprime() {
		for (Trecho trecho : trechos) {
			trecho.imprime();
		}
	}

}
