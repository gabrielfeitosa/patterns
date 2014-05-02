package com.gabrielfeitosa.negocio;

import com.gabrielfeitosa.interfaces.Mensagem;

public class SMSMensagem implements Mensagem{
	
	private String mensagem;
	private String destino;

	public SMSMensagem(String mensagem, String destino) {
		this.mensagem = mensagem;
		this.destino = destino;
	}
	
	@Override
	public String getMensagem() {
		return mensagem;
	}

	@Override
	public String getDestino() {
		return destino;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Mensagem SMS [")
		.append("Mensagem: ").append(getMensagem())
		.append(" , Destino: ").append(getDestino())
		.append("]");
		return sb.toString();
	}
}
