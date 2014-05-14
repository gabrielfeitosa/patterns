package com.gabrielfeitosa.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.gabrielfeitosa.adapter.EmissorSMSAdapter;
import com.gabrielfeitosa.negocio.EmissorSMS;

public class EmissorAdapterTest {

	@Test
	public void enviarMensagem() {
		EmissorSMS emissor = new EmissorSMSAdapter();
		emissor.enviar("Teste");
		assertTrue(emissor instanceof EmissorSMSAdapter);
	}

}
