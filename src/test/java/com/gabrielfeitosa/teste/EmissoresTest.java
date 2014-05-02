package com.gabrielfeitosa.teste;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.gabrielfeitosa.factoryMethod.EmissorCreator;
import com.gabrielfeitosa.interfaces.Emissor;
import com.gabrielfeitosa.negocio.EmissorEmail;
import com.gabrielfeitosa.negocio.EmissorSMS;

public class EmissoresTest {

	private static String mensagem = "Oi.";
	@Test
	public void envioSMS() {
		Emissor emissor = EmissorCreator.create(EmissorCreator.EmissorEnum.SMS);
		emissor.enviar(mensagem);
		assertTrue(emissor instanceof EmissorSMS);
	}

	@Test
	public void envioEMAIL() {
		Emissor emissor = EmissorCreator.create(EmissorCreator.EmissorEnum.EMAIL);
		emissor.enviar(mensagem);
		assertTrue(emissor instanceof EmissorEmail);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void tentativaDeEnvioSemDefinirTipo() {
		EmissorCreator.create(null);
	}
}
