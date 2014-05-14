package com.gabrielfeitosa.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.gabrielfeitosa.singleton.Configuracao;

public class ConfiguracaoTest {

	@Test
	public void verificaSeInstanciaUnica() {
		Configuracao conf1 = Configuracao.getInstance();
		Configuracao conf2 = Configuracao.getInstance();
		assertTrue(conf1 == conf2);
	}

}
