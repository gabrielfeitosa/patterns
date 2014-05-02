package com.gabrielfeitosa.interfaces;

public interface MensagemBuilder {

	void buildMensagem(String mensagem);
	void buildDestino(String destino);
	Mensagem getMensagem();
}
