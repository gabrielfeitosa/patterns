package com.gabrielfeitosa.negocio;

import com.gabrielfeitosa.interfaces.Receptor;

public class ReceptorEmail implements Receptor{

	@Override
	public String recebe() {
		System.out.println("Recebendo retorno do EMAIL.");
		return "Mensagem de retorno do EMAIL.";
	}

}
