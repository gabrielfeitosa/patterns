package com.gabrielfeitosa.teste;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.gabrielfeitosa.abstractFactory.EMAILComunicadorFactory;
import com.gabrielfeitosa.abstractFactory.SMSComunicadorFactory;
import com.gabrielfeitosa.interfaces.ComunidadorFactory;
import com.gabrielfeitosa.interfaces.Emissor;
import com.gabrielfeitosa.interfaces.Receptor;
import com.gabrielfeitosa.negocio.EmissorEmail;
import com.gabrielfeitosa.negocio.EmissorSMS;
import com.gabrielfeitosa.negocio.ReceptorEmail;
import com.gabrielfeitosa.negocio.ReceptorSMS;


public class ComunicadorFactoryTest {

	private static String mensagem = "Oi!";
	
	@Before
	public void getMensagemParaEnviar(){
		System.out.format("Mensagem para ser enviada: %s \n",mensagem);
	}
	
	private void recebeMensagem(String msgRecebida){
		System.out.format("Mensagem recebida: %s \n",msgRecebida);
	}
	
	@Test
	public void comunicacaoSMS() {
		ComunidadorFactory comunicador = new SMSComunicadorFactory();
		Emissor emissor = comunicador.createEmissor();
		emissor.enviar(mensagem);
		Receptor receptor = comunicador.createReceptor();
		recebeMensagem(receptor.recebe());
		assertTrue(emissor instanceof EmissorSMS);
		assertTrue(receptor instanceof ReceptorSMS);
	}
	
	@Test
	public void comunicacaoEMAIL() {
		ComunidadorFactory comunicador = new EMAILComunicadorFactory();
		Emissor emissor = comunicador.createEmissor();
		emissor.enviar(mensagem);
		Receptor receptor = comunicador.createReceptor();
		recebeMensagem(receptor.recebe());
		assertTrue(emissor instanceof EmissorEmail);
		assertTrue(receptor instanceof ReceptorEmail);
	}

}

