package com.gabrielfeitosa.teste;

import org.junit.Test;

import com.gabrielfeitosa.observer.Acao;
import com.gabrielfeitosa.observer.Corretora;

public class ObserverTest {

	@Test
	public void test() {
		Acao acao1 = new Acao("AC1", 100);
		Acao acao2 = new Acao("AC2", 54.3);
		
		Corretora corretora1 = new Corretora("Corretora 1");
		Corretora corretora2 = new Corretora("Corretora 2");
		
		acao1.registrarInteressado(corretora1);
		acao1.registrarInteressado(corretora2);
		
		acao2.registrarInteressado(corretora2);
		acao1.setValor(10);
		
		acao2.setValor(100);
		
		acao1.cancelarInteressa(corretora1);
		
		acao1.setValor(1000);
		
	}

}
