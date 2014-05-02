package com.gabrielfeitosa.negocio;

import com.gabrielfeitosa.interfaces.Mensagem;

public class EmailMensagem implements Mensagem{
	
	private String mensagem;
	private String destino;

	public EmailMensagem(String mensagem, String destino) {
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
		sb.append("Mensagem EMAIL [")
		.append("Mensagem: ").append(getMensagem())
		.append(" , Destino: ").append(getDestino())
		.append("]");
		return sb.toString();
	}
}
