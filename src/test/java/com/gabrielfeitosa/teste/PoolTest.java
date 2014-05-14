package com.gabrielfeitosa.teste;

import org.junit.Test;

import com.gabrielfeitosa.negocio.SMSMensagem;
import com.gabrielfeitosa.pool.Pool;
import com.gabrielfeitosa.pool.SMSPool;

public class PoolTest {

	@Test
	public void resgatarSMSParaEnvio() {
		Pool<SMSMensagem> mensagensPool = new SMSPool();
		SMSMensagem sms = null;
		while((sms = mensagensPool.remover()) != null){
			System.out.println(sms.getMensagem());
		}
	}

}
