package com.gabrielfeitosa.negocio;

import com.gabrielfeitosa.interfaces.Trecho;

public class TrechoDeCarro implements Trecho{

	private String direcao;
	private double distancia;

	public TrechoDeCarro(String direcao, double distancia){
		this.direcao = direcao;
		this.distancia = distancia;
		
	}
	
	@Override
	public void imprime() {
		System.out.println("Vá de carro...");
		System.out.println(direcao);
		System.out.println("A distância percorrida será de: "+distancia+" metros.");
	}

}
