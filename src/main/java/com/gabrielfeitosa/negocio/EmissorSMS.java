package com.gabrielfeitosa.negocio;

import com.gabrielfeitosa.interfaces.Emissor;

public class EmissorSMS implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.format("Enviando por SMS: %s \n",mensagem);
	}

}
