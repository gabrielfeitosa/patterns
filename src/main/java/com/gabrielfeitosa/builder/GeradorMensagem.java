package com.gabrielfeitosa.builder;

import com.gabrielfeitosa.interfaces.Mensagem;
import com.gabrielfeitosa.interfaces.MensagemBuilder;

public class GeradorMensagem {

	private MensagemBuilder mensagemBuilder;
	
	public GeradorMensagem(MensagemBuilder mensagemBuilder){
		this.mensagemBuilder = mensagemBuilder;
	}
	
	public Mensagem gerarMensagem(String mensagem,String destino){
		this.mensagemBuilder.buildDestino(destino);
		this.mensagemBuilder.buildMensagem(mensagem);
		return mensagemBuilder.getMensagem();
	}
}
