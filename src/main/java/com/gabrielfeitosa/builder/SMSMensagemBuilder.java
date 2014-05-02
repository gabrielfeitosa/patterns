package com.gabrielfeitosa.builder;

import com.gabrielfeitosa.interfaces.Mensagem;
import com.gabrielfeitosa.interfaces.MensagemBuilder;
import com.gabrielfeitosa.negocio.SMSMensagem;

public class SMSMensagemBuilder implements MensagemBuilder{

	private String mensagem;
	private String destino;
	
	@Override
	public void buildMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public void buildDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public Mensagem getMensagem() {
		return new SMSMensagem(mensagem, destino);
	}

}
