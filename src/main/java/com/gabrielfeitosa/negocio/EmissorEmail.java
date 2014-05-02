package com.gabrielfeitosa.negocio;

import com.gabrielfeitosa.interfaces.Emissor;

public class EmissorEmail implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.format("Enviando por EMAIL: %s \n", mensagem);
	}

}
