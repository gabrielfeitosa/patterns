package com.gabrielfeitosa.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.gabrielfeitosa.builder.EmailMensagemBuilder;
import com.gabrielfeitosa.builder.GeradorMensagem;
import com.gabrielfeitosa.builder.SMSMensagemBuilder;
import com.gabrielfeitosa.interfaces.Mensagem;
import com.gabrielfeitosa.interfaces.MensagemBuilder;
import com.gabrielfeitosa.negocio.SMSMensagem;

public class MensagemBuilderTest {

	@Test
	public void mensagemBuilderSMS() {
		MensagemBuilder mensagemBuilder = new SMSMensagemBuilder();
		GeradorMensagem gerador = new GeradorMensagem(mensagemBuilder);
		Mensagem mensagem = gerador.gerarMensagem("Oi!", "98765321");
		System.out.println(mensagem);
		assertTrue(mensagem instanceof SMSMensagem);
	}

	@Test
	public void mensagemBuilderEmail() {
		MensagemBuilder mensagemBuilder = new EmailMensagemBuilder();
		GeradorMensagem gerador = new GeradorMensagem(mensagemBuilder);
		Mensagem mensagem = gerador.gerarMensagem("Oi!", "gabfeitosa@gmail.com");
		System.out.println(mensagem);
		assertTrue(mensagem instanceof SMSMensagem);
	}
}
