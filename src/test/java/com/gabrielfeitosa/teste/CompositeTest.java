package com.gabrielfeitosa.teste;

import org.junit.Test;

import com.gabrielfeitosa.composite.Caminho;
import com.gabrielfeitosa.interfaces.Trecho;
import com.gabrielfeitosa.negocio.TrechoAndando;
import com.gabrielfeitosa.negocio.TrechoDeCarro;

public class CompositeTest {

	@Test
	public void test() {
		Trecho trecho1 = new TrechoAndando("Vá até a esplanada dos ministérios",500) ;
		Trecho trecho2 = new TrechoDeCarro("Vá até a casa de Dilma e tome um cafezinho",1000) ;
		Trecho trecho3 = new TrechoDeCarro ("Vire a direita na sala de jantar para evitar encontrar com ela", 10) ;
		Caminho caminho1 = new Caminho () ;
		caminho1.adicionaTrecho(trecho1);
		caminho1.adicionaTrecho(trecho2);
		System.out.println("Caminho 1 : ") ;
		caminho1.imprime();
		Caminho caminho2 = new Caminho () ;
		caminho2.adicionaTrecho(caminho1);
		caminho2.adicionaTrecho(trecho3);
		System.out.println("---------------") ;
		System.out.println("Caminho 2: ") ;
		caminho2.imprime();
	}

}
