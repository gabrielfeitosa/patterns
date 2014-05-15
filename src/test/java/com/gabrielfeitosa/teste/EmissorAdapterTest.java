package com.gabrielfeitosa.teste;

import org.junit.Test;

import com.gabrielfeitosa.adapter.EmissorSMSAdapter;
import com.gabrielfeitosa.negocio.EmissorSMS;

public class EmissorAdapterTest {

	@Test
	public void test() {
		EmissorSMS emissor = new EmissorSMSAdapter();
		emissor.enviar("Teste");
	}

}
