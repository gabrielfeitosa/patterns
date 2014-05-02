package com.gabrielfeitosa.teste;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.gabrielfeitosa.factoryMethod.ReceptorCreator;
import com.gabrielfeitosa.interfaces.Receptor;
import com.gabrielfeitosa.negocio.ReceptorEmail;
import com.gabrielfeitosa.negocio.ReceptorSMS;

public class ReceptorTest {

	@Test
	public void envioSMS() {
		Receptor receptor = ReceptorCreator.create(ReceptorCreator.ReceptorEnum.SMS);
		assertTrue(receptor instanceof ReceptorSMS);
	}

	@Test
	public void envioEMAIL() {
		Receptor receptor = ReceptorCreator.create(ReceptorCreator.ReceptorEnum.EMAIL);
		assertTrue(receptor instanceof ReceptorEmail);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void tentativaDeReceberSemDefinirTipo() {
		ReceptorCreator.create(null);
	}
}
